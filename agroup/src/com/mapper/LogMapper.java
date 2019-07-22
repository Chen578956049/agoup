package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.vo.ClientVo;
import com.vo.LogVo;
import com.vo.StaffVo;

public interface LogMapper {
	
	// 添加日志
	@Insert("INSERT LOG(l_cid,l_sid,l_time,l_ntime,l_scheduling) values(#{lCid},#{lSid},STR_TO_DATE(#{lTime},'%Y-%m-%d %T'),STR_TO_DATE(#{lNtime},'%Y-%m-%d %T'),#{lScheduling})")
	public int addLog(LogVo lvo);

	// 查询所有日志
	@Select("SELECT l_id,l_scheduling,DATE_FORMAT(l_time,'%Y-%m-%d %T') AS l_time,l_sid,DATE_FORMAT(l_ntime,'%Y-%m-%d %T') AS l_ntime,l_cid FROM log")
	@Results(id = "queryLog", value = { @Result(column = "l_id", property = "lId", javaType = int.class, id = true),
			@Result(column = "l_scheduling", property = "lScheduling", javaType = String.class),
			@Result(column = "l_time", property = "lTime", javaType = String.class),
			@Result(column = "l_ntime", property = "lNtime", javaType = String.class),
			@Result(column = "l_sid", property = "lSid", javaType = int.class),
			@Result(column = "l_cid", property = "lCid", javaType = int.class),
			@Result(column = "l_sid", property = "svo", javaType = StaffVo.class, one = @One(select = "com.mapper.StaffMapper.ListStaffSelect", fetchType = FetchType.EAGER)),
			@Result(column = "l_cid", property = "cvo", javaType = ClientVo.class, one = @One(select = "com.mapper.ClientMapper.Listselectclient", fetchType = FetchType.EAGER)) })
	public List<LogVo> queryLog();

	// 根据员工ID查询日志
	@Select("SELECT l_id,l_scheduling,DATE_FORMAT(l_time,'%Y-%m-%d %T') AS l_time,l_sid,DATE_FORMAT(l_ntime,'%Y-%m-%d %T') AS l_ntime,l_cid FROM log WHERE l_sid=#{sid}")
	@Results(id = "queryLogBySPID", value = {
			@Result(column = "l_id", property = "lId", javaType = int.class, id = true),
			@Result(column = "l_scheduling", property = "lScheduling", javaType = String.class),
			@Result(column = "l_time", property = "lTime", javaType = String.class),
			@Result(column = "l_ntime", property = "lNtime", javaType = String.class),
			@Result(column = "l_sid", property = "lSid", javaType = int.class),
			@Result(column = "l_cid", property = "lCid", javaType = int.class),
			@Result(column = "l_sid", property = "svo", javaType = StaffVo.class, one = @One(select = "com.mapper.StaffMapper.ListStaffSelect", fetchType = FetchType.EAGER)),
			@Result(column = "l_cid", property = "cvo", javaType = ClientVo.class, one = @One(select = "com.mapper.ClientMapper.Listselectclient", fetchType = FetchType.EAGER)) })
	public List<LogVo> queryLogBySID(int sid);
}
