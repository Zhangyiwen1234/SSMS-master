package model;

import java.util.Date;

public class Table4 {
    private String person;

    private String position;

    private String rank;

    private String status;

    private Date violationTime;

    private String violationFacts;

    private String handingSituation;

    private String processingNumber;

    private  String duty;

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Date getViolationTime() {
        return violationTime;
    }

    public void setViolationTime(Date violationTime) {
        this.violationTime = violationTime;
    }

    public String getViolationFacts() {
        return violationFacts;
    }

    public void setViolationFacts(String violationFacts) {
        this.violationFacts = violationFacts;
    }

    public String getHandingSituation() {
        return handingSituation;
    }

    public void setHandingSituation(String handingSituation) {
        this.handingSituation = handingSituation;
    }

    public String getProcessingNumber() {
        return processingNumber;
    }

    public void setProcessingNumber(String processingNumber) {
        this.processingNumber = processingNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Table4() {
    }

    public Table4(String person, String position, String rank, String status, Date violationTime, String violationFacts, String handingSituation, String processingNumber, String duty) {
        this.person = person;
        this.position = position;
        this.rank = rank;
        this.status = status;
        this.violationTime = violationTime;
        this.violationFacts = violationFacts;
        this.handingSituation = handingSituation;
        this.processingNumber = processingNumber;
        this.duty = duty;
    }
}
