package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import DTO.MemberDTO;

public class MemberDAO extends DBConnect{ // 회원 관련 데이터베이스 작업 하는 클래스
	public void save(MemberDTO member) { // 회원가입 내용 member 테이블에 저장
		//부모클래스의 생성자 메서드 먼저 실행 그래서 connect() 메서드 실행해서 데이터베이스 접속
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
			System.out.println("member 테이블 저장 실패");
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
	
	
	
	
	//자바에서 아이디, 비밀번호 비교
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
			System.out.println("조회 실패");
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
