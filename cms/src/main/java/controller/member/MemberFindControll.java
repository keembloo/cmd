package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import dto.MemberDto;


@WebServlet("/MemberFindControll")
public class MemberFindControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MemberFindControll() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// 로그인
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		boolean result = MemberDao.getInstence().login(id, pw);
		
		
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().print(result); 
	}

}
