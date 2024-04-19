<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="res/css/bootstrap.min.css">
<link rel="stylesheet" href="res/css/style.css">
<script src="res/js/jquery-3.7.1.min.js"></script>
<script>
	$(function(){
		alert("뭐지?");
	});
</script>
</head>
<body>
	<div class="container">
		<h1>Hello, Java Web!!</h1>
		<div class="row mt-4">
			<!-- MyResConfig에서 설정해줌 -->
			<div class="col-6"><img src="res/images/010.gif" alt="이미지1" class="img-fluid img-thumbnail" /></div> <!-- static에 있는 이미지 -->
			<div class="col-6"><img src="res/images/008.gif" alt="이미지2" class="img-fluid img-thumbnail" /></div> <!-- public에 있는 이미지 -->
		</div>
	</div>
	
</body>
</html>