package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsRole;
import service.Impl.UserServiceImpl;

import model.User;

import dao.Impl.UserDaoImpl;

public class ServletEditUser extends HttpServlet{

	private User user;
	private ServletselectPwd servletselectpwd=new ServletselectPwd();
	private ServletLogin servletLogin = new ServletLogin();
	private UserServiceImpl userServiceImpl=new UserServiceImpl();
	private UserDaoImpl userDaoImpl = new UserDaoImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String roleName = request.getParameter("roleName");

		String userNum = request.getParameter("userNum");
		String userName = request.getParameter("userName");

		String pwd = request.getParameter("password");

		String phone = request.getParameter("phone");

		int userId = Integer.parseInt(request.getParameter("userid"));

		user = new User(userId, userNum, userName, pwd, phone, roleName);
		int rs = userServiceImpl.editUser(user);
		if (rs > 0) {
			request.setAttribute("msg", "修改成功！！");
			PrintWriter out = response.getWriter();
			out.println("<script>window.open('login/login.jsp', '_blank'); window.close();</script>");
		} else {
			request.setAttribute("msg", "修改失败！！");
			servletselectpwd.doGet(request, response);
		}
	}


	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doGet(request,response);
	}

}

/*
package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.Impl.StudentServiceImpl;

import model.Student;
import dao.Impl.StudentDaoImpl;
import service.Impl.UserServiceImpl;

public class ServletEditUser extends HttpServlet{

	private User user;

	private ServletFindAllUser servletFindAllUser=new ServletFindAllUser();
	private UserServiceImpl userServiceImpl=new UserServiceImpl();
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		String userNum=request.getParameter("userNum");
		String userName=request.getParameter("userName");
		String pwd=request.getParameter("password");
		String phone=request.getParameter("phone");
		int roleID=Integer.parseInt(request.getParameter("roleID"));

		user = new User(userNum, userName, pwd, phone,roleID);
		int rs=userServiceImpl.editUser(user);
		if(rs>0){
			request.setAttribute("msg", "修改成功！！");
			servletFindAllUser.doGet(request, response);
		}else{
			request.setAttribute("msg", "修改失败！！");
			request.getRequestDispatcher("admin/editUser.jsp").forward(request, response);
		}

	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doGet(request,response);
	}
}

*/
