<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- create.jsp --%>

<%
	request.setAttribute("name", "장보고");
	session.setAttribute("age", 34);
	application.setAttribute("job", "군인");
%>
<h1> 객체 속성 저장 </h1>
request객체 -> name : <%=request.getAttribute("name") %> <br>
session객체 -> age : <%=session.getAttribute("age") %> <br>
application객체 -> job : <%=application.getAttribute("job") %>

<a href="object_check.jsp"> 이동 </a>
