<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- signin.jsp --%>

<div id="signinBox">
	<form method="post" action="signCheck.jsp">
		<div class="loginInput">
			<b>아이디</b>
			<input type="text" name="userId">
		</div>
			<div class="loginInput">
			<b>비밀번호</b>
			<input type="password" name="userPassword"> 
		</div>
		<button id="loginBt">로그인</button>
	</form>
	<div class="sign"><a href="findUser.jsp">아이디/비밀번호찾기</a></div>
	<div class="sign"><a href="/jsp_study/study/?part=signup">회원 가입</a></div>

</div>

<%--
	전송방식 : post
	전송 url : signCheck.jsp
	아이디 파라미터 : userId
	비밀번호 파라미터 : userPassword
	아이디/비밀번호 찾기 url : findUser.jsp
	회원 가입 url : signup.jsp
	
--%>