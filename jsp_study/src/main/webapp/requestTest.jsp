<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Arrays"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("myName");
		String today = request.getParameter("today");
		String city = request.getParameter("city");
		
		String[] 관심 = request.getParameterValues("interest");		
	%>
	<div> 이름 : <%=name %></div>
	<div> 날짜 : <%=today %></div>
	<div> 관심분야 : <%=Arrays.toString(관심) %></div>
	<div> 도시 : <%=city %></div>
	
</body>
</html>