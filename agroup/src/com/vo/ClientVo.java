package com.vo;

<<<<<<< HEAD
import java.util.List;

public class ClientVo {

	private int CId;
	private String CName;
	private String IPhone;
	private String CQq;
	private String CMailbox;
	private String CSite;
	private String CState;
	private int CAid;
	private int CSid;
	
	private List<ContractVo> contracts;
	
	
	public ClientVo(int cId, String cName, String iPhone, String cQq, String cMailbox, String cSite, String cState,
			int cAid, int cSid) {
		this.CId = cId;
		this.CName = cName;
		this.IPhone = iPhone;
		this.CQq = cQq;
		this.CMailbox = cMailbox;
		this.CSite = cSite;
		this.CState = cState;
		this.CAid = cAid;
		this.CSid = cSid;
		
	}

	public List<ContractVo> getContracts() {
		return contracts;
	}

	public void setContracts(List<ContractVo> contracts) {
		this.contracts = contracts;
	}
=======
public class ClientVo {

	private int CId;
	private String CName;
	private String IPhone;
	private String CQq;
	private String CMailbox;
	private String CSite;
	private String CState;
	private int CAid;
	private int CSid;
	
	
	public ClientVo(int cId, String cName, String iPhone, String cQq, String cMailbox, String cSite, String cState,
			int cAid, int cSid) {
		this.CId = cId;
		this.CName = cName;
		this.IPhone = iPhone;
		this.CQq = cQq;
		this.CMailbox = cMailbox;
		this.CSite = cSite;
		this.CState = cState;
		this.CAid = cAid;
		this.CSid = cSid;
		
	}

>>>>>>> refs/remotes/origin/master

	public ClientVo() {
	}


	public int getCId() {
		return CId;
	}


	public void setCId(int cId) {
		CId = cId;
	}


	public String getCName() {
		return CName;
	}


	public void setCName(String cName) {
		CName = cName;
	}


	public String getIPhone() {
		return IPhone;
	}


	public void setIPhone(String iPhone) {
		IPhone = iPhone;
	}


	public String getCQq() {
		return CQq;
	}


	public void setCQq(String cQq) {
		CQq = cQq;
	}


	public String getCMailbox() {
		return CMailbox;
	}


	public void setCMailbox(String cMailbox) {
		CMailbox = cMailbox;
	}


	public String getCSite() {
		return CSite;
	}


	public void setCSite(String cSite) {
		CSite = cSite;
	}


	public String getCState() {
		return CState;
	}


	public void setCState(String cState) {
		CState = cState;
	}


	public int getCAid() {
		return CAid;
	}


	public void setCAid(int cAid) {
		CAid = cAid;
	}


	public int getCSid() {
		return CSid;
	}


	public void setCSid(int cSid) {
		CSid = cSid;
	}
	

	}
