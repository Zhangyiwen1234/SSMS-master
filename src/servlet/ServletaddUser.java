package servlet;

import model.Teacher;
import model.User;
import service.Impl.TeacherServiceImpl;
import service.Impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletaddUser extends HttpServlet {
    private User user;

    private UserServiceImpl userServiceImpl = new UserServiceImpl();

    private PageServlet pageServlet=new PageServlet();

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userNum = request.getParameter("userNum");
        String userName = request.getParameter("userName");
        String password = request.getParameter("Password");
        String phone = request.getParameter("phone");
        String roleName = request.getParameter("roleName");

        user = new User(userNum, userName, password, phone, roleName);

        //验证是否存在该教师
        User rs=userServiceImpl.login(user);

        if(rs.getUserID()==0){
            int rsUser=userServiceImpl.addUser(user);

            if(rsUser>0){
                request.setAttribute("msg", "添加成功！！");
                pageServlet.doGet(request, response);
                //request.getRequestDispatcher("admin/userAllInfo.jsp").forward(request, response);
				/*List list=studentDaoImpl.findAll();
				request.setAttribute("list", list);
				request.getRequestDispatcher("admin/studentAllInfo.jsp").forward(request, response);*/
            }else{
                request.setAttribute("msg", "添加失败！！");
                request.getRequestDispatcher("admin/addUser.jsp").forward(request, response);
            }
        }else{
            request.setAttribute("msg", "该账号已存在，请重新录入！！");
            request.getRequestDispatcher("admin/addUser.jsp").forward(request, response);
        }


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}

