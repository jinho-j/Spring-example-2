<%@ page contentType="text/html; charset=UTF-8"%>
<!-- 한글로인코딩 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title> 맛집 비교! </title>
<link rel="stylesheet" type="text/css" href="http://naradesign.net/ouif/uio/graph/inline/iGraph.css"/>

</head>
<body>
<h1>맛집 1,2위 비교!!</h1>
1위 맛집 : ${storename1} <br/>
2위 맛집 : ${storename2}
<br/>
<h1>상세 평점 비교</h1>
<h2>맛 평점</h2>
<p>
<dl>
   <dt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${storename1}</dt>
   <dd class="iGraph">
      <span class="gBar"><span class="gAction" style="width:${taste1*20}%"></span></span>
      <span class="gPercent"><strong>${taste1*20}</strong>점</span>
   </dd>
   <dt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${storename2}</dt>
   <dd class="iGraph">
      <span class="gBar"><span class="gAction" style="width:${taste2*20}%"></span></span>
      <span class="gPercent"><strong>${taste2*20}</strong>점</span>
   </dd>
</dl>
<h2>가격 평점</h2>
<dl>
   <dt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${storename1}</dt>
   <dd class="iGraph">
      <span class="gBar"><span class="gAction" style="width:${price1*20}%"></span></span>
      <span class="gPercent"><strong>${price1*20}</strong>점</span>
   </dd>
   <dt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${storename2}</dt>
   <dd class="iGraph">
      <span class="gBar"><span class="gAction" style="width:${price2*20}%"></span></span>
      <span class="gPercent"><strong>${price2*20}</strong>점</span>
   </dd>
</dl>
<h2>청결 평점</h2>
<dl>
   <dt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${storename1}</dt>
   <dd class="iGraph">
      <span class="gBar"><span class="gAction" style="width:${clean1*20}%"></span></span>
      <span class="gPercent"><strong>${clean1*20}</strong>점</span>
   </dd>
   <dt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${storename2}</dt>
   <dd class="iGraph">
      <span class="gBar"><span class="gAction" style="width:${clean2*20}%"></span></span>
      <span class="gPercent"><strong>${clean2*20}</strong>점</span>
   </dd>
</dl>
<h2>서비스 평점</h2>
<dl>
   <dt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${storename1}</dt>
   <dd class="iGraph">
      <span class="gBar"><span class="gAction" style="width:${service1*20}%"></span></span>
      <span class="gPercent"><strong>${service1*20}</strong>점</span>
   </dd>
   <dt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${storename2}</dt>
   <dd class="iGraph">
      <span class="gBar"><span class="gAction" style="width:${service2*20}%"></span></span>
      <span class="gPercent"><strong>${service2*20}</strong>점</span>
   </dd>
</dl>
<h1>홈으로</h1> <a href="http://localhost:8086/aaa/">HOME</a><br>

<h1>BIGDATA 교육생들 화이팅!!!!!</h1>
<button type="button" onclick="$('link').attr('href', '')">CSS(X)</button>
<button type="button" onclick="$('link').attr('href', 'http://naradesign.net/ouif/uio/graph/inline/iGraph.css')">CSS(O)</button>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script> 
</body>