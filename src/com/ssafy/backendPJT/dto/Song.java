package com.ssafy.backendPJT.dto;

public class Song {
	private int id;
	private String title;
	private String writer;
	private String content;
	private String url;
	private String imgUrl;
	private String regDate;
	private int viewCnt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
	public Song() {
		
	}
	
	public Song(int id, String title, String writer, String content, String url, String imgUrl, String regDate,
			int viewCnt) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.url = url;
		this.imgUrl = imgUrl;
		this.regDate = regDate;
		this.viewCnt = viewCnt;
	}
	@Override
	public String toString() {
		return "song [id=" + id + ", title=" + title + ", writer=" + writer + ", content=" + content + ", url=" + url
				+ ", imgUrl=" + imgUrl + ", regDate=" + regDate + ", viewCnt=" + viewCnt + "]";
	}
	
	
	
	
	
	
}
