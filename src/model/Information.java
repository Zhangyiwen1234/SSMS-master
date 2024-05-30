package model;

import java.util.Date;

public class Information {
    private Integer id;
    /**
     * 学号
     */
    private String inName;
    /**
     * 姓名
     */
    private String inSex;
    /**
     * 班级
     */
    private Date inBirth;
    /**
     * 科目
     */
    private String inNation;
    /**
     * 成绩
     */
    private String inNativeplace;
    /**
     * 专业
     */
    private String inBirthplace;

    private Date inPartytime;

    private Date inWorktime;

    private String inTeposition;

    private String inFaprofes;

    private String inFulleducate;

    private String inServeducate;

    private String inCollagemajor;

    private String inCurrentpos;

    private String inProposedpos;

    private String inDismisspos;

    private String inResume;

    private String inRepunish;

    private String inAnnualresult;

    private String inReportunit;

    private String inIdcard;

    private String inReason;

    private Date inDate;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInName() {
        return inName;
    }

    public void setInName(String inName) {
        this.inName = inName;
    }

    public String getInSex() {
        return inSex;
    }

    public void setInSex(String inSex) {
        this.inSex = inSex;
    }

    public Date getInBirth() {
        return inBirth;
    }

    public void setInBirth(Date inBirth) {
        this.inBirth = inBirth;
    }

    public String getInNation() {
        return inNation;
    }

    public void setInNation(String inNation) {
        this.inNation = inNation;
    }

    public String getInNativeplace() {
        return inNativeplace;
    }

    public void setInNativeplace(String inNativeplace) {
        this.inNativeplace = inNativeplace;
    }

    public String getInBirthplace() {
        return inBirthplace;
    }

    public void setInBirthplace(String inBirthplace) {
        this.inBirthplace = inBirthplace;
    }

    public Date getInPartytime() {
        return inPartytime;
    }

    public void setInPartytime(Date inPartytime) {
        this.inPartytime = inPartytime;
    }

    public Date getInWorktime() {
        return inWorktime;
    }

    public void setInWorktime(Date inWorktime) {
        this.inWorktime = inWorktime;
    }

    public String getInTeposition() {
        return inTeposition;
    }

    public void setInTeposition(String inTeposition) {
        this.inTeposition = inTeposition;
    }

    public String getInFaprofes() {
        return inFaprofes;
    }

    public void setInFaprofes(String inFaprofes) {
        this.inFaprofes = inFaprofes;
    }

    public String getInFulleducate() {
        return inFulleducate;
    }

    public void setInFulleducate(String inFulleducate) {
        this.inFulleducate = inFulleducate;
    }

    public String getInServeducate() {
        return inServeducate;
    }

    public void setInServeducate(String inServeducate) {
        this.inServeducate = inServeducate;
    }

    public String getInCollagemajor() {
        return inCollagemajor;
    }

    public void setInCollagemajor(String inCollagemajor) {
        this.inCollagemajor = inCollagemajor;
    }

    public String getInCurrentpos() {
        return inCurrentpos;
    }

    public void setInCurrentpos(String inCurrentpos) {
        this.inCurrentpos = inCurrentpos;
    }

    public String getInProposedpos() {
        return inProposedpos;
    }

    public void setInProposedpos(String inProposedpos) {
        this.inProposedpos = inProposedpos;
    }

    public String getInDismisspos() {
        return inDismisspos;
    }

    public void setInDismisspos(String inDismisspos) {
        this.inDismisspos = inDismisspos;
    }

    public String getInResume() {
        return inResume;
    }

    public void setInResume(String inResume) {
        this.inResume = inResume;
    }

    public String getInRepunish() {
        return inRepunish;
    }

    public void setInRepunish(String inRepunish) {
        this.inRepunish = inRepunish;
    }

    public String getInAnnualresult() {
        return inAnnualresult;
    }

    public void setInAnnualresult(String inAnnualresult) {
        this.inAnnualresult = inAnnualresult;
    }

    public String getInReportunit() {
        return inReportunit;
    }

    public void setInReportunit(String inReportunit) {
        this.inReportunit = inReportunit;
    }

    public String getInIdcard() {
        return inIdcard;
    }

    public void setInIdcard(String inIdcard) {
        this.inIdcard = inIdcard;
    }

    public String getInReason() {
        return inReason;
    }

    public void setInReason(String inReason) {
        this.inReason = inReason;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Information(String inName, String inSex, Date inBirth, String inNation, String inNativeplace, String inBirthplace, Date inPartytime, Date inWorktime, String inTeposition, String inFaprofes, String inFulleducate, String inServeducate, String inCollagemajor, String inCurrentpos, String inProposedpos, String inDismisspos, String inResume, String inRepunish, String inAnnualresult,
                       String inReportunit, String inReason,String inIdcard, Date inDate) {

        this.inName = inName;
        this.inSex = inSex;
        this.inBirth = inBirth;
        this.inNation = inNation;
        this.inNativeplace = inNativeplace;
        this.inBirthplace = inBirthplace;
        this.inPartytime = inPartytime;
        this.inWorktime = inWorktime;
        this.inTeposition = inTeposition;
        this.inFaprofes = inFaprofes;
        this.inFulleducate = inFulleducate;
        this.inServeducate = inServeducate;
        this.inCollagemajor = inCollagemajor;
        this.inCurrentpos = inCurrentpos;
        this.inProposedpos = inProposedpos;
        this.inDismisspos = inDismisspos;
        this.inResume = inResume;
        this.inRepunish = inRepunish;
        this.inAnnualresult = inAnnualresult;
        this.inReportunit = inReportunit;
        this.inIdcard = inIdcard;
        this.inReason = inReason;
        this.inDate = inDate;
    }
}
