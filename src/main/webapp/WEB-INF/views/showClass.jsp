<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수강 신청 조회</title>
</head>
<body>
<h3>2019년 1학기 신청 내역 조회</h3>	
<p>
	<table border="1" cellPadding="5">
			<tr>
				<th>번호</th>
				<th>신청한 교과목 명</th>
			</tr>
		<c:forEach var="newclass" items="${newclass}">
			<tr>
				<td>${newclass.id}</td>
				<td>${newclass.classname }</td>
			</tr>
		</c:forEach>
	</table>
	
	</p>
	<a href="${pageContext.request.contextPath}/"> 홈으로 돌아가기</a>
</body>
</html>