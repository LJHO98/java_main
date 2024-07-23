<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%--
	이름과 국어, 수학, 과학 성적을 받아서
	평균 90이상이면 참 잘했어요
	80이상이면 잘했어요
	70이상이면 노력해라
	나머지는 이게 점수야! 출력
--%>   

<%
	String name = request.getParameter("stdName");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int mat = Integer.parseInt(request.getParameter("mat"));
	int sci = Integer.parseInt(request.getParameter("sci"));
	int avg = (kor+mat+sci)/3;
	
	if(avg>=90){
		out.println("이름: "+name+", 참 잘했어요");
	}else if(avg>=80){
		out.println("잘했어요");
	}else if(avg>=70){
		out.println("노력해라");
	}else{
		out.println("이게 점수야!");
	}

%>
<br><br>
<hr>
<%@ include file="requestTest2.jsp"%>