package com.vo;

public class AreaVo {

	private int AId;
	private String AArea;
	
	public int getAId() {
		return AId;
	}
	public void setAId(int aId) {
		AId = aId;
	}
	public String getAArea() {
		return AArea;
	}
	public void setAArea(String aArea) {
		AArea = aArea;
	}
	@Override
	public String toString() {
		return "areaVo [AId=" + AId + ", AArea=" + AArea + ", hashCode()=" + hashCode() + "]";
	}
	public AreaVo(int aId, String aArea) {
		
		AId = aId;
		AArea = aArea;
	}
	public AreaVo() {
	
	}
	
}
