<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	session.removeAttribute("user");
	response.sendRedirect("/jsp_study/study");

%>