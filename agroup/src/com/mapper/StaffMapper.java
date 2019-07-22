package com.mapper;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.vo.ClientVo;
import com.vo.StaffVo;

public interface StaffMapper {
	
	//ͨ根据id查询
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

	
	@Select("SELECT S_ID,S_NAME,S_PID,S_AID,S_LID,S_USENAME,S_PASSWORD FROM staff WHERE staff.s_usename=#{SUsername} and staff.s_password=#{SPassworld}")
	@ResultMap("staffMap")
	public StaffVo loginList(StaffVo st);

	// 添加员工
	@Insert("INSERT INTO client(c_name,c_iphone,c_qq,c_mailbox,c_site,c_state,c_aid,c_sid) VALUES(#{CName},#{IPhone},#{CQq},#{CMailbox},#{CSite},#{CState},#{CAid},#{CSid})")
	public int addcliClientVo(ClientVo cliVo);

	//根据名字查询
	@Select("SELECT S_ID,S_NAME,S_PID,S_AID,S_LID,S_USENAME,S_PASSWORD FROM STAFF WHERE S_NAME LIKE CONCAT('%',#{SName},'%')")
	@Results(id = "namestaffMap", value = { 
			@Result(column = "S_ID", property = "SId", javaType = Integer.class, id = true),
			@Result(column = "S_NAME", property = "SName", javaType = String.class),
			@Result(column = "S_PID", property = "SPid", javaType = Integer.class),
			@Result(column = "S_AID", property = "SAid", javaType = Integer.class),
			@Result(column = "S_LID", property = "SLid", javaType = Integer.class),
			@Result(column = "S_USENAME", property = "SUsername", javaType = String.class),
			@Result(column = "S_PASSWORD", property = "SPassworld", javaType = String.class),
			@Result(column = "S_ID", property = "contracts", javaType=ArrayList.class,
			many= @Many(select ="com.mapper.ContractMapper.StaffNameSelectContractVo"))
			})
=======
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
>>>>>>> refs/remotes/origin/master
	public List<StaffVo> StaffNameSelect(String SName);
	
}
