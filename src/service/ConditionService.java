package service;

import model.Condition;
import model.PageBean;

import java.util.List;

public interface ConditionService {
    List FindOne(String stuName, String duty);

    List Find(String name);

    PageBean ConditionListPage(int pageNo, int pageCount);

    PageBean ConditionSearch(int pageNo, int pageCount, Condition condition);
}
