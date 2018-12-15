<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학년/학기별 이수 학점 조회</title>
</head>
<body>
	<h3>학년/학기별 이수 학점 조회 페이지 입니다.</h3>
	<h5>링크를 누르면 선택한 학기별 교과목 리스트가 표시됩니다. </h5>
	<table border="1" cellPadding="5">
		<tr>
			<th>년도</th>
			<th>학기</th>
			<th>이수 학점</th>
			<th>상세 보기</th>
		</tr>
		<tr>
			<td>2016</td>
			<td>1</td>
			<td>18</td>
			<td><a href="${pageContext.request.contextPath}/myclass1">링크</a></td>
		</tr>
		<tr>
			<td>2016</td>
			<td>2</td>
			<td>16</td>
			<td><a href="${pageContext.request.contextPath}/myclass2">링크</a></td>
		</tr>
		<tr>
			<td>2017</td>
			<td>1</td>
			<td>18</td>
			<td><a href="${pageContext.request.contextPath}/myclass3">링크</a></td>
		</tr>
		<tr>
			<td>2017</td>
			<td>2</td>
			<td>17</td>
			<td><a href="${pageContext.request.contextPath}/myclass4">링크</a></td>
		</tr>
		<tr>
			<td>2018</td>
			<td>1</td>
			<td>18</td>
			<td><a href="${pageContext.request.contextPath}/myclass5">링크</a></td>
		</tr>
		<tr>
			<td>2018</td>
			<td>2</td>
			<td>18</td>
			<td><a href="${pageContext.request.contextPath}/myclass6">링크</a></td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/"> 홈으로 돌아가기</a>
</body>
</html>