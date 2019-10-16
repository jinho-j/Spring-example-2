<%@ page contentType="text/html; charset=UTF-8"%>
<!-- 한글로인코딩 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
   request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
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
h3{
font-size : 0.3rem;
}
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<head>
<!-- <meta charset="UTF-8"> -->
<meta http-equiv = "Content-Type" content="text/html; charset=UTF-8">
<title>CoderBy</title>
</head>
<body>


 <img alt="" src="C:\Users\CMSLab\Desktop\aaa.png" />
                <div class="text">
                   <h3> 해당하는 동 내에서 입력해주세요!</h3>
             <h4> 동래구: 명륜동, 온천동, 사직동, 명장동, 수민동<br>
        금정구: 금사동,서동,부곡동,장전동,노포동,구서동<br>
        해운대구 :우동,좌동,반여동,재송동<br>
        진구: 부전동,당감동,가야동,전포동,양정동<br>
        중구: 중앙동, 동광동, 부평동, 보수동, 남포동, 광복동, 대청동 </h4>
        <h3> 해당하는 음식종류에서 선택해주세요!</h3>
        <h3> 한식,중식,일식,양식</h3>
                </div>
                
<h1>맛집정보 입력</h1>

<form action="./insert" method="post">
<table class="table table-striped">
<tr>
	<th>원하시는 (동)</th>
	<td><input type="text" name="location"required></td>
</tr>
<tr>
	<th>원하시는 음식종류</th>
	<td><input type="text" name="food_type" required></td>
</tr>


<!-- <tr> -->
<!-- 	<th>JOB_ID</th> -->
<!-- 	<td> -->
<!-- 		<select name="jobId"> -->
<%-- 		<c:forEach var="job" items="${jobList}"> --%>
<%-- 			<option value="${job.jobId}">${job.title}</option> --%>
<%-- 		</c:forEach> --%>
<!-- 		</select> -->
<!-- 	</td> -->
<!-- </tr> -->
<!-- <tr> -->
<!-- 	<th>SALARY</th> -->
<!-- 	<td><input type="number" name="salary"></td> -->
<!-- </tr> -->
<!-- <tr> -->
<!-- 	<th>COMMISSION_PCT</th> -->
<!-- 	<td><input type="number" name="commissionPct" step="0.1" min="0" max="0.99"></td> -->
<!-- </tr> -->
<!-- <tr> -->
<!-- 	<th>MANAGER_ID</th> -->
<!-- 	<td> -->
<!-- 		<select name="managerId"> -->
<%-- 		<c:forEach var="manager" items="${managerList}"> --%>
<%-- 			<option value="${manager.managerId}">${manager.firstName}</option> --%>
<%-- 		</c:forEach> --%>
<!-- 		</select> -->
<!-- 	</td> -->
<!-- </tr> -->
<!-- <tr> -->
<!-- 	<th>DEPARTMENT_ID</th> -->
<!-- 	<td> -->
<!-- 		<select name="departmentId"> -->
<%-- 		<c:forEach var="department" items="${deptList}"> --%>
<%-- 			<option value="${department.departmentId}">${department.departmentName}</option> --%>
<%-- 		</c:forEach> --%>
<!-- 		</select> -->
<!-- 	</td> -->
<!-- </tr> -->
<tr>
	<th>&nbsp;</th>
	<td>
		<input type="submit" value="저장"> 
		<input type="reset" value="취소">
	</td>
</tr>
</table>
</form>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</body>
</html>