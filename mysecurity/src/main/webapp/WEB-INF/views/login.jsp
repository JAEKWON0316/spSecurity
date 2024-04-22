<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- prefix명에 따라 맞춰서 써주면된다. -->
<!DOCTYPE html>
<html>
   <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Resume - Start Bootstrap Theme</title>
        <link rel="icon" type="image/x-icon" href="./res/images/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Muli:400,400i,800,800i" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="./res/css/styles.css" rel="stylesheet" />
    </head>
   <body id="login">
  
	<div class="container mt-5">
    <div class="row d-flex justify-content-center">
        <div class="col-md-5">
        <c:if test="${param.error != null}">
        
        	 <span class="text-danger">아이디 또는 패스워드가 잘못됐습니다.</span>
      
        </c:if> 
        <c:if test="${param.logout != null}">
      
        	<span class="text-success">로그아웃 되었습니다.</span>
      
        </c:if>
       
            <div class="card px-5 py-5" id="form1">
                <form:form class="form-data" action="member/gallery" method="post">
                    <div class="forms-inputs mb-4"> <span>username</span> 
                    <input type="text" name="username">
                    </div>                
                    <div class="forms-inputs mb-4"> <span>Password</span> 
                    <input type="password" name="password">
                    </div>                     
                    <div class="mb-3"> 
                    <input type="submit" class="btn btn-dark w-100" value="login">
                    </div>              
               <!--  <input name="_csrf" type="hidden" value="ecfcf3ab-3935-4870-ad88-54f0c9a328cc" />  <!-- 이렇게하면 페이지 새로고침 할 때마다 value값이 바뀌어서 이렇게 만들 수 없다 -->
                </form:form>   
            </div>
        </div>
    </div>
</div>
    <script src="./res/js/scripts.js"></script>
    </body>
</html>
