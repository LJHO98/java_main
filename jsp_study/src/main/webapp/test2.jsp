<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Scanner"%>
    
<%--
	JSP 스크립트
		JSP 스크립트릿 : <% %>
			자바 로직 코드를 작성 (일반적인 코드작성)
		선언문 : <%! %>
			자바 변수나 메서드, 클래스 정의 할때
		표현식 : <%= %>
			결과값 출력
 --%>
 
 <%! // 선언문
 	int age=20; //변수 선언
 	String name="이순신";
 	
 	int sum(int a, int b){ //메서드 정의
 		return a+b;
 	}
 	
 	class mem{ //캘래스 정의
 		String userName;
 	}
 	//if, for 같은 제어문 사용 불가
 	//sum(10,20); 메서드 호출 안됨
 	//선언문에서는 오직 정의만 가능
 	
 	//console을 통해 입력받는 방식이라 사용하면 안됨.
 	//Scanner sc = new Scanner(System.in);
%>
 
<%	// 스크립틀릿
	sum(10,20); //메서드 호출 가능
 	if(age>15){ // 제어문 사용 가능

 	}
	String job="군인"; // 변수 선언 가능
	
//	void print(){ // 메서드 정의 불가
//		out.println("출력");
//	}
	
	
%>

<%=100 %>
<%="<br> 이순신" %>
<%=10>5 ? "크다" : "작다" %>
<%=sum(10,20) %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>