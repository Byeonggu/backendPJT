<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0 auto;
        max-width: 800px;
    }
    h2 {
        color: #333;
    }
    form {
        display: flex;
        flex-direction: column;
        width: 300px;
        margin: 0 auto;
    }
    input[type="text"], textarea {
        padding: 8px;
        margin: 5px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
        resize: vertical;
    }
    button {
        background-color: #4CAF50;
        color: white;
        padding: 10px;
        margin: 5px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    button:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
	<h2>글 수정</h2>
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
