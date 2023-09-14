package controller.product;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import dto.ProductDto;


@WebServlet("/ProductControll")
public class ProductControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ProductControll() {
        super();   }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("연결");
		ArrayList<ProductDto> result = ProductDao.getInstence().pview();
		
		System.out.println("컨트롤러 result :"+result);
		response.setContentType("application/json;charset=UTF-8"); // js에서 true로 인식
    	response.getWriter().print(result);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
