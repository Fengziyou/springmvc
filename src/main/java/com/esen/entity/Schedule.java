package com.esen.entity;

import java.io.Serializable;

public class Schedule implements Serializable{
	private static final long serialVersionUID = -5442122927299973055L;

	private String creator;

	private String name;

	private String text;

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreator() {
		return creator;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
