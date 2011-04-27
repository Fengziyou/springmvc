package com.esen.web.ajax;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.esen.entity.User;

@Controller("ajaxSimple")
@Scope("session")
public class SimpleController {
	public SimpleController() {
		System.err.println("---------------------------------------");
	}

	@RequestMapping
	@ResponseBody
	public List json() {
		List list = new ArrayList();
		User user = new User();
		user.setId("my id");
		user.setName("my name");
		list.add(user);
		list.add(user);
		return list;
	}

	@RequestMapping
	@ResponseBody
	public List xml(Model model) {
		List list = new ArrayList();
		User user = new User();
		user.setId("my id");
		user.setName("my name");

		list.add(user);
		User user2 = new User();
		user2.setId("my id");
		user2.setName("my name");
		list.add(user);
		model.addAttribute("msg", "task msg");
		
		return list;
	}

	@RequestMapping
	public User show() {
		System.err.println(this);
		User user = new User();
		user.setId("my id");
		user.setName("my name");
		return user;
	}
}
