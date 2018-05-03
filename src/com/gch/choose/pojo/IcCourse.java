package com.gch.choose.pojo;

public class IcCourse {
    private Long courseId;

    private String courseName;

    private Long courseTeaId;

    private Integer courseClassroom;

    private Integer courseCredit;

    private String courseDate;

    private String courseTime;

    private String courseState;
    private IcTeacher icteacher;
   

	public IcTeacher getIcteacher() {
		return icteacher;
	}

	public void setIcteacher(IcTeacher icteacher) {
		this.icteacher = icteacher;
	}

	public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Long getCourseTeaId() {
        return courseTeaId;
    }

    public void setCourseTeaId(Long courseTeaId) {
        this.courseTeaId = courseTeaId;
    }

    public Integer getCourseClassroom() {
        return courseClassroom;
    }

    public void setCourseClassroom(Integer courseClassroom) {
        this.courseClassroom = courseClassroom;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate == null ? null : courseDate.trim();
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime == null ? null : courseTime.trim();
    }

    public String getCourseState() {
        return courseState;
    }

    public void setCourseState(String courseState) {
        this.courseState = courseState == null ? null : courseState.trim();
    }
}