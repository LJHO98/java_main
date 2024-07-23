<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- musicInput.jsp -->
	<h3> 음악 정보 입력 </h3>
	<form method="post" action="action.jsp">
		음악 정보 : <input type="text" name="title"> <br>
		가수 : <input type="text" name="singer"> <br>
		발매년도 : <input type="number" name="year" min="1960" max="2024"> <br>
		<button>등록</button>
	</form>
</body>
</html>