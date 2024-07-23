package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Dao {
	private Connection conn; // 데이터베이스 접속 정보를 저장할 변수
	private Statement st; //sql문을 실행하여 데이터베이스와 상호 작용을 위한 변수
	private ResultSet rs; // 데이터베이스 select(조회)결과를 받기 위한 변수
	private PreparedStatement pt;
	
	Dao(){
		DriverInit();
		Connect();
	}
	// mysql과 java프로그램을 연결할 driver 로드
	private void DriverInit() {
		try { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
	}
	// mysql에 계정 접속
	private void Connect() {
		String user = "JH1";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/JH1";
		
		try {
			conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			System.out.println("데이터 베이스 접속 실패");
		}
	}
	
	public void insert(Member m) {
		String sql = "insert into test_member(name, kor, eng, mat, tot, std_avg) values(?,?,?,?,?,?)";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString( 1, m.getName() );
			pt.setInt( 2, m.getKor() );
			pt.setInt( 3, m.getEng() );
			pt.setInt( 4, m.getMat() );
			pt.setInt( 5, m.getTot() );
			pt.setInt( 6, m.getStd_avg() );
			pt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("데이터 저장 실패");
		}
		
		
		
		//보안이 취약해 사용하지 않는 방식
//		String sql = "insert into test_member(name, kor, eng, mat, tot, std_avg) values('"+m.getName()+"',"+m.getKor()+","+m.getEng()+","+m.getMat()+","+m.getTot()+","+m.getStd_avg()+")";
//		
//		try {
//			st = conn.createStatement(); //sql문을 보내기 위해 Statement 객체 생성
//			st.executeUpdate(sql); //sql문을 데이터베이스에 전달
//			
//		}catch(Exception e) {
//			System.out.println("데이터 저장 실패");
//		}
	}
	
	public Member[] select() {
		Member[] list = null;
		
		//select일때는 executeQuery
		String sql = "select count(*) as cnt from test_member";
		try {
			int size = 0;
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if( rs.next()) {
				size = rs.getInt("cnt"); // 데이터베이터에 데이터(레코드)가 총 몇개 있냐?
			}
			if(size!=0) {
				list = new Member[size];
				int i=0;
				sql = "select * from test_member"; //전체 데이터 조회
				rs = st.executeQuery(sql); // 조회결과 받기
				while(rs.next()) { //조회 결과 하나씩 순회
					list[i] = new Member(rs.getInt("member_id"), rs.getString("name"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"), rs.getInt("tot"), rs.getInt("std_avg") );
					i++; //배열의 다음 인덱스 표현을 위해 1 증가
				}
			}
		}catch(Exception e) {
			System.out.println("데이터 조회 실패");
		}
		
		return list;
		
	}
	
	public void delete(String name) {
		String sql = "delete from test_member where name='"+name+"'";
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
			System.out.println("삭제 완료");
		}catch(Exception e){
			System.out.println("삭제 실패");
		}
	}
	
}
