package servlet;

import model.PageBean;
import model.Score;
import service.Impl.ScoreServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SelectTeacherAllScore extends HttpServlet{


    private Score score;
    private ScoreServiceImpl scoreServiceImpl=new ScoreServiceImpl();

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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

        PageBean list=scoreServiceImpl.scoreListPage(pageNo, pageCount);
        request.setAttribute("list", list);
        request.getRequestDispatcher("admin/teaAllInfo.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }
}


