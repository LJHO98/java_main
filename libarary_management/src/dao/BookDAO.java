package dao;

import java.sql.SQLException;

import dto.MemberDTO;

public class BookDAO extends DBConnect{
	public void rental(String code, String member) {
		String checkSql = "update book set is_rental = ?";
		String memberSql = "update book set membership_num = ?";
		if( check(code)) {
			try {
				pt = conn.prepareStatement(checkSql);
				pt.setBoolean(1, true);
				pt.executeUpdate();
				
				pt = conn.prepareStatement(memberSql);
				pt.setString(1, member);
				pt.executeUpdate();
				
				
			} catch (SQLException e) {
				System.out.println("�뿩���� ������Ʈ ����");
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println("�뿩 �Ұ���");
		}
	}
	
	public void returnBook() {
		
	}
	
	
	
	private boolean check(String code) {
		String sql = "select * from book where code=?";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, code);
			rs = pt.executeQuery();
			if(rs.next()) {
				if(!rs.getBoolean("is_rental")) {
					return true;
				}
			}
			
		} catch (SQLException e) {
			System.out.println("book ���̺� ��ȸ ����");
			e.printStackTrace();
		}
		return false;
	}
	
	
}
