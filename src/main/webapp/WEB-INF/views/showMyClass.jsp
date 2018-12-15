<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${year}년 ${semester}학기에 수강한 교과목 리스트</h3>
	<p>
	<table border="1" cellPadding="5">
		<tr>
			<td>수강 년도</td>
			<td>학기</td>
			<td>교과 코드</td>
			<td>교과목 명</td>
			<td>구분</td>
			<td>학점</td>
		</tr>
		<c:forEach var="myclass" items="${myclasses}">
			<tr>
				<td>${myclass.year}</td>
				<td>${myclass.semester}</td>
				<td>${myclass.code}</td>
				<td>${myclass.classname}</td>
				<td>${myclass.divide}</td>
				<td>${myclass.credit}</td>
			</tr>
		</c:forEach>
	</table>
	</p>
	<a href="${pageContext.request.contextPath}/showGrade"> 다른 학년/학기 학점 조회하기</a></br>
	<a href="${pageContext.request.contextPath}/"> 홈으로 돌아가기</a>
</body>
</html>