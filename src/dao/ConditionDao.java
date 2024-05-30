package dao;

import model.Condition;
import model.PageBean;

import java.util.List;

public interface ConditionDao {
    List FindOne(String stuName, String duty);

    List Find(String name);

    PageBean ConditionListPage(int pageNo, int pageCount);

    PageBean SelectConditon(int pageNo, int pageCount, Condition condition);


}
