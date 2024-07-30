<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/member">회원가입</a> <%-- a태그는 기본적으로 get방식 --%>
	<form method="post" action="/member">
		<input type="text" name="id" placeholder="아이디"> <br>
		<input type="password" name="pw" placeholder="비밀번호"> <br>
		<button>로그인</button>
	</form>
	<div style="color:red">${fail }</div>
</body>
</html>