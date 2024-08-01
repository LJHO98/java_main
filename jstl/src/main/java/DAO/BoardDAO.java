package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public List<BoardDTO> findAll(int row, String keyWord) {
		keyWord="%"+keyWord+"%";
		 //limit ?, 10 - ? 인덱스부터 10까지, ?는 row값이므로 0,10,20 이런식으로 바뀜.
		String sql = "select * from board where title like ? or content like ? order by board_id desc limit ? , 10";
		List<BoardDTO> list = new ArrayList<>();

		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, keyWord);
			pt.setString(2, keyWord);
			pt.setInt(3, row);
			rs = pt.executeQuery();
			while(rs.next()) {
				list.add( new BoardDTO( rs.getInt("board_id"), rs.getString("title"), rs.getString("writer"), rs.getString("content"), rs.getInt("hit")  ));
			}
		} catch (SQLException e) {
			System.out.println("게시글 select 실패");
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int totalCount(String keyWord) { //게시글 총 갯수
		keyWord= "%"+keyWord+"%";
		String sql = "select COUNT(board_id) as cnt from board where title like ? or content like ?";
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, keyWord);
			pt.setString(2, keyWord);
			rs = pt.executeQuery();
			if(rs.next()) {
				return rs.getInt("cnt");
			}
		}catch(SQLException e) {
			System.out.println("총 게시글 수 조회 실패");
			e.printStackTrace();
		}
		return 0;
	}
	
	public String findById(String bid) {
		
		
		
		return null;
	}
	
}
