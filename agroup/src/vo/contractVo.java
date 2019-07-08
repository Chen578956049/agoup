package vo;

import java.sql.Time;

public class contractVo {

	private int CONId;
	private Time CONTime;
	private float CONMoney;
	private String CONPhotograph;
	private int CONCid;
	private int CONSid;
	public contractVo() {
	
	}
	public contractVo(int cONId, Time cONTime, float cONMoney, String cONPhotograph, int cONCid, int cONSid) {
		
		CONId = cONId;
		CONTime = cONTime;
		CONMoney = cONMoney;
		CONPhotograph = cONPhotograph;
		CONCid = cONCid;
		CONSid = cONSid;
	}
	public int getCONId() {
		return CONId;
	}
	public void setCONId(int cONId) {
		CONId = cONId;
	}
	public Time getCONTime() {
		return CONTime;
	}
	public void setCONTime(Time cONTime) {
		CONTime = cONTime;
	}
	public float getCONMoney() {
		return CONMoney;
	}
	public void setCONMoney(float cONMoney) {
		CONMoney = cONMoney;
	}
	public String getCONPhotograph() {
		return CONPhotograph;
	}
	public void setCONPhotograph(String cONPhotograph) {
		CONPhotograph = cONPhotograph;
	}
	public int getCONCid() {
		return CONCid;
	}
	public void setCONCid(int cONCid) {
		CONCid = cONCid;
	}
	public int getCONSid() {
		return CONSid;
	}
	public void setCONSid(int cONSid) {
		CONSid = cONSid;
	}
	@Override
	public String toString() {
		return "contractVo [CONId=" + CONId + ", CONTime=" + CONTime + ", CONMoney=" + CONMoney + ", CONPhotograph="
				+ CONPhotograph + ", CONCid=" + CONCid + ", CONSid=" + CONSid + ", hashCode()=" + hashCode() + "]";
	}
}
