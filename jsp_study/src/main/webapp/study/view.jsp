<%@page import="study.BoardImg"%>
<%@page import="study.Board"%>
<%@page import="java.sql.SQLException"%>
<%@page import="study.DBconnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- view.jsp 
	id 파라미터의 값을 board 테이블의 board_id 컬럼으로 조회하여
	board_id와 id파라미터가 일치하는 게시글 데이터들을 가지고와서 화면에 출력한다.
--%>

<%
	DBconnect db = new DBconnect();
	
	int id = Integer.parseInt(request.getParameter("id"));
	
	String sql = "select * from board where board_id=?";
	
	Board data=null; // select sql문의 결과는 Board클래스 객체 하나에 저장되는 데이터
				// 이기때문에 Board클래스 객체 저장할 수 있는 변수만 있으면 된다.
	
	try{
		db.pt = db.conn.prepareStatement(sql); //PreparedStatement 객체 생성
		db.pt.setInt(1, id);
		db.rs = db.pt.executeQuery();
		if(db.rs.next()){
			data = new Board(db.rs.getInt("board_id"), db.rs.getString("title"), db.rs.getString("writer"), 
					db.rs.getString("content"), db.rs.getInt("hit"));
		}
		
	}catch(SQLException e){
		e.printStackTrace();
		System.out.println("해당 게시글 조회 실패");
	}
	
	// 해당 게시글의 이미지 가져오기
	
	sql = "select * from board_img where board_id=?";
	BoardImg img = null;
	
	try{
		db.pt = db.conn.prepareStatement(sql);
		db.pt.setInt(1, data.getBoard_id());
		db.rs = db.pt.executeQuery();
		if(db.rs.next()){
			img = new BoardImg(db.rs.getInt("board_img_id"), db.rs.getInt("board_id"), db.rs.getString("img_name"),
					db.rs.getString("img_path"));
		}
	}catch(SQLException e){
		e.printStackTrace();
		System.out.println("게시글 이미지 조회 실패");
	}
	
%>

<h2> 제목 : <%=data.getTitle() %></h2>
<h3> 작성자 : <%=data.getWriter() %> </h3>
<h3> 내용 : <%=data.getContent() %></h3>
<h3> 조회수 : <%=data.getHit() %></h3>
<% if(img != null){ %>
<img src="<%=img.getImgPath()%><%=img.getImgName()%>">
<% 
}
%>



