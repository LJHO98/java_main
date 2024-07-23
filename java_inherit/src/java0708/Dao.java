package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Dao {
	private Connection conn; // �����ͺ��̽� ���� ������ ������ ����
	private Statement st; //sql���� �����Ͽ� �����ͺ��̽��� ��ȣ �ۿ��� ���� ����
	private ResultSet rs; // �����ͺ��̽� select(��ȸ)����� �ޱ� ���� ����
	private PreparedStatement pt;
	
	Dao(){
		DriverInit();
		Connect();
	}
	// mysql�� java���α׷��� ������ driver �ε�
	private void DriverInit() {
		try { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("����̹� �ε� ����");
		}
	}
	// mysql�� ���� ����
	private void Connect() {
		String user = "JH1";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/JH1";
		
		try {
			conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			System.out.println("������ ���̽� ���� ����");
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
			System.out.println("������ ���� ����");
		}
		
		
		
		//������ ����� ������� �ʴ� ���
//		String sql = "insert into test_member(name, kor, eng, mat, tot, std_avg) values('"+m.getName()+"',"+m.getKor()+","+m.getEng()+","+m.getMat()+","+m.getTot()+","+m.getStd_avg()+")";
//		
//		try {
//			st = conn.createStatement(); //sql���� ������ ���� Statement ��ü ����
//			st.executeUpdate(sql); //sql���� �����ͺ��̽��� ����
//			
//		}catch(Exception e) {
//			System.out.println("������ ���� ����");
//		}
	}
	
	public Member[] select() {
		Member[] list = null;
		
		//select�϶��� executeQuery
		String sql = "select count(*) as cnt from test_member";
		try {
			int size = 0;
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if( rs.next()) {
				size = rs.getInt("cnt"); // �����ͺ����Ϳ� ������(���ڵ�)�� �� � �ֳ�?
			}
			if(size!=0) {
				list = new Member[size];
				int i=0;
				sql = "select * from test_member"; //��ü ������ ��ȸ
				rs = st.executeQuery(sql); // ��ȸ��� �ޱ�
				while(rs.next()) { //��ȸ ��� �ϳ��� ��ȸ
					list[i] = new Member(rs.getInt("member_id"), rs.getString("name"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"), rs.getInt("tot"), rs.getInt("std_avg") );
					i++; //�迭�� ���� �ε��� ǥ���� ���� 1 ����
				}
			}
		}catch(Exception e) {
			System.out.println("������ ��ȸ ����");
		}
		
		return list;
		
	}
	
	public void delete(String name) {
		String sql = "delete from test_member where name='"+name+"'";
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
			System.out.println("���� �Ϸ�");
		}catch(Exception e){
			System.out.println("���� ����");
		}
	}
	
}
