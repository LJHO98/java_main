package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.CommentDTO;

public class CommentDAO extends DBConnect{
	public void save(int bid, String comment, String writer) {
		String sql = "insert into comment(board_id, comment, writer, write_date) values(?, ?, ?, now() )";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setInt(1, bid);
			pt.setString(2, comment);
			pt.setString(3, writer);
			pt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("업로드 실패");
			e.printStackTrace();
		}
		
	}

	public List<CommentDTO> findByBoardId(int bid) {
		String sql = "select * from comment where board_id=?";
		List<CommentDTO> list = new ArrayList<>();
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setInt(1, bid);
			rs = pt.executeQuery();
			while(rs.next()) {
				list.add(  CommentDTO.of(rs.getInt("comment_id"), rs.getInt("board_id"), rs.getString("writer"), rs.getString("comment"), rs.getDate("write_date").toLocalDate() ) );
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("댓글 불러오기 실패");
		}
		
		
		return null;
	}

	public void delete(int cid) {
		String sql = "delete from comment where comment_id=?";
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setInt(1, cid);
			pt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("댓글 삭제 실패");
		}
		
	}

	
	
	
}
