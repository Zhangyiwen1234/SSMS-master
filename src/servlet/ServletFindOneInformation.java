package servlet;

import model.Course;
import model.Information;
import service.Impl.CourseServiceImpl;
import service.Impl.InformationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ServletFindOneInformation extends HttpServlet {
    private Information information;
    private InformationServiceImpl informationServiceImpl=new InformationServiceImpl();

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String inCard = request.getParameter("major");
        List rs=informationServiceImpl.findOne(inCard);

        request.setAttribute("list", rs);
        request.getRequestDispatcher("admin/information.jsp").forward(request, response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
