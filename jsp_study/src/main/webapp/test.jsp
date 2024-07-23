
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="test.Test1"%>

<%
	int num=10;
	String name="이순신";
	System.out.println(num);
	
	Test1 test =  new Test1("김춘추", 45);
	
	out.println(test.getName()+"<br>");
	out.println(test.getAge());
	out.println(test);
%> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=num %> <%=name %></h1>
</body>
</html>