package ch02;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   int num1 = Integer.parseInt(request.getParameter("num1"));
	   int num2 = Integer.parseInt(request.getParameter("num2"));
	   PrintWriter out = response.getWriter();
	   out.println("<html><body>");
		out.println("<h2>두수의 합</h2>");
	//	out.println(num1 + "+" + num2+ "=" + (num1+num2));
		out.printf("%d + %d = %d" , num1, num2, num1+num2);
		out.println("</body> </html>");
	    out.close()	;
	   
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
