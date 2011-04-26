package com.esen.web;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;

public class BaseController {
	private MessageSourceAccessor messages;

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		messages = new MessageSourceAccessor(messageSource);
	}

	public String getText(String code) {
		return messages.getMessage(code);
	}

	public String getText(String code, Locale locale) {
		return messages.getMessage(code, locale);
	}

	public String getText(String code, Object[] args, Locale locale) {
		return messages.getMessage(code, args, locale);
	}

	public String getText(String code, Object[] args) {
		return messages.getMessage(code, args);
	}
}
