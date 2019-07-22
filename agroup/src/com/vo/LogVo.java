package com.vo;

import java.io.Serializable;

public class LogVo implements Serializable{

	private static final long serialVersionUID = 1L;
	private int lId;
	private String lScheduling;
	private String lNtime;
	private String lTime;
	private int lSid;
	private int lCid;
	private ClientVo cvo;
	private StaffVo svo;
	public LogVo() {
		
	}
	public LogVo(int lId, String lScheduling, String lNtime, String lTime, int lSid, int lCid, ClientVo cvo,
			StaffVo svo) {
		this.lId = lId;
		this.lScheduling = lScheduling;
		this.lNtime = lNtime;
		this.lTime = lTime;
		this.lSid = lSid;
		this.lCid = lCid;
		this.cvo = cvo;
		this.svo = svo;
	}

	public ClientVo getCvo() {
		return cvo;
	}

	public void setCvo(ClientVo cvo) {
		this.cvo = cvo;
	}

	public StaffVo getSvo() {
		return svo;
	}

	public void setSvo(StaffVo svo) {
		this.svo = svo;
	}

	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlScheduling() {
		return lScheduling;
	}
	public void setlScheduling(String lScheduling) {
		this.lScheduling = lScheduling;
	}
	public String getlNtime() {
		return lNtime;
	}
	public void setlNtime(String lNtime) {
		this.lNtime = lNtime;
	}
	public String getlTime() {
		return lTime;
	}
	public void setlTime(String lTime) {
		this.lTime = lTime;
	}
	public int getlSid() {
		return lSid;
	}
	public void setlSid(int lSid) {
		this.lSid = lSid;
	}
	public int getlCid() {
		return lCid;
	}
	public void setlCid(int lCid) {
		this.lCid = lCid;
	}
	@Override
	public String toString() {
		return "logVo [lId=" + lId + ", lScheduling=" + lScheduling + ", lNtime=" + lNtime + ", lTime=" + lTime
				+ ", lSid=" + lSid + ", lCid=" + lCid + ", cvo=" + cvo + ", svo=" + svo + "]";
	}
}
