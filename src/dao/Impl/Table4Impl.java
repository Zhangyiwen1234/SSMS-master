package dao.Impl;

import dao.Table4Dao;
import db.DBCon;
import model.PageBean;
import model.Score;
import model.Table4;
import model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Table4Impl implements Table4Dao {
    private DBCon dbCon = new DBCon();
    List<Table4> list = new ArrayList();
    private PageBean pageBean = null;

@Override
    public List FindOne(String Duty) {
        String sql = "select * from table4 where duty = '"+ Duty + "'";
        ResultSet rs = dbCon.find(sql);
        try {
            while(rs.next()){
                String person = rs.getString("person");
                String position = rs.getString("position");
                String rank = rs.getString("rank");
                String status = rs.getString("status");
                Date violationTime = rs.getDate("violation_time");
                String violationFacts = rs.getString("violation_facts");
                String handingSituation = rs.getString("handing_situation");
                String processingNumber = rs.getString("processing_number");
                String duty = rs.getString("duty");
                Table4 table = new Table4(person, position, rank, status, violationTime, violationFacts, handingSituation, processingNumber,duty);
                list.add(table);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int Find(String name, String du) {
        String sql = "SELECT count(*) FROM table4 where duty='"+name+"' or duty = '" +du+"'";;
        ResultSet resultSet = dbCon.find(sql);
        int count = 0;
        try {
            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;

    }

    /*public PageBean FindOne(int pageNo, int pageCount, String stuName,
                                   String Duty) {
        int totalCount = 0;
        List<Table4> list = new ArrayList<>();
        String sql = "select * from table4 where duty ='"
                + stuName
                + "'  or duty='" + Duty + "'"
                + " limit "
                + ((pageNo - 1) * pageCount)
                + "," + pageCount;
        String sqlCount = "select count(*) from table4 where duty ='"
                + stuName
                + "'  or duty='" + Duty + "'"
                + " limit "
                + ((pageNo - 1) * pageCount)
                + "," + pageCount;
        ResultSet rs = dbCon.find(sql);
        try {
            while (rs.next()) {
                String person = rs.getString("person");
                Date violationTime = rs.getDate("violation_time");
                String violationFacts = rs.getString("violation_facts");
                String handingSituation = rs.getString("handing_situation");
                String processingNumber = rs.getString("processing_number");
                String duty = rs.getString("duty");
                Table4 table = new Table4(person, violationTime, violationFacts, handingSituation, processingNumber,duty);
                list.add(table);
            }
            rs = dbCon.find(sqlCount);
            while (rs.next()) {
                totalCount = rs.getInt(1);
            }

            pageBean = new PageBean(list, totalCount, pageNo, pageCount);
        } catch (SQLException e) {
            dbCon.close();
            e.printStackTrace();
        }
        return pageBean;
    }*/
}
