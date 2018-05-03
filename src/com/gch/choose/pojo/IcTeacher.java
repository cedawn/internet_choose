package com.gch.choose.pojo;

import java.util.Date;

public class IcTeacher {
    private Long tea_id;

    private String tea_name;

    private String tea_sex;

    private String tea_number;

    public void setTea_number(String tea_number) {
		this.tea_number = tea_number;
	}

	private String tea_password;

    private String tea_email;

    private String tea_mobile;

    private String tea_zipcode;

    private String tea_address;

    private Date tea_createtime;

	public Long getTea_id() {
		return tea_id;
	}

	public void setTea_id(Long tea_id) {
		this.tea_id = tea_id;
	}

	public String getTea_name() {
		return tea_name;
	}

	public void setTea_name(String tea_name) {
		this.tea_name = tea_name;
	}

	public String getTea_sex() {
		return tea_sex;
	}

	public void setTea_sex(String tea_sex) {
		this.tea_sex = tea_sex;
	}

	

	public String getTea_number() {
		return tea_number;
	}

	

	public String getTea_password() {
		return tea_password;
	}

	public void setTea_password(String tea_password) {
		this.tea_password = tea_password;
	}

	public String getTea_email() {
		return tea_email;
	}

	public void setTea_email(String tea_email) {
		this.tea_email = tea_email;
	}

	public String getTea_mobile() {
		return tea_mobile;
	}

	public void setTea_mobile(String tea_mobile) {
		this.tea_mobile = tea_mobile;
	}

	public String getTea_zipcode() {
		return tea_zipcode;
	}

	public void setTea_zipcode(String tea_zipcode) {
		this.tea_zipcode = tea_zipcode;
	}

	public String getTea_address() {
		return tea_address;
	}

	public void setTea_address(String tea_address) {
		this.tea_address = tea_address;
	}

	public Date getTea_createtime() {
		return tea_createtime;
	}

	public void setTea_createtime(Date tea_createtime) {
		this.tea_createtime = tea_createtime;
	}

}