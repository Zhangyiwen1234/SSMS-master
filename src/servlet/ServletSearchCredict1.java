package servlet;

import service.Impl.ConditionServiceImpl;
import service.Impl.Table4ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ServletSearchCredict1 extends HttpServlet {
    private ConditionServiceImpl conditionServiceImpl = new ConditionServiceImpl();
    private Table4ServiceImpl table4ServiceImpl = new Table4ServiceImpl();
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String duty = req.getParameter("course_name");
        String inCard = req.getParameter("stu_name");
        List rs1 = conditionServiceImpl.FindOne(inCard, duty);
        if(rs1.isEmpty()){
            req.setAttribute("name", inCard);
            req.getRequestDispatcher("admin/certificate1.jsp").forward(req, resp);
        }else{
            int count = table4ServiceImpl.Find(inCard, duty);
            if(count == 0){
                req.setAttribute("name", inCard);
                req.getRequestDispatcher("admin/certificate2.jsp").forward(req, resp);
            }else{
                req.setAttribute("name", inCard);
                req.getRequestDispatcher("admin/certificate3.jsp").forward(req, resp);
            }

        }

    }


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
}
