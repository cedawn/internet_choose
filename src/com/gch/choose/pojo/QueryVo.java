package com.gch.choose.pojo;

public class QueryVo {
	private String stuName;
	private String stuNumber;
	private String teaName;
	private String teaNumber;
	private Long iscId;
	private Integer iscScore;
	private Long courseId;
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Long getIscId() {
		return iscId;
	}
	public void setIscId(Long iscId) {
		this.iscId = iscId;
	}
	public Integer getIscScore() {
		return iscScore;
	}
	public void setIscScore(Integer iscScore) {
		this.iscScore = iscScore;
	}
	private String courseName;
	private String courseTeaName;
	private String userID;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String loginType;
	private String errorMessage;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseTeaName() {
		return courseTeaName;
	}
	public void setCourseTeaName(String courseTeaName) {
		this.courseTeaName = courseTeaName;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public String getTeaNumber() {
		return teaNumber;
	}
	public void setTeaNumber(String teaNumber) {
		this.teaNumber = teaNumber;
	}
	//当前页
	private Integer page;
		//每页数
	private Integer size = 10; 
		//开始行
	private Integer startRow = 0;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
}
