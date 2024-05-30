/*package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Impl.UserServiceImpl;

import dao.Impl.UserDaoImpl;

public class ServletFindAllUser extends HttpServlet{

    private UserServiceImpl userServiceImpl=new UserServiceImpl();

    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        List rs=userServiceImpl.findAll();
        request.setAttribute("list", rs);
        request.getRequestDispatcher("admin/userAllInfo.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        doGet(request,response);
    }

}*/
package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.Impl.StudentServiceImpl;

import dao.Impl.StudentDaoImpl;

import model.PageBean;
import model.Student;
import service.Impl.UserServiceImpl;


public class ServletFindAllUser extends HttpServlet{

    private User user;
    private UserServiceImpl userServiceImpl=new UserServiceImpl();

    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        int pageNo=1;
        int pageCount=10;

        String pageNoStr=request.getParameter("pageNo");
        String pageCountStr=request.getParameter("pageCount");


        if(pageNoStr!=null){
            pageNo=Integer.parseInt(pageNoStr);
        }
        if(pageCountStr!=null){
            pageCount=Integer.parseInt(pageCountStr);
        }


        PageBean list=userServiceImpl.userListPage(pageNo, pageCount);

        request.setAttribute("list", list);
        request.getRequestDispatcher("admin/userAllInfo.jsp").forward(request, response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        doGet(request,response);
    }

}


