CREATE DATABASE PJTDB;

USE PJTDB;

CREATE TABLE SONGS (
ID INT AUTO_INCREMENT PRIMARY KEY,
TITLE VARCHAR(25) NOT NULL,
WRITER VARCHAR(20) NOT NULL,
CONTENT TEXT NOT NULL,
VIEWCNT INT DEFAULT 0,
REGDATE TIMESTAMP DEFAULT NOW(),
URL VARCHAR(200) NOT NULL,
IMGURL VARCHAR(200) NOT NULL
);

INSERT INTO SONGS 
VALUES (0, "왼손은 거들뿐", "정대만","테스트1",0,NOW(),"https://www.youtube.com/watch?v=7JKu3J3ym_s","https://img.youtube.com/vi/7JKu3J3ym_s/0.jpg"),
		(0, "트와이스 신곡", "사나짱","테스트2",0,NOW(),"https://www.youtube.com/watch?v=w4cTYnOPdNk","https://img.youtube.com/vi/w4cTYnOPdNk/0.jpg"),
        (0, "엔믹스 신곡", "엔믹스","테스트3",0,NOW(),"https://www.youtube.com/watch?v=5eh6Vj_vVg4","https://img.youtube.com/vi/5eh6Vj_vVg4/0.jpg"),
        (0, "뉴진스 OMG", "강해린","테스트4",0,NOW(),"https://www.youtube.com/watch?v=jUmeh5yvy0M","https://img.youtube.com/vi/jUmeh5yvy0M/0.jpg");
        

