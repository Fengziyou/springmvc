package com.esen.web;

import java.io.IOException;
import java.io.Writer;

import org.apache.velocity.context.InternalContextAdapter;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.Renderable;

public class ReportRender implements Renderable {

	public boolean render(InternalContextAdapter context, Writer writer) throws IOException, MethodInvocationException,
			ParseErrorException, ResourceNotFoundException {
		writer.write("<div>\n");
		writer.write("<input type='text' value='hehe' />\n");
		writer.write("</div>\n");
		return true;
	}
}
