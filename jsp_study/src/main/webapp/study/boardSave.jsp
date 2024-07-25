<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.*"%>


<% 
	request.setCharacterEncoding("UTF-8");
	String writer = ((Member)session.getAttribute("user")).getUserId();	
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	DBconnect db = new DBconnect();
	String sql = "insert into board(title, writer, content) values(?,?,?)";
	
	try{
		db.pt = db.conn.prepareStatement(sql);
		db.pt.setString(1, title);
		db.pt.setString(2, writer);
		db.pt.setString(3, content);
		db.pt.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	}

	response.sendRedirect("/jsp_study/study/?part=board");
%>





<%-- <jsp:useBean id="bd" class="study.Board" /> --%>
<%-- <jsp:setProperty property="bd" name="bd" /> --%>

<%-- <% --%>
// 	//작성자 가져오기
// 	String writer = ((Member)session.getAttribute("user")).getUserId();	

// 	//데이터베이스 사용
// 	DBconnect db = new DBconnect();
// 	//db.pt = db.conn.prepareStatement(sql);
	
// 	String sql = "insert into board(title, writer, content) values(?,?,?)";
	
// 	try{
// 		db.pt = db.conn.prepareStatement(sql);
// 		db.pt.setString(1, bd.getTitle());
// 		db.pt.setString(2, writer);
// 		db.pt.setString(3, bd.getContent());
// 		db.pt.executeUpdate();
// 		response.sendRedirect("/jsp_study/study/?part=board");
// 	}catch(SQLException e){
// 		System.out.println("board 테이블 저장 실패");
// 	}

<%-- %> --%>

