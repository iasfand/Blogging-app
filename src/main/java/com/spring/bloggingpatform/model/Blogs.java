package com.spring.bloggingpatform.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Blogs")
public class Blogs {
	
	@Id
	private String id;
	private String date;
	private String name;
	private String content;
	private String tags;
	private String title;
	
	
	
	
	@Override
	public String toString() {
		return "Blogs [id=" + id + ", date=" + date + ", name=" + name + ", content=" + content + ", tags=" + tags
				+ ", title=" + title + "]";
	}
	public Blogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Blogs(String id, String date, String name, String content, String tags, String title) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.content = content;
		this.tags = tags;
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
    
    

    
}
