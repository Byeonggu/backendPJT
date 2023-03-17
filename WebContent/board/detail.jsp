<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
</head>
<body>

	<h2>글 상세보기</h2>
	<h4>${song.title}</h4>
	
	<div>
		조회수 : ${song.viewCnt}
	</div>
	<div>
		글쓴이 : ${song.writer}
	</div>
	
	<div>
		등록일 : ${song.regDate}
	</div>
	<div>
		<img src="${song.imgurl}  width="100" height="50">
	</div>
	<div>
		<a href="${song.url}">영상 보러가기</a>
	</div>
	<div>
		내용 : ${song.content}
	</div>
	
	
	
	<a href="board?act=updateform&id=${board.id }">수정</a>
	<a href="board?act=delete&id=${board.id }">삭제</a>
</body>
</html>