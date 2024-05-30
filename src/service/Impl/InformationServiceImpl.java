package service.Impl;

import dao.Impl.InformationDaoImpl;
import dao.Impl.ScoreDaoImpl;
import dao.InformationDao;

import java.util.List;

public class InformationServiceImpl {
    private InformationDaoImpl informationDaoImpl=new InformationDaoImpl();
    public List findOne(String IdCard) {

        List rs= informationDaoImpl.FindOne(IdCard);
        return rs;
    }
}
