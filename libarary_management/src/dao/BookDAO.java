package dao;

import java.sql.SQLException;

import dto.MemberDTO;

public class BookDAO extends DBConnect{
	public void rental(String code, String member) {
		String bookSql = "update book set is_rental = ?";
		String memberSql = "insert into member (membership_num, book_code) values (?, ?)";
		if( check(code)) {
			try {
				pt = conn.prepareStatement(bookSql);
				pt.setBoolean(1, true);
				pt.executeUpdate();
				
				pt = conn.prepareStatement(memberSql);
				pt.setString(1, member);
				pt.setString(2, code);
				pt.executeUpdate();
				
				
			} catch (SQLException e) {
				System.out.println("대여상태 업데이트 실패");
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println("대여 불가능");
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
			System.out.println("book 테이블 조회 실패");
			e.printStackTrace();
		}
		return false;
	}
	
	
}
