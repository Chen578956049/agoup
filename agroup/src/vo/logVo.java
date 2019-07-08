package vo;

import java.sql.Time;

public class logVo {

	private int LId;
	private String LScheduling;
	private Time LTime;
	private int ISid;
	public logVo() {
		
	}
	public logVo(int lId, String lScheduling, Time lTime, int iSid) {
		
		LId = lId;
		LScheduling = lScheduling;
		LTime = lTime;
		ISid = iSid;
	}
	@Override
	public String toString() {
		return "logVo [LId=" + LId + ", LScheduling=" + LScheduling + ", LTime=" + LTime + ", ISid=" + ISid
				+ ", hashCode()=" + hashCode() + "]";
	}
	public int getLId() {
		return LId;
	}
	public void setLId(int lId) {
		LId = lId;
	}
	public String getLScheduling() {
		return LScheduling;
	}
	public void setLScheduling(String lScheduling) {
		LScheduling = lScheduling;
	}
	public Time getLTime() {
		return LTime;
	}
	public void setLTime(Time lTime) {
		LTime = lTime;
	}
	public int getISid() {
		return ISid;
	}
	public void setISid(int iSid) {
		ISid = iSid;
	}
}
