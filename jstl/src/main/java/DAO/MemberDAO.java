package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import DTO.MemberDTO;

public class MemberDAO extends DBConnect{ // ȸ�� ���� �����ͺ��̽� �۾� �ϴ� Ŭ����
	public void save(MemberDTO member) { // ȸ������ ���� member ���̺� ����
		//�θ�Ŭ������ ������ �޼��� ���� ���� �׷��� connect() �޼��� �����ؼ� �����ͺ��̽� ����
		String sql = "insert into member(user_id, user_password, user_email, user_name) values(?,?,?,?)";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, member.getUserId());
			pt.setString(2, member.getUserPassword());
			pt.setString(3, member.getUserEmail());
			pt.setString(4, member.getUserName());
			pt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("member ���̺� ���� ����");
		}
		
	}
	public boolean login(String id, String pw) {
		String sql = "select * from member where user_id=? and user_password=?";
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, pw);
			rs = pt.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	//�ڹٿ��� ���̵�, ��й�ȣ ��
/*
	public boolean login(String id, String pw) {
		String sql = "select * from member";
		rs = null;
		
		ArrayList<MemberDTO> list = new ArrayList<>();
		try{
			pt=conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while(rs.next()) {
				list.add(new MemberDTO(rs.getString("user_id"), rs.getString("user_password")));
			}
		}catch(SQLException e) {
			System.out.println("��ȸ ����");
		}
		
		if(!list.isEmpty()) {
			for(MemberDTO m : list) {
				if(m.getUserId().equals(id)) {
					if(m.getUserPassword().equals(pw)) {
						return true;
					}
				}
					
			}
		}
		
		return false;
	}
*/
}
