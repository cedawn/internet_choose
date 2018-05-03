package com.gch.choose.pojo;

import java.util.List;

public class IcStudentCourse extends IcStudentCourseKey {
    private Integer iscScore;
    private String stu_name;
    private String stu_number;
    private IcStudentCourse icStudentCourse;
    public IcStudentCourse getIcStudentCourse() {
		return icStudentCourse;
	}

	public void setIcStudentCourse(IcStudentCourse icStudentCourse) {
		this.icStudentCourse = icStudentCourse;
	}

	public String getStu_number() {
		return stu_number;
	}

	public void setStu_number(String stu_number) {
		this.stu_number = stu_number;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	private List<IcStudent> student;
   private IcCourse courses;
    private List<IcCourse> course;
    private IcStudent students;

    

	public List<IcCourse> getCourse() {
		return course;
	}

	public void setCourse(List<IcCourse> course) {
		this.course = course;
	}

	public IcStudent getStudents() {
		return students;
	}

	public void setStudents(IcStudent students) {
		this.students = students;
	}

	public IcCourse getCourses() {
	return courses;
}

public void setCourses(IcCourse courses) {
	this.courses = courses;
}

	public List<IcStudent> getStudent() {
		return student;
	}

	public void setStudent(List<IcStudent> student) {
		this.student = student;
	}

	

	public Integer getIscScore() {
        return iscScore;
    }

    public void setIscScore(Integer iscScore) {
        this.iscScore = iscScore;
    }
}