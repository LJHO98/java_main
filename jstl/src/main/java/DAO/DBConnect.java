package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	protected Connection conn;
	protected Statement st;
	protected PreparedStatement pt;
	protected ResultSet rs;
	
	protected DBConnect() {
		connect();
	}
	
	private void connect() {
		String user = "JH1";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3606/jh1";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			System.out.println("드라이버 로드 및 접속 실패");
		}
	}
}
