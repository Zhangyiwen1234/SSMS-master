package service.Impl;


import model.Condition;
import model.PageBean;
import service.ConditionService;
import dao.Impl.ConditionImpl;
import java.util.List;

public class ConditionServiceImpl implements ConditionService {
    private ConditionImpl conditionImpl = new ConditionImpl();
    @Override
    public List FindOne(String stuName, String duty) {
        List rs = conditionImpl.FindOne(stuName, duty);
        return rs;
    }

    @Override
    public List Find(String name) {
        List rs = conditionImpl.Find(name);
        return rs;
    }

    @Override
    public PageBean ConditionListPage(int pageNo, int pageCount) {
        PageBean rs=conditionImpl.ConditionListPage(pageNo,pageCount);
        return rs;
    }

    @Override
    public PageBean ConditionSearch(int pageNo, int pageCount, Condition condition) {
        PageBean rs = conditionImpl.SelectConditon(pageNo, pageCount, condition);
        return rs;
    }
}
