package model;

import java.util.Date;

public class Condition {

        private Integer id;

        private String name;

        private String duty;

        private String rank;

        private String politicalLook;

        private String issues;

        private Date processingTime;

        private String processingMethod;

        private Date completionTime;

        private String undertaker;

        private String disposalResult;

        private String clueClassfication;

        private String caseNumber;

        private String violationDiscipline;



        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDuty() {
            return duty;
        }

        public void setDuty(String duty) {
            this.duty = duty;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getPoliticalLook() {
            return politicalLook;
        }

        public void setPoliticalLook(String politicalLook) {
            this.politicalLook = politicalLook;
        }

        public String getIssues() {
            return issues;
        }

        public void setIssues(String issues) {
            this.issues = issues;
        }

        public Date getProcessingTime() {
            return processingTime;
        }

        public void setProcessingTime(Date processingTime) {
            this.processingTime = processingTime;
        }

        public String getProcessingMethod() {
            return processingMethod;
        }

        public void setProcessingMethod(String processingMethod) {
            this.processingMethod = processingMethod;
        }

        public Date getCompletionTime() {
            return completionTime;
        }

        public void setCompletionTime(Date completionTime) {
            this.completionTime = completionTime;
        }

        public String getUndertaker() {
            return undertaker;
        }

        public void setUndertaker(String undertaker) {
            this.undertaker = undertaker;
        }

        public String getDisposalResult() {
            return disposalResult;
        }

        public void setDisposalResult(String disposalResult) {
            this.disposalResult = disposalResult;
        }

        public String getClueClassfication() {
            return clueClassfication;
        }

        public void setClueClassfication(String clueClassfication) {
            this.clueClassfication = clueClassfication;
        }

        public String getCaseNumber() {
            return caseNumber;
        }

        public void setCaseNumber(String caseNumber) {
            this.caseNumber = caseNumber;
        }

        public String getViolationDiscipline() {
            return violationDiscipline;
        }

        public void setViolationDiscipline(String violationDiscipline) {
            this.violationDiscipline = violationDiscipline;
        }



    public Condition(String name, String duty, String rank, String politicalLook, String issues, String processingMethod, String undertaker, String disposalResult, String clueClassfication, String caseNumber, String violationDiscipline) {
        this.id = id;
        this.name = name;
        this.duty = duty;
        this.rank = rank;
        this.politicalLook = politicalLook;
        this.issues = issues;
        this.processingTime = processingTime;
        this.processingMethod = processingMethod;
        this.completionTime = completionTime;
        this.undertaker = undertaker;
        this.disposalResult = disposalResult;
        this.clueClassfication = clueClassfication;
        this.caseNumber = caseNumber;
        this.violationDiscipline = violationDiscipline;

    }

    public Condition(String name, String duty, String rank, String politicalLook, String issues, Date processingTime, String processingMethod, Date completionTime, String undertaker, String disposalResult, String clueClassfication, String caseNumber, String violationDiscipline) {
        this.name = name;
        this.duty = duty;
        this.rank = rank;
        this.politicalLook = politicalLook;
        this.issues = issues;
        this.processingTime = processingTime;
        this.processingMethod = processingMethod;
        this.completionTime = completionTime;
        this.undertaker = undertaker;
        this.disposalResult = disposalResult;
        this.clueClassfication = clueClassfication;
        this.caseNumber = caseNumber;
        this.violationDiscipline = violationDiscipline;

    }

}

