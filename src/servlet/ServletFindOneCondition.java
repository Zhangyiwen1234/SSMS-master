package servlet;

import model.Condition;
import service.Impl.ConditionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ServletFindOneCondition extends HttpServlet {
    private Condition condition;
    private ConditionServiceImpl conditionServiceImpl = new ConditionServiceImpl();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String stuName = req.getParameter("stu_name");

        String courseName = req.getParameter("course_name");

        List<Condition> rs = conditionServiceImpl.FindOne(stuName, courseName);
        if(rs.isEmpty()){
            req.getRequestDispatcher("admin/nullCondition.jsp").forward(req, resp);
        }else{
            Condition condition = rs.get(0);
            String v1 = condition.getViolationDiscipline();
            byte[] b1 = v1.getBytes(StandardCharsets.UTF_8);
            byte[] b2={-26,-104,-81};
            int flag = 0;
            for(int i = 0; i < b1.length; i ++)
            {
                flag = 0;
                if(b1[i] == b2[i]){
                    flag = 1;
                }

            }
            req.setAttribute("list", rs);
            if (flag == 1) {
                req.getRequestDispatcher("admin/demo2.jsp").forward(req, resp);
            } else {
                req.getRequestDispatcher("admin/demo1.jsp").forward(req, resp);
            }

        }
        }


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}