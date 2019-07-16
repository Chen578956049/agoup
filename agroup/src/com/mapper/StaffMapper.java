package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.vo.ClientVo;
import com.vo.StaffVo;

public interface StaffMapper {
	
	//ͨ��id����Ա��
	@Select("SELECT S_ID,S_NAME,S_PID,S_AID,S_LID,S_USENAME,S_PASSWORD FROM STAFF WHERE S_ID=#{SId,jdbcType=BIGINT}")
	@Results(id = "staffMap", value = { 
			@Result(column = "S_ID", property = "SId", javaType = Integer.class, id = true),
			@Result(column = "S_NAME", property = "SName", javaType = String.class),
			@Result(column = "S_PID", property = "SPid", javaType = Integer.class),
			@Result(column = "S_AID", property = "SAid", javaType = Integer.class),
			@Result(column = "S_LID", property = "SLid", javaType = Integer.class),
			@Result(column = "S_USENAME", property = "SUsername", javaType = String.class),
			@Result(column = "S_PASSWORD", property = "SPassworld", javaType = String.class)})
	public StaffVo ListStaffSelect(int sid);

	// ��½����
	@Select("SELECT S_ID,S_NAME,S_PID,S_AID,S_LID,S_USENAME,S_PASSWORD FROM staff WHERE staff.s_usename=#{SUsername} and staff.s_password=#{SPassworld}")
	@ResultMap("staffMap")
	public StaffVo loginList(StaffVo st);

	// ��ӿͻ���Ϣ����
	@Insert("INSERT INTO client(c_name,c_iphone,c_qq,c_mailbox,c_site,c_state,c_aid,c_sid) VALUES(#{CName},#{IPhone},#{CQq},#{CMailbox},#{CSite},#{CState},#{CAid},#{CSid})")
	public int addcliClientVo(ClientVo cliVo);

	//ͨ��name����Ա��
	@ResultMap("staffMap")
	@Select("SELECT S_ID,S_NAME,S_PID,S_AID,S_LID,S_USENAME,S_PASSWORD FROM STAFF WHERE S_ID=#{SName,jdbcType=BIGINT}")
	public List<StaffVo> StaffNameSelect(String SName);
	
}
