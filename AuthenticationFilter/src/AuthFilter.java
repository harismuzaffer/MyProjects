

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class AuthFilter implements Filter {

   
    public AuthFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		String uname= request.getParameter("uname");
		String passwd= request.getParameter("passwd");
		
		if(uname.equals("admin") && passwd.equals("admin")){
			
			System.out.println(request.getRemoteAddr()+"-----"+new Date().toString());
			chain.doFilter(request, response);
		}
		else{
			System.out.println(request.getRemoteAddr()+"-----"+new Date().toString());
			response.setContentType("text/html");
			PrintWriter pw= response.getWriter();
			pw.print("invalid uname and passwd combination, pls retry");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
