package vo;

public class clientVo {

	private int CId;
	private String CName;
	private String IPhone;
	private String CQq;
	private String CMailbox;
	private String CSite;
	private String CState;
	private int CAid;
	private int CSid;
	public clientVo(int cId, String cName, String iPhone, String cQq, String cMailbox, String cSite, String cState,
			int cAid, int cSid) {
	
		CId = cId;
		CName = cName;
		IPhone = iPhone;
		CQq = cQq;
		CMailbox = cMailbox;
		CSite = cSite;
		CState = cState;
		CAid = cAid;
		CSid = cSid;
	}
	@Override
	public String toString() {
		return "clientVo [CId=" + CId + ", CName=" + CName + ", IPhone=" + IPhone + ", CQq=" + CQq + ", CMailbox="
				+ CMailbox + ", CSite=" + CSite + ", CState=" + CState + ", CAid=" + CAid + ", CSid=" + CSid
				+ ", hashCode()=" + hashCode() + "]";
	}
	public clientVo() {
	
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
