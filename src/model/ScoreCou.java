package model;

import java.util.Date;

public class ScoreCou {
	
	private String courseName;
	private int courseCredit;  //ѧ��
	private int courseHours;  //ѧʱ
	private String courseTeacher;
	private String major;
	private Date courseDate;
	private String scoreGrade;
	private Integer scoreId;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}
	public int getCourseHours() {
		return courseHours;
	}
	public void setCourseHours(int courseHours) {
		this.courseHours = courseHours;
	}
	public String getCourseTeacher() {
		return courseTeacher;
	}
	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Date getCourseDate() {
		return courseDate;
	}
	public void setCourseDate(Date courseDate) {
		this.courseDate = courseDate;
	}
	public String getScoreGrade() {
		return scoreGrade;
	}
	public void setScoreGrade(String scoreGrade) {
		this.scoreGrade = scoreGrade;
	}
	public ScoreCou() {
		super();
		
	}

	public Integer getScoreId() {
		return scoreId;
	}

	public void setScoreId(Integer scoreId) {
		this.scoreId = scoreId;
	}

	public ScoreCou(String courseName, int courseCredit, int courseHours,
					String courseTeacher, String major, Date courseDate,
					String scoreGrade) {
		super();
		this.courseName = courseName;
		this.courseCredit = courseCredit;
		this.courseHours = courseHours;
		this.courseTeacher = courseTeacher;
		this.major = major;
		this.courseDate = courseDate;
		this.scoreGrade = scoreGrade;
	}

	public ScoreCou(String courseName, int courseCredit, int courseHours, String courseTeacher, String major, Date courseDate, String scoreGrade, Integer scoreId) {
		this.courseName = courseName;
		this.courseCredit = courseCredit;
		this.courseHours = courseHours;
		this.courseTeacher = courseTeacher;
		this.major = major;
		this.courseDate = courseDate;
		this.scoreGrade = scoreGrade;
		this.scoreId = scoreId;
	}
}
