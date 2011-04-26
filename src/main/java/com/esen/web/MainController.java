package com.esen.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping
	public String init(Model model) {
		model.addAttribute("msg", new ReportRender());
		return "main";
	}
}
