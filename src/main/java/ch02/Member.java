package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Member
 */
@WebServlet("/Member")
public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		int password = Integer.parseInt(request.getParameter("password"));
		String gender = request.getParameter("gender");
		String[] email = request.getParameterValues("email");
		String[] hobby = request.getParameterValues("hobby");

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<h2> 회원정보 </h2>");
		out.println("아이디 : " + id + "<p>");
		out.println("비밀번호 : " + password + "<p>");
		out.println("성별 : " + gender + "<p>");

		out.println("메일 수신 여부 : ");

		if (email == null)
			out.println("선택한 항목이 없습니다");
		
		for (int i = 0; i < email.length; i++) {
			if (i == email.length - 1)
				out.println(email[i] + "<p>");

			else
				out.println(email[i] + ",");
		}

		out.println("취미 : ");
		if (hobby == null)
			out.println("선택한 항목이 없습니다");
		for (int i = 0; i < hobby.length; i++) {

			if (i == hobby.length - 1)
				out.println(hobby[i]);

			else
				out.println(hobby[i] + ",");

		}

		out.println("</body> </html>");
		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
