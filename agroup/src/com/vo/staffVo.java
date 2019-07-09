package com.vo;

public class staffVo {

	private int SId;
	private String SName;
	private int SPId;
	private int SAid;
	private int SLid;
	public int getSId() {
		return SId;
	}
	public void setSId(int sId) {
		SId = sId;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public int getSPId() {
		return SPId;
	}
	public void setSPId(int sPId) {
		SPId = sPId;
	}
	public int getSAid() {
		return SAid;
	}
	public void setSAid(int sAid) {
		SAid = sAid;
	}
	public int getSLid() {
		return SLid;
	}
	@Override
	public String toString() {
		return "staffVo [SId=" + SId + ", SName=" + SName + ", SPId=" + SPId + ", SAid=" + SAid + ", SLid=" + SLid
				+ ", hashCode()=" + hashCode() + "]";
	}
	public staffVo() {
	
	}
	public staffVo(int sId, String sName, int sPId, int sAid, int sLid) {
	
		SId = sId;
		SName = sName;
		SPId = sPId;
		SAid = sAid;
		SLid = sLid;
	}
	public void setSLid(int sLid) {
		SLid = sLid;
	}
}
