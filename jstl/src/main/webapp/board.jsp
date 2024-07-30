<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/board">
		<input type="text" id="title" placeholder="제목"><br>
		<input type="text" id="content" placeholder="내용"><br>
		<button>글작성</button>
	</form>
	
	<table>
		<tr> 
			<td> <a href="/board">게시글 첫번째 제목이다</a> </td>
			<td> 내가 작성자 </td>
		</tr>
	</table>
</body>
</html>