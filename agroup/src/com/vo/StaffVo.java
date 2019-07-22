package com.vo;

import java.util.List;

public class StaffVo {

	private int SId;
	private String SName;
	private int SPid;
	private int SAid;
	private String SUsername;
	private String SPassworld;
	private int SLid;
	
	private List<ContractVo> contracts;
	
	
	public List<ContractVo> getContracts() {
		return contracts;
	}
	public void setContracts(List<ContractVo> contracts) {
		this.contracts = contracts;
	}
	public String getSUsername() {
		return SUsername;
	}
	public void setSUsername(String sUsername) {
		SUsername = sUsername;
	}
	public String getSPassworld() {
		return SPassworld;
	}
	public void setSPassworld(String sPassworld) {
		SPassworld = sPassworld;
	}
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
	public int getSPid() {
		return SPid;
	}
	public void setSPid(int sPid) {
		SPid = sPid;
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
	public void setSLid(int sLid) {
		SLid = sLid;
	}
	
	
	public StaffVo(int sId, String sName, int sPid, int sAid, String sUsername, String sPassworld, int sLid) {
		SId = sId;
		SName = sName;
		SPid = sPid;
		SAid = sAid;
		SUsername = sUsername;
		SPassworld = sPassworld;
		SLid = sLid;
	}
	public StaffVo() {
	}

}
