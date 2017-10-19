package com.some;

import java.io.*;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

public class Container_Tag extends SimpleTagSupport {

	public void doTag() throws JspException, IOException {
		
		StringWriter wrt= new StringWriter();
		getJspBody().invoke(wrt);
		
		JspWriter out= getJspContext().getOut();
		out.print(wrt.toString()+" ( confirmed ) ");
	}
		
	
}
