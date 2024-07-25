<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.Member" %>

    <%--header.jsp --%>
<%
	String path="http://localhost:8080/jsp_study/study/";
	
%>    
    

<div id="header">
	<div id="top">
		<%
		//user가 없다면 null반환, 있다면 object 타입으로 반환(그래서 Member 클래스 타입으로 변환)
		Member user = (Member)session.getAttribute("user"); 
		if(user==null){
		%>
		<span class="topMenu"><a href="<%=path+"?part=signin"%>">로그인</a></span>
		<% }else{ %>
		<span class="topMenu">
			<%=user.getUserName() %> <a href="logout.jsp">로그아웃</a>
		</span>
		<%}%>

		<span class="topMenu">고객센터</span>
		<span class="topMenu">사이트맵</span>	
	</div>
	<div id="nav">
		<div class="logo"></div>
		<ul class="menuList">
			<li><a href="<%=path %>">HOME</a></li>
			<li><a href="<%=path+"?part=board" %>">게시판</a></li>
			<li><a href="<%=path %>">자료실</a></li>
			<li><a href="<%=path %>">공부방</a></li>
			<li><a href="<%=path+"?part=inquiry" %>">문의</a></li>
		</ul>
	</div>

</div>