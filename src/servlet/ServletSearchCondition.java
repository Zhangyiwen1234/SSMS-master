package servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Condition;
import model.PageBean;
import model.Score;

//import org.omg.CORBA.Request;

import service.Impl.ConditionServiceImpl;
import service.Impl.ScoreServiceImpl;

public class ServletSearchCondition extends HttpServlet{

    private Condition condition;
    private ConditionServiceImpl conditionServiceImpl=new ConditionServiceImpl();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // 日期格式根据实际情况调整
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        doPost(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int pageNo=1;
        int pageCount=1;
        String pageNoStr=request.getParameter("pageNo");
        String pageCountStr=request.getParameter("pageCount");
        if(pageNoStr!=null){
            pageNo=Integer.parseInt(pageNoStr);
        }
        if(pageCountStr!=null){
            pageCount=Integer.parseInt(pageCountStr);
        }

        String name=request.getParameter("name");
        System.out.println(name);
        String duty = request.getParameter("duty");
        String rank = request.getParameter("rank");
        String politicalLook = request.getParameter("political_look");
        String issues = request.getParameter("issues");


        String processingTimeStr = request.getParameter("processing_time");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 日期格式根据实际情况调整
//        Date processingTime = null;
//        try {
//            processingTime = sdf.parse(processingTimeStr);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            // 处理日期格式解析异常
//        }

        String processingMethod = request.getParameter("processing_method");

       /* String completionTimeStr = request.getParameter("completion_time");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); // 日期格式根据实际情况调整
        Date completionTime = null;
        try {
            completionTime = sdf1.parse(completionTimeStr);
        } catch (ParseException e) {
            e.printStackTrace();
            // 处理日期格式解析异常
        }
*/
        String undertaker = request.getParameter("undertaker");
        String disposalResult = request.getParameter("disposal_result");
        String clueClassfication = request.getParameter("clue_classfication");
        String caseNumber = request.getParameter("case_number");
        String violationDiscipline = request.getParameter("violation_discipline");

        if(name==""){
            name=null;
        }
        Condition condition = new Condition(name, duty,rank, politicalLook, issues,processingMethod
                ,undertaker,disposalResult,clueClassfication,caseNumber,
                violationDiscipline);
        PageBean rs=conditionServiceImpl.ConditionSearch(pageNo, pageCount, condition);
        request.setAttribute("list", rs);
        request.setAttribute("score", condition);
        request.getRequestDispatcher("admin/selectblurcondition.jsp").forward(request, response);
    }

}