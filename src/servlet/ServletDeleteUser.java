package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

import service.Impl.UserServiceImpl;

public class ServletDeleteUser extends HttpServlet{

	private User user;
	private UserServiceImpl userServiceImpl=new UserServiceImpl();
	private PageServlet pageServlet=new PageServlet();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		String userNum=request.getParameter("usernum");
		int rs=userServiceImpl.deleteUser(userNum);
		if(rs>0){
			request.setAttribute("msg", "É¾³ý³É¹¦£¡£¡");
	//		ServletFindAllStu findStu=new ServletFindAllStu();
			pageServlet.doGet(request, response);
			
			/*List list=studentDaoImpl.findAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("admin/studentAllInfo.jsp").forward(request, response);*/
		}else{
			request.setAttribute("msg", "É¾³ýÊ§°Ü£¡£¡");
			pageServlet.doGet(request, response);
			
			/*List list=studentDaoImpl.findAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("admin/studentAllInfo.jsp").forward(request, response);*/
		}
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doGet(request,response);
	}

}
