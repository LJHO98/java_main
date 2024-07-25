<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="study.* , java.sql.*" %>

<%
	request.setCharacterEncoding("UTF-8");
	String writer = ((Member)session.getAttribute("user")).getUserId();
	String email = ((Member)session.getAttribute("user")).getUserEmail();
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String pw = request.getParameter("password");
	
	DBconnect db = new DBconnect();
	
	String sql ="create table if not exists inquiry"+
	"(inquiry_id int auto_increment primary key, title varchar(255),"+
	"content text, writer varchar(50), email varchar(100),"+
	"password varchar(100), answer text)";
	boolean isCreate=true;
	try{  // inquiry 테이블 이없으면 생성
		db.pt = db.conn.prepareStatement(sql);
		db.pt.executeUpdate();
	}catch(SQLException e){
		isCreate=false;
		e.printStackTrace();
	}
	
	if( isCreate ){
		sql = "insert into inquiry(title,writer,content,email, password) values(?,?,?,?,?)";
		try{
			db.pt = db.conn.prepareStatement(sql);
			db.pt.setString(1, title);
			db.pt.setString(2, writer);
			db.pt.setString(3, content);
			db.pt.setString(4, email);
			db.pt.setString(5, pw);
			db.pt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("저장실패");
		}
		
		response.sendRedirect("/jsp_study/study/?part=inquiry");
	}
%>





