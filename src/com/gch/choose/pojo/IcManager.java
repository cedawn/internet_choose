package com.gch.choose.pojo;

import java.util.Date;

public class IcManager {
    private Long manId;

    private String manUsername;

    private String manTurename;

    private String manPassword;

    private Date manCreatetime;

    public Long getManId() {
        return manId;
    }

    public void setManId(Long manId) {
        this.manId = manId;
    }

    public String getManUsername() {
        return manUsername;
    }

    public void setManUsername(String manUsername) {
        this.manUsername = manUsername == null ? null : manUsername.trim();
    }

    public String getManTurename() {
        return manTurename;
    }

    public void setManTurename(String manTurename) {
        this.manTurename = manTurename == null ? null : manTurename.trim();
    }

    

    public String getManPassword() {
		return manPassword;
	}

	public void setManPassword(String manPassword) {
		this.manPassword = manPassword;
	}

	public Date getManCreatetime() {
        return manCreatetime;
    }

    public void setManCreatetime(Date manCreatetime) {
        this.manCreatetime = manCreatetime;
    }
}