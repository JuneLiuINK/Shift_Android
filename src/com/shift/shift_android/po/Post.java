package com.shift.shift_android.po;

public class Post {
	private String title;
	private String author;
	private int postId;
	private String content;
	private int img;
	private String allContent;
	
	public Post() {
	}
	public Post(String title,String author,int postId,String allContent,int img) {
		this.title = title;
		this.author = author;
		this.postId = postId;
		this.allContent = allContent;
		this.img = img;
//		this.content = allContent;
		
		if(this.allContent.length()>30)	this.content = allContent.substring(0,30)+"……";
		else this.content = this.allContent;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getImg() {
		return img;
	}
	public void setImg(int img) {
		this.img = img;
	}
	public String getAllContent() {
		return allContent;
	}
	public void setAllContent(String allContent) {
		this.allContent = allContent;
	}
}
