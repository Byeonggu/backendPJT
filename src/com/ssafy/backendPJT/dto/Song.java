package com.ssafy.backendPJT.dto;

public class Song {
	private int id;
	private String title;
	private String writer;
	private String content;
	private String url;
	private String imgurl;
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
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
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
	
	public Song(int id, String title, String writer, String content, String url, String imgurl, String regDate,
			int viewCnt) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.url = url;
		this.imgurl = imgurl;
		this.regDate = regDate;
		this.viewCnt = viewCnt;
	}
	@Override
	public String toString() {
		return "song [id=" + id + ", title=" + title + ", writer=" + writer + ", content=" + content + ", url=" + url
				+ ", imgUrl=" + imgurl + ", regDate=" + regDate + ", viewCnt=" + viewCnt + "]";
	}
	
	
	
	
	
	
}
