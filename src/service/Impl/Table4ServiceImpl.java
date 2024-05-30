package service.Impl;

import dao.Impl.Table4Impl;
import model.PageBean;
import service.Table4Service;

import java.util.List;

public class Table4ServiceImpl implements Table4Service {
    private Table4Impl table4Impl=new Table4Impl();


    public List FindOne(String duty) {

        List rs= table4Impl.FindOne(duty);
        return rs;
    }

    @Override
    public int Find(String name, String duty) {
        int count = table4Impl.Find(name, duty);
        return count;
    }

}
