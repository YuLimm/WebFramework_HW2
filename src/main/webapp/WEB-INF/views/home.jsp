<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메인 홈페이지</title>
</head>
<body>

	<h3>어서오세요 환영합니다!</h3>
	<ul>
	<li><p> <a href="${pageContext.request.contextPath}/showGrade"> 학년/학기별 이수 학점 조회</a> </p></li>
	<li><p> <a href="${pageContext.request.contextPath}/applyClass"> 수강 신청하기</a> </p></li>
	<li><p> <a href="${pageContext.request.contextPath}/showClass"> 수강 신청조회</a> </p></li>
	</ul>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<a href="javascript:document.getElementById('logout').submit()">로그 아웃</a>
	</c:if>
	
	<form id="logout" action="<c:url value="/logout" />" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />	
	</form>
	
	
</body>
</html>
