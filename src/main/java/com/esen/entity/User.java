package com.esen.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("User")
public class User {
	private String id;

	@NotEmpty
	private String name;

	@Range(max = 200, min = 1)
	private int age;

	@Email
	@NotEmpty
	private String email;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}
