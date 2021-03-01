package com.todoapp.todoapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
	private String id;
	private String title;
	private Boolean done;
	
	public Todo(String id, String title, Boolean done) {
		super();
		this.id = id;
		this.title = title;
		this.done = done;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", done=" + done + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean isDone() {
		return done;
	}
	public void setDone(Boolean done) {
		this.done = done;
	}	
}
