package com.gch.choose.pojo;

import java.util.Date;
import java.util.List;

public class IcStudent {
    private Long stu_id;

    private String stu_name;

    private String stu_sex;

    private String stu_number;

    private String stu_sorting;

    private String stu_professional;

    private Long stu_course_id;

    private String stu_password;

    private String stu_email;

    private String stu_mobile;

    private String stu_zipcode;

    private String stu_address;

    private Date stu_createtime;
    private IcCourse courses;
	private IcStudentCourse icStudentCourse;
	private IcStudent student;

	public IcStudent getStudent() {
		return student;
	}

	public void setStudent(IcStudent student) {
		this.student = student;
	}

	public IcStudentCourse getIcStudentCourse() {
		return icStudentCourse;
	}

	public void setIcStudentCourse(IcStudentCourse icStudentCourse) {
		this.icStudentCourse = icStudentCourse;
	}

	public IcCourse getCourses() {
		return courses;
	}

	public void setCourses(IcCourse courses) {
		this.courses = courses;
	}

	public Long getStu_id() {
		return stu_id;
	}

	public void setStu_id(Long stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getStu_sex() {
		return stu_sex;
	}

	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}



	public String getStu_sorting() {
		return stu_sorting;
	}

	public void setStu_sorting(String stu_sorting) {
		this.stu_sorting = stu_sorting;
	}

	public String getStu_professional() {
		return stu_professional;
	}

	public void setStu_professional(String stu_professional) {
		this.stu_professional = stu_professional;
	}

	public Long getStu_course_id() {
		return stu_course_id;
	}

	public void setStu_course_id(Long setStu_course_id) {
		this.stu_course_id = stu_course_id;
	}

	

	public String getStu_number() {
		return stu_number;
	}

	public void setStu_number(String stu_number) {
		this.stu_number = stu_number;
	}

	public String getStu_password() {
		return stu_password;
	}

	public void setStu_password(String stu_password) {
		this.stu_password = stu_password;
	}

	public String getStu_email() {
		return stu_email;
	}

	public void setStu_email(String stu_email) {
		this.stu_email = stu_email;
	}

	public String getStu_mobile() {
		return stu_mobile;
	}

	public void setStu_mobile(String stu_mobile) {
		this.stu_mobile = stu_mobile;
	}

	public String getStu_zipcode() {
		return stu_zipcode;
	}

	public void setStu_zipcode(String stu_zipcode) {
		this.stu_zipcode = stu_zipcode;
	}

	public String getStu_address() {
		return stu_address;
	}

	public void setStu_address(String stu_address) {
		this.stu_address = stu_address;
	}

	public Date getStu_createtime() {
		return stu_createtime;
	}

	public void setStu_createtime(Date stu_createtime) {
		this.stu_createtime = stu_createtime;
	}
	}

    