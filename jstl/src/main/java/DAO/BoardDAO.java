package DAO;

import java.sql.SQLException;

import DTO.BoardDTO;

public class BoardDAO extends DBConnect{
	public void save(BoardDTO board) { // 입력한 게시글 저장
		String sql = "insert into board(title, writer, content) values(?,?,?)";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, board.getTitle());
			pt.setString(2, board.getWriter());
			pt.setString(3, board.getContent());
			pt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("업로드 실패");
		}
	}
	
}
