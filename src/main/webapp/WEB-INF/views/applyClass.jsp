<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수강 신청하기</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/main.css">
</head>
<body>
<h3>2019년 1학기에 신청할 예상 교과목을 입력하세요</h3>	
	<sf:form method="post" action="${pageContext.request.contextPath }/createClass" modelAttribute="newclass">
	
		<table class="formtable">
			<tr> <td class="label">교과목 명: </td> <td> <sf:input class="control" type="text" path="classname"/></td> </tr>
			
			<tr class="test"><sf:errors path="classname" class="error" /></tr>
			<tr> <td></td><td><input type="submit" value="신청"/></td></tr>
			
		</table>
	</sf:form>
	
	<a href="${pageContext.request.contextPath}/"> 홈으로 돌아가기</a>
</body>
</html>