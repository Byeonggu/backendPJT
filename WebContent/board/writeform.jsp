<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글등록</title>
</head>
<body>
	<h2>글등록</h2>
	<form action="main" method="POST">
		<input type ="hidden" name ="act" value="write">
		제목 : <input type ="text" name ="title"><br>
		쓰니 : <input type ="text" name ="writer"><br>
		내용 : <textarea rows="10"  cols="10" name ="content"></textarea><br>
		영상링크 :  <input type ="text" name ="url"><br>
		이미지링크 :  <input type ="text" name ="imgurl"><br>
		<button>등록</button>
	</form>
</body>
</html>
