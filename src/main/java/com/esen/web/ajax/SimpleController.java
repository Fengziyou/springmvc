package com.esen.web.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.esen.entity.User;

@Controller
public class SimpleController {
	@RequestMapping
	@ResponseBody
	public User json() {
		User user = new User();
		user.setId("my id");
		user.setName("my name");
		return user;
	}

	@RequestMapping
	@ResponseBody
	public User xml() {
		User user = new User();
		user.setId("my id");
		user.setName("my name");
		return user;
	}

	@RequestMapping
	public User show() {
		User user = new User();
		user.setId("my id");
		user.setName("my name");
		return user;
	}
}
