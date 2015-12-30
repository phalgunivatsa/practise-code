package com.yash.jstl.domain;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Customer extends TagSupport {
	private String name;
	private String type;
	private String value;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setValue(String value) {
		this.value = value;
	}



	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.println("<input name" + name + " type" + type +" + value "+ value + "/>");
	
			} catch (Exception ioException) {
			System.err.println("IO Exception");
			System.err.println("ioException.toString()");
		}
		return SKIP_BODY;
	}


	
}
