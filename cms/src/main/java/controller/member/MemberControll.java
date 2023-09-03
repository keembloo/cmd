package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.MemberDao;
import dto.MemberDto;


@WebServlet("/MemberControll")
public class MemberControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MemberControll() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("input_id"); //System.out.println("id : "+id);
		String pw = request.getParameter("input_pw"); //System.out.println("pw : "+pw);
		String team = request.getParameter("team_select"); //System.out.println("team : "+team);
		int clevel = Integer.parseInt(request.getParameter("level_select")); //System.out.println("clevel : "+clevel);
		String name = request.getParameter("input_name"); //System.out.println("name : "+name);
		
		MemberDto memberDto = new MemberDto(clevel, team, name, id, pw);
		
		boolean result = MemberDao.getInstence().signup(memberDto);
		
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(result);
	}


	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
