package dao.Impl;

import dao.ConditionDao;
import db.DBCon;
import model.Condition;
import model.PageBean;
import model.Score;
import model.ScoreCou;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConditionImpl implements ConditionDao {
    private DBCon dbCon = new DBCon();
    private PageBean pageBean = null;
    @Override
    public List FindOne(String stuName, String du) {
        List<Condition> list = new ArrayList<>();

/*      String sql = SELECT * FROM `condition`;
                "from condition where id='"+id+"'";*/
        String sql = "SELECT * FROM `condition` where name='"+stuName+"' or name = '" +du+"'";;
        ResultSet rs = dbCon.find(sql);
        try {
            while(rs.next()){
                String name = rs.getString("name");
                String duty = rs.getString("duty");
                String rank = rs.getString("rank");
                String politicalLook = rs.getString("political_look");
                String issues = rs.getString("issues");
                Date processingTime = rs.getDate("processing_time");
                String processingMethod = rs.getString("processing_method");
                Date completionTime = rs.getDate("completion_time");
                String undertaker = rs.getString("undertaker");
                String disposalResult = rs.getString("disposal_result");
                String clueClassfication = rs.getString("clue_classfication");
                String caseNumber = rs.getString("case_number");
                String violationDiscipline = rs.getString("violation_discipline");
                Condition condition = new Condition(name, duty,rank, politicalLook, issues,processingTime,processingMethod
                        ,completionTime,undertaker,disposalResult,clueClassfication,caseNumber,
                        violationDiscipline);
                list.add(condition);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public List Find(String stuname){
        List<Condition> list = new ArrayList<>();
        String sql = "select * from `condition` where name='"+stuname+"'";
        ResultSet rs = dbCon.find(sql);
        try{
            while(rs.next()){
                String name = rs.getString("name");
                String duty = rs.getString("duty");
                String rank = rs.getString("rank");
                String politicalLook = rs.getString("political_look");
                String issues = rs.getString("issues");
                Date processingTime = rs.getDate("processing_time");
                String processingMethod = rs.getString("processing_method");
                Date completionTime = rs.getDate("completion_time");
                String undertaker = rs.getString("undertaker");
                String disposalResult = rs.getString("disposal_result");
                String clueClassfication = rs.getString("clue_classfication");
                String caseNumber = rs.getString("case_number");
                String violationDiscipline = rs.getString("violation_discipline");
                Condition condition = new Condition(name, duty,rank, politicalLook, issues,processingTime,processingMethod
                        ,completionTime,undertaker,disposalResult,clueClassfication,caseNumber,
                        violationDiscipline);
                list.add(condition);

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public PageBean ConditionListPage(int pageNo, int pageCount) {
        int totalCount = 0;
        List<Condition> list = new ArrayList<Condition>();
        /*String sql = "select * from `condition` limit"
                + ((pageNo - 1) * pageCount)
                + ","
                + pageCount;
        String sqlCount = "select count(*) `condition` limit";*/
        String sql = "select * from `condition` limit "
                + ((pageNo - 1) * pageCount)
                + ", "
                + pageCount;
        String sqlCount = "select count(*) as total from `condition`";
        ResultSet rs = dbCon.find(sql);
        try {
            while (rs.next()) {
                String name = rs.getString("name");
                String duty = rs.getString("duty");
                String rank = rs.getString("rank");
                String politicalLook = rs.getString("political_look");
                String issues = rs.getString("issues");
                Date processingTime = rs.getDate("processing_time");
                String processingMethod = rs.getString("processing_method");
                Date completionTime = rs.getDate("completion_time");
                String undertaker = rs.getString("undertaker");
                String disposalResult = rs.getString("disposal_result");
                String clueClassfication = rs.getString("clue_classfication");
                String caseNumber = rs.getString("case_number");
                String violationDiscipline = rs.getString("violation_discipline");
                Condition condition = new Condition(name, duty,rank, politicalLook, issues,processingTime,processingMethod
                        ,completionTime,undertaker,disposalResult,clueClassfication,caseNumber,
                        violationDiscipline);
                list.add(condition);
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
    }

    @Override
    public PageBean SelectConditon(int pageNo, int pageCount, Condition condition) {
        int totalCount = 0;
        String sql = null;
        String sqlCount = null;
        List<Condition> list = new ArrayList<>();
        if(condition.getName() != null){
            sql = "select * from `condition` where name like '%"
                    + condition.getName() + "%' limit " + ((pageNo - 1) * pageCount)
                    + "," + pageCount;
            sqlCount = "select count(*) from `condition` where name like '%"
                    + condition.getName() + "%'";
        }

        ResultSet rs = dbCon.find(sql);
        try {
            while (rs.next()) {
                String name = rs.getString("name");
                String duty = rs.getString("duty");
                String rank = rs.getString("rank");
                String politicalLook = rs.getString("political_look");
                String issues = rs.getString("issues");
                String processingMethod = rs.getString("processing_method");
                String undertaker = rs.getString("undertaker");
                String disposalResult = rs.getString("disposal_result");
                String clueClassfication = rs.getString("clue_classfication");
                String caseNumber = rs.getString("case_number");
                String violationDiscipline = rs.getString("violation_discipline");
                Condition condition1 = new Condition(name, duty,rank, politicalLook, issues,processingMethod
                       ,undertaker,disposalResult,clueClassfication,caseNumber,
                        violationDiscipline);
                list.add(condition1);
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

    }

}
