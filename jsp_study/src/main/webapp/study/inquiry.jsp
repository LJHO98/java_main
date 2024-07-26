<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.*"%>

<%-- inquiry.jsp    문의 페이지에 스타일 적용하려면 inquiry.css  --%>


<div id="inquiryWrap">
	<h2>문의</h2>
	<div class="writeBt">
		<% if( session.getAttribute("user") !=null  ) {%>
			<a href="?part=inquiryWrite">문의하기</a>
		<% } %>
		
	</div>
	<div id="inquiryBox">
		<ul id="inquiryList">
			<li>
				<span class="title">제목</span>
				<span class="writer">작성자</span>
				<span class="isAnswer">답변</span>
			</li>
			
			<% 
				DBconnect db = new DBconnect();
				
				String sql="select * from inquiry order by inquiry_id desc";
				// order by 정렬기준컬럼명 asc (desc:내림차순, asc:오름차순)
				
				ArrayList<Inquiry> list = new ArrayList<>();
				
				try{
					db.pt = db.conn.prepareStatement(sql);
					db.rs = db.pt.executeQuery();
					while(db.rs.next()){
						list.add(
							new Inquiry(db.rs.getInt(1), db.rs.getString(2), db.rs.getString(3), db.rs.getString(4)
								,db.rs.getString(5), db.rs.getString(6), db.rs.getString(7))	
								);
					}
					
				}catch(SQLException e){
					e.printStackTrace();
					System.out.println("inquiry 테이블 조회 실패");
				}
			
			
			
				for(Inquiry iq : list){
			%>
			<li class='list'>
				<span class="title"><%=iq.getTitle()%>
				 	<%
				 		if(!iq.getPassword().isBlank()){
				 	
				 	%>
					<i class="bi bi-shield-lock-fill"></i>
					<%
				 		}
					%>
				</span>
				<span class="writer"><%=iq.getWriter() %></span>
				<span class="isAnswer">
				<%=iq.getAnswer()==null ? "미답변" : "답변완료" %>
				</span>
			</li>
			<%
				}
			%>
		</ul>
	</div>
</div>



