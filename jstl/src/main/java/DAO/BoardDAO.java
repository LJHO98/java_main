package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DTO.BoardDTO;

public class BoardDAO extends DBConnect{
	public void save(BoardDTO board) { // �Է��� �Խñ� ����
		String sql = "insert into board(title, writer, content) values(?,?,?)";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, board.getTitle());
			pt.setString(2, board.getWriter());
			pt.setString(3, board.getContent());
			pt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("���ε� ����");
		}
	}
	public List<BoardDTO> findAll(int row, String keyWord) {
		keyWord="%"+keyWord+"%";
		 //limit ?, 10 - ? �ε������� 10����, ?�� row���̹Ƿ� 0,10,20 �̷������� �ٲ�.
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
			System.out.println("�Խñ� select ����");
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int totalCount(String keyWord) { //�Խñ� �� ����
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
			System.out.println("�� �Խñ� �� ��ȸ ����");
			e.printStackTrace();
		}
		return 0;
	}
	
	public BoardDTO findById(int bid) {
		
		String sql = "select * from board where board_id=?";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setInt(1, bid);
			rs=pt.executeQuery();
			if(rs.next()) {
				return new BoardDTO(rs.getInt("board_id"), rs.getString("title"), rs.getString("writer"), rs.getString("content"), rs.getInt("hit"));
			}
			
			
		} catch (SQLException e) {
			System.out.println("�Խñ� �� ������ ��ȸ ����");
		}
		
		
		return null;
	}
	
	public void delete(int bid) {
		
		String sql = "delete from board where board_id=?";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setInt(1, bid);
			pt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("���� ����");
		}
		
		
	}
	
	public void update(BoardDTO dto) { //�Խñ� ����
		String sql = "update board set title=? , content=? where board_id=?";
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, dto.getTitle());
			pt.setString(2, dto.getContent());
			pt.setInt(3, dto.getBoard_id());
			pt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("�Խñ� ���� ����");
		}
	}
	
}
