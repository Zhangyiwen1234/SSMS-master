package servlet;

import model.User;
import service.Impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletselectPwd1  extends HttpServlet {
        private User user;
        private UserServiceImpl userServiceImpl=new UserServiceImpl();

        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            String userNum=(String) request.getSession().getAttribute("usernum");
            System.out.println(userNum);
            user=new User();
            user.setUserNum(userNum);
            User rs=userServiceImpl.login(user);
            String pwd=rs.getPassword();
            String phone=rs.getPhone();
            int userId = rs.getUserID();
            String roleName = rs.getRoleName();
            request.setAttribute("password", pwd);
            request.setAttribute("phone", phone);
            request.setAttribute("userid",userId);
            request.setAttribute("rolename",roleName);
            request.getRequestDispatcher("admin/SelectPwd1.jsp").forward(request, response);

        }
        public void doPost(HttpServletRequest request,HttpServletResponse response)
                throws ServletException,IOException{
            doGet(request,response);
        }
    }

