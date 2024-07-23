package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ParentDAO {
	protected Connection conn;
	protected PreparedStatement pt;
	protected ResultSet rs;
	
	public ParentDAO() {
		driverLoad();
		connect();
	}

	private void driverLoad() { // 데이터베이스 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
	}
	
	private void connect() { // 데이터베이스 접속
		String user="JH1";
		String password="123456";
		String url="jdbc:mysql://localhost:3306/jh1";
		try {
			conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			System.out.println("데이터 베이스 접속 실패");
		}
	}

	
	
}
