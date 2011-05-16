package com.esen.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esen.entity.User;

@Controller
public class MainController extends BaseController {
	@RequestMapping
	public String init(Model model, HttpServletRequest req, HttpServletResponse response) {
		List list = new ArrayList();
		User user = new User();
		user.setId("1111");
		list.add(user);
		list.add(user);
		model.addAttribute("list", list);
		String username = "史安明";
		model.addAttribute("username", username);

		model.addAttribute("msg", getText("info.hello", new String[] { username }));
		String ctx = req.getContextPath();
		model.addAttribute("ctx", "<meta id=\"succezbi-context-path\" name=\"succezbi-context-path\" content=\"" + ctx
				+ "\">");
		return "main";

	}
}
