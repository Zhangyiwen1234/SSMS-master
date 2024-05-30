package dao.Impl;

import dao.InformationDao;
import db.DBCon;
import model.Information;
import model.ScoreCou;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InformationDaoImpl implements InformationDao {
    private DBCon dbCon = new DBCon();

    @Override
    public List FindOne(String IdCard) {
        List<Information> list = new ArrayList<Information>();
        String sql = "select in_name,in_sex,in_birth,in_nation,in_nativePlace,in_birthPlace,in_partyTime,in_workTime,in_tePosition,in_faProfes,in_fulleducate" +
                ",in_serveducate,in_collageMajor,in_currentpos,in_proposedpos,in_dismisspos,in_resume,in_repunish,in_annualresult,in_reportunit,in_idcard,in_reason,in_date "
                + "from information where in_idcard='"+IdCard+"'";

        ResultSet rs = dbCon.find(sql);
        try {
            while (rs.next()) {

                String inName = rs.getString("in_name");
                String inSex = rs.getString("in_sex");
                Date inBirth = rs.getDate("in_birth");
                String inNation = rs.getString("in_nation");
                String inNativePlace = rs.getString("in_nativePlace");
                String inBithPlace = rs.getString("in_birthPlace");
                Date inPartyTime = rs.getDate("in_partyTime");
                Date inWorkTime = rs.getDate("in_workTime");
                String inTePosition = rs.getString("in_tePosition");
                String inFaProfes = rs.getString("in_faProfes");
                String inFulleducate = rs.getString("in_fulleducate");
                String inServeducate = rs.getString("in_serveducate");
                String inCollageMajor = rs.getString("in_collageMajor");
                String inCurrentPos = rs.getString("in_currentPos");
                String inProposedpos = rs.getString("in_proposedpos");
                String inDismissPos = rs.getString("in_dismisspos");
                String inResume = rs.getString("in_resume");
                String  inRepunish = rs.getString("in_repunish");
                String inAnualresult = rs.getString("in_annualresult");
                String inReportunit = rs.getString("in_reportunit");
                String inIdcard = rs.getString("in_idcard");
                String inReason = rs.getString("in_reason");
                Date inDate = rs.getDate("in_date");

                Information in = new Information(inName,inSex,inBirth,inNation,inNativePlace,inBithPlace,inPartyTime
                        ,inWorkTime,inTePosition,inFaProfes,inFulleducate,inServeducate,inCollageMajor,inCurrentPos,
                        inProposedpos,inDismissPos, inResume,inRepunish,inAnualresult,inReportunit,inIdcard,inReason,inDate);
                list.add(in);
            }
        } catch (
                SQLException e) {

            e.printStackTrace();
        }
        return list;
    }

}

