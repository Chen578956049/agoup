package com.vo;

public class PositionVo {

	private int PManager;
	private String PClerk;
	private int PId;
	public int getPManager() {
		return PManager;
	}
	public void setPManager(int pManager) {
		PManager = pManager;
	}
	public String getPClerk() {
		return PClerk;
	}
	public void setPClerk(String pClerk) {
		PClerk = pClerk;
	}
	public int getPId() {
		return PId;
	}
	public void setPId(int pId) {
		PId = pId;
	}
	public PositionVo(int pManager, String pClerk, int pId) {
		
		PManager = pManager;
		PClerk = pClerk;
		PId = pId;
	}
	@Override
	public String toString() {
		return "positionVo [PManager=" + PManager + ", PClerk=" + PClerk + ", PId=" + PId + ", hashCode()=" + hashCode()
				+ "]";
	}
	public PositionVo() {
		
	}
	
}
