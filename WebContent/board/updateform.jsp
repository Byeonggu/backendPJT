<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글수저ㅏㅇ</title>
</head>
<body>
	<h2>글수정</h2>
	<form action="main" method="POST">
		<input type ="hidden" name ="act" value="update">
		<input type ="hidden" name ="id" value="${song.id}">
		제목 : <input type ="text" name ="title" value="${song.title}"><br>
		쓰니 : <input type ="text" name ="writer" value="${song.writer}"><br>
		내용 : <textarea rows="10"  cols="10" name ="content" >${song.content}</textarea><br>
		영상링크 :  <input type ="text" name ="url" value="${song.url}"><br>
		이미지링크 :  <input type ="text" name ="imgurl" value="${song.imgurl}"><br>
		<button>등록</button>
	</form>
</body>
</html>
