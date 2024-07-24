<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String part = request.getParameter("part");
	if(part==null) part="main";

%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="default.css">

<link rel="stylesheet" href="<%=part%>.css">

</head>
<body>
	<div id="wrap">
		<jsp:include page="header.jsp" />
		
		<div id="main">
			<%String subPage = part+".jsp"; %>
			<jsp:include page="<%=subPage%>" />
		</div>
		
		<jsp:include page="footer.jsp" />
	</div>
</body>
</html>