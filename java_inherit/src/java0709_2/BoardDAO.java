package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDAO {
	private Connection conn; // 데이터베이스 접속정보 저장
	private Statement st; // SQL명령어 전달과 결과 받기
	private PreparedStatement pt; // SQL명령어 전달과 결과 받기
	private ResultSet rs; // 데이터 조회 결과 저장

	public BoardDAO() {
		DriverLoad(); //데이터베이스 드라이버 로드
		Connect(); //데이터베이스 접속
	}
	
	//test_board 테이블의 데이터 가져와서 Board클래스 객체로 저장하기
	public Board[] findByAll() {
		Board[] list = new Board[7]; // Board클래스 객체 7개 저장하기 위한 배열
		String sql = "select * from test_board"; // sql질의문, 쿼리문
		
		// select 사용시 - executeQuery 메서드
		// insert,update,delete 사용시 - executeUpdate메서드
		try {
			st = conn.createStatement(); //statement 생성
			rs = st.executeQuery(sql);
			int i = 0;
			while(rs.next()) {
				list[i] = new Board(rs.getInt("board_id"), rs.getString("title"), rs.getString("writer"), rs.getString("content"), rs.getInt("hit"));
				i++;
			}
			
		}catch(Exception e) {
			System.out.println("데이터 가져오기 실패");
		}
		
		return list;
	}
	
	
	private void DriverLoad() { //드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");	
		}
		
		
	}
	
	private void Connect() {
		String username = "JH1";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/JH1";
		
		try {
			conn = DriverManager.getConnection(url,username,password);
		}catch(Exception e){
			System.out.println("접속 실패");
		}
	}
	
}

/*
	Connection, Statement 또는 PreparedStatement, ResultSet
	참조변수 필요
	
	1. 데이터베이스와 연결하기위한 드라이버 로드
	   (mysql 5버전 이후 - com.mysql.cj.jdbc.Driver
	    5버전 이하 - com.mysql.jdbc.Driver
	    
	    Class.forname("com.mysql.cj.jdbc.Driver");
	    
	2. 데이터베이스에 접속 하기
	   데이터베이스 계정명, 비민번호, 주소
	   DriverManger.getConnection(주소, 계명, 비밀번호);
	   
	   	접속을 시도한 결과를  Connection의 참조변수에 저장
	   	
	3. conn을 통해서 Statment 또는 PreparedStatement의 객체 생성하여 SQL명령어 보내기


 */
