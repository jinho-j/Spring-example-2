<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 한글로인코딩 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ page session="false" %>
<html>
<style>
.image {
 position:relative;
 float:left; /* optional */
}
.image .text {
 position:absolute;
 top:20px; /* in conjunction with left property, decides the text position */
 left:40px;
 width:400px; /* optiona, though better have one */
}
h1{
font-weight : bold | 100~900;
font-size : 10rem;
color: white;
}
a{
font-weight : bold | 100~900;
font-size : 10rem;
color: white;
}
</style>
<head>
	<title>부산의맛집</title>
</head>
<body>
<div class="image">
                <img alt="" src="C:\Users\CMSLab\Desktop\food.jpg" />
                <div class="text">
                   <h1> 부산의 맛집을 찾아라.</h1>
                   <h1>가게의수.</h1> <a href="./hr/count">Store count</a><br>
                   <h1></h1>
                   <h1>맛집찾기.</h1> <a href="./hr/insert">find Store</a>
                </div>
            </div>

</body>
</html>
