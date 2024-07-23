package dao;

import java.sql.SQLException;
import java.util.HashMap;
import dto.Tea;

public class TeaDAO extends ParentDAO{
	public HashMap<Integer, Tea> findAll(){
		HashMap<Integer, Tea> data = new HashMap<>();
		
		String sql="select * from tea";
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			
			while(rs.next()) {
				data.put(rs.getInt("tea_id"), 
						new Tea(rs.getString(2), rs.getInt(3)));
				
			}
		}catch(SQLException e) {
			System.out.println("tea테이블 조회 실패");
		}
		
		return data;
	}
}
