<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0 auto;
        max-width: 1200px;
        background-color: #f5f6f7;
        padding: 20px;
    }
    h2 {
        color: #333;
        text-align: center;
    }
    hr {
        border: 1px solid #ddd;
        margin-bottom: 20px;
    }
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    th {
        background-color: #f2f2f2;
    }
    tr:hover {
        background-color: #f5f5f5;
    }
    a {
        color: #337ab7;
        text-decoration: none;
    }
    a:hover {
        text-decoration: underline;
    }
    .thumbnail {
        width: 120px;
        height: 90px;
        border-radius: 5px;
        box-shadow: 0 4px 6px rgba(0,0,0,0.1);
        object-fit: cover;
    }
</style>
</head>
<body>
<h2>게시글 목록</h2>
    <hr>
    <table>
        <tr>
            <th>번호</th>
            <th>사진</th>
            <th>제목</th>
            <th>글쓴이</th>
            <th>조회수</th>
            <th>등록일</th>
        </tr>
        
        <c:forEach items="${list}" var="song">
            <tr>
                <th>${song.id}</th>
                <th><img src="${song.imgurl}" alt="${song.title}" class="thumbnail"></th>
                <th><a href="main?act=detail&id=${song.id}">${song.title}</a></th>
                <th>${song.writer}</th>
                <th>${song.viewCnt}</th>
                <th>${song.regDate}</th>
            </tr>
        
        </c:forEach>
    </table>
    <div style="text-align: center; margin-top: 20px;">
        <a href="<%=request.getContextPath()%>/main?act=writeform">글등록</a>
    </div>
</body>
</html>
