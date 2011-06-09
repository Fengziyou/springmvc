package com.esen.web;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;

import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

public class MessageTemplateMethodModel implements TemplateMethodModel {
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

	@Override
	public Object exec(List arg0) throws TemplateModelException {
		if(arg0 == null){
			return "";
		}
		if (arg0.size() == 1) {
			return getText((String) arg0.get(0));
		}else if(arg0.size() >1){
			return getText((String) arg0.get(0),arg0.subList(1, arg0.size()).toArray());
		}
		return null;
	}

}
