package com.vo;

import java.util.List;

public class ContractVo {

	private Integer CONId;
	private String CONTime;
	private Float CONMoney;
	private String CONPhotograph;
	private Integer CONCid;
	private Integer CONSid;
	private String CONConstate;
	
	private ClientVo clientVo;
	
	private StaffVo staffVo;
	

	public ClientVo getClientVo() {
		return clientVo;
	}
	public void setClientVo(ClientVo clientVo) {
		this.clientVo = clientVo;
	}
	
	
	public StaffVo getStaffVo() {
		return staffVo;
	}
	public void setStaffVo(StaffVo staffVo) {
		this.staffVo = staffVo;
	}
	public Integer getCONId() {
		return CONId;
	}
	public void setCONId(Integer cONId) {
		CONId = cONId;
	}
	public String getCONTime() {
		return CONTime;
	}
	public void setCONTime(String cONTime) {
		CONTime = cONTime;
	}
	public Float getCONMoney() {
		return CONMoney;
	}
	public void setCONMoney(Float cONMoney) {
		CONMoney = cONMoney;
	}
	public String getCONPhotograph() {
		return CONPhotograph;
	}
	public void setCONPhotograph(String cONPhotograph) {
		CONPhotograph = cONPhotograph;
	}
	public Integer getCONCid() {
		return CONCid;
	}
	public void setCONCid(Integer cONCid) {
		CONCid = cONCid;
	}
	public Integer getCONSid() {
		return CONSid;
	}
	public void setCONSid(Integer cONSid) {
		CONSid = cONSid;
	}
	public String getCONConstate() {
		return CONConstate;
	}
	public void setCONConstate(String cONConstate) {
		CONConstate = cONConstate;
	}
	public ContractVo() {
		
	}
	public ContractVo(Integer cONId, String cONTime, Float cONMoney, String cONPhotograph, Integer cONCid,
			Integer cONSid, String cONConstate, ClientVo clientVo, StaffVo staffVo) {
		super();
		CONId = cONId;
		CONTime = cONTime;
		CONMoney = cONMoney;
		CONPhotograph = cONPhotograph;
		CONCid = cONCid;
		CONSid = cONSid;
		CONConstate = cONConstate;
		this.clientVo = clientVo;
		this.staffVo = staffVo;
	}
	
	
	
	
}
