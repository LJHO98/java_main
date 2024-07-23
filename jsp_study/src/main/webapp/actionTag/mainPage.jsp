<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- mainPage.jsp -->
<% 
	String tap = request.getParameter("tap");
	if(tap != null){
		if(tap.equals("notify") && session.getAttribute("user")==null){ //신고메뉴를 클릭했는데 로그인하지 않은 상태
%>
			<jsp:forward page="login.jsp"/>
<%
		}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="main.css">
</head>
<body>
<div id="loginBox">
	<a href="login.jsp">로그인</a>
</div>
	<h2> 내가 main 이야!!! </h2>
	<!-- 메뉴 표시 header.jsp -->
	<jsp:include page="header.jsp"> 
		<jsp:param value="<%=tap%>" name="select"/>
	</jsp:include>
	<!-- jsp.parm을 써서 파라미터 값을 전해줄때는 </jsp:include>로 끝내고 아니면 /> 이걸로 닫아주기 -->
	
	<div id="main">
		<%
			if(tap == null){
		%>
		첫페이지 내용
		<% }else{ 
			tap+=".jsp";
		%>
				<jsp:include page="<%=tap %>" />
		<% } %>
	</div>
	
	
	<!--  footer 표시 footer.jsp -->
	<jsp:include page="footer.jsp" />
</body>
</html>