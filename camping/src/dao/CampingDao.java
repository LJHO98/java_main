package dao;

import java.sql.SQLException;

import dto.CampingDto;

public class CampingDao extends DBConnect{
	private CampingDto dto;
	
	public CampingDto select(String tel) {
		String sql = "select * from camping where rp_tel=?";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(0, tel);
			rs = pt.executeQuery();
			if(rs.next()) {
				dto = new CampingDto(rs.getInt("spot_id"), rs.getBoolean("is_spot_reserve"), rs.getString("rv_date"), rs.getString("rp_tel"), rs.getString("rp_name"));
				return dto;
			}
		} catch (SQLException e) {
			System.out.println("예약정보 조회 실패");
			e.printStackTrace();
		}
		return null;
	}
	
	public void reservation() {
		
	}
	
	public void cancle() {
		
	}
	
	
}
