package servlet;

import model.Condition;
import model.PageBean;
import model.Table4;
import service.Impl.StudentServiceImpl;
import service.Impl.Table4ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ServletFindOneTable extends HttpServlet {
    private Table4ServiceImpl table4ServiceImpl=new Table4ServiceImpl();

   /* public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int pageNo=1;
        int pageCount=10;

        String pageNoStr=request.getParameter("pageNo");
        String pageCountStr=request.getParameter("pageCount");
        String stuName = request.getParameter("stu_name");
        String duty = request.getParameter("course_name");


        if(pageNoStr!=null){
            pageNo=Integer.parseInt(pageNoStr);
        }
        if(pageCountStr!=null){
            pageCount=Integer.parseInt(pageCountStr);
        }


        PageBean list=table4ServiceImpl.FindOne(pageNo, pageCount,stuName, duty);

        request.setAttribute("list", list);
        request.getRequestDispatcher("admin/table4.jsp").forward(request, response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        doGet(request,response);
    }*/
   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String stuName = req.getParameter("name");

       List<Table4> rs = table4ServiceImpl.FindOne(stuName);
       // 判断是否已经存在相同数据，避免重复添加
       if(rs == null){
           req.getRequestDispatcher("admin/scoreAllInfo");
       }
       req.setAttribute("list", rs);
       req.getRequestDispatcher("admin/table4.jsp").forward(req, resp);
       rs.clear();
   }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
