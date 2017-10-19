

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=  request.getParameter("uname");
		String passwd= request.getParameter("passwd");
		PrintWriter pw= response.getWriter();
//		pw.print(uname);
//		pw.print(passwd);
		if( (uname.equals("ibm")) && (passwd.equals("ibm"))){
			pw.print("<html>");
			pw.print("<body>");
			pw.print("welcome to ibm");
		}
		else{
//			HttpSession ss= request.getSession();
//			ss.setAttribute("error", "Your login credentials dont match");
			response.sendRedirect("error.jsp");
		}
				
	}

}
