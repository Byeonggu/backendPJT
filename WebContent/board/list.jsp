<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시글 목록</h2>
	<hr>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>조회수</th>
			<th>등록일</th>
		</tr>
		
		<c:forEach items="${list}" var="song">
			<tr>
				<th>${song.id}</th>
				<th><a href="main?act=detail&id=${song.id}">${song.title}</a></th>
				<th>${song.writer}</th>
				<th>${song.viewCnt}</th>
				<th>${song.regDate}</th>
			</tr>
		
		</c:forEach>
		 
		
		
	</table>
	
	<a href="<%=request.getContextPath()%>/main?act=writeform">글등록</a>
</body>
</html>