<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
</head>
<body>
	<form method="post" action="cook.jsp">
		<input type="text" name="food" placeholder="점심메뉴"><br>
		<input type="text" name="price" placeholder="가격"><br>
		<input type="text" name="rest" placeholder="식당명"><br>
		<button>등록</button>
	</form>
	
	<hr>
	
	<h3>점심메뉴 선택</h3>
	<ol>
	<%
		Cookie[] cooks = request.getCookies();
		String food="", price="", rest="";
		//클라이언트 쿠키중에서 food, price, rest의 value 값 가져오기(form으로 전송)
		for(Cookie cook : cooks){
			if(cook.getName().equals("food")) food = cook.getValue();
			if(cook.getName().equals("price")) price = cook.getValue();
			if(cook.getName().equals("rest")) rest = cook.getValue();
		}
		String[] foodList = food.split("-");
		String[] priceList = price.split("-");
		String[] restList = rest.split("-");
		
		
		for(int i=0; i<foodList.length; i++){
	%>
		<li> <b><%=foodList[i]%>, <%=priceList[i]%>, <%=restList[i]%> </b> <button class="selBt">선택</button> </li>
	<%
		}
	%>
	</ol>
</body>
<style>
	.select{ color:red;}
</style>
<script>
	$(".selBt").on("click", function(){
// 		$("b").removeClass("select");
// 		$(this).prev().addClass("select");
		
		$(".selBt").each(function(i){
			$(this).prev().removeClass("select");
		});
		$(this).prev().addClass("select");
		
	});

</script>
</html>