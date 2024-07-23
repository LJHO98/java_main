<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  

<%

	out.print("출력");
	out.newLine();
	out.println("ㅇㅇ");
	
	//page == this
			
	String name = "이순신";
	
	pageContext.getRequest().getParameter(name);
	pageContext.setAttribute("age", 25);
	
	//pageContext.include("requestTest2.jsp"); // <%@ include file="경로"
	pageContext.forward("내장객체1.jsp");
	

%>

<%-- action 태그를 이용해 include와 forward 사용
<jsp:include page="파일명"/>
<jsp:forward page="파일명"/>
--%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=pageContext.getAttribute("age") %>
</body>
</html>