package controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.MemberDto;


@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MemberController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id"); System.out.println("id"+id);
		String pw = request.getParameter("pw"); System.out.println("pw"+pw);
		String team = request.getParameter("team"); System.out.println("team"+team);
		String name = request.getParameter("name"); System.out.println("name"+name);
		String phone = request.getParameter("phone"); System.out.println("phone"+phone);
		
		MemberDto memberDto = new MemberDto (id, pw, team, name , phone);
		
	}

}
