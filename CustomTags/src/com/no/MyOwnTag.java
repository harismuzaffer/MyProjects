package com.no;
//import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyOwnTag extends SimpleTagSupport{

	public void doTag() throws JspException, IOException{
		
		JspWriter out=getJspContext().getOut();
		out.print("victory is here just go out");
	}
	
}
