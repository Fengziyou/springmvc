package com.esen.web.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/schedule")
public class ScheduleWizardFormController {
	@RequestMapping(params = "_finish")
	public String finish() {
		return null;
	}

	@RequestMapping(params = "_cancel")
	public String cancel() {
		return null;
	}

	@RequestMapping(value = { "/add", "/one" })
	public String stepOne(Model model) {
		model.addAttribute(new User());
		return "schedule/one";
	}

	@RequestMapping(value = "/two")
	public String stepTwo() {
		return null;
	}

}
