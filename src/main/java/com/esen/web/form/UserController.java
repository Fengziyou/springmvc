package com.esen.web.form;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esen.entity.User;

@Controller
public class UserController {
	private MessageSourceAccessor messages;
	Map<String, User> users = new HashMap<String, User>();
	
	@Autowired
	public void setMessageSource(MessageSource messageSource){
		messages = new MessageSourceAccessor(messageSource);
	}
	
	public String getText(String key){
		return messages.getMessage(key);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void add(Model model) {
		User user = new User();
		user.setName(getText("info.user.add"));
		model.addAttribute(user);
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return null;
		}
		users.put(user.getName(), user);
		return "redirect:/user/view/" + user.getName();
	}

	@RequestMapping(value = "/view/{name}")
	public String getView(@PathVariable String name, Model model) {
		User user = users.get(name);
		if (user == null) {
			throw new RuntimeException();
		}
		model.addAttribute(user);
		return "user/viewUser";
	}
}
