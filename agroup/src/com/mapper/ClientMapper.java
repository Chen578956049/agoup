package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.vo.ClientVo;
import com.vo.StaffVo;

public interface ClientMapper {
	
	@Select("SELECT C_ID,C_NAME,C_IPHONE,C_QQ,C_MAILBOX,C_SITE,C_STATE,C_AID,C_SID FROM CLIENT WHERE C_ID=#{CId,jdbcType=BIGINT}")
	@Results(id="ListclientMap",value= {
			@Result(column = "C_ID", property = "CId", javaType = Integer.class, id = true),
			@Result(column = "C_NAME", property = "CName", javaType = String.class),
			@Result(column = "C_IPHONE", property = "IPhone", javaType = String.class),
			@Result(column = "C_QQ", property = "CQq", javaType = String.class),
			@Result(column = "C_MAILBOX", property = "CMailbox", javaType = String.class),
			@Result(column = "C_SITE", property = "CSite", javaType = String.class),
			@Result(column = "C_STATE", property = "CState", javaType = String.class),
			@Result(column = "C_AID", property = "CAid", javaType = Integer.class),
			@Result(column = "C_SID", property = "CSid", javaType = Integer.class)
	})
	public List<ClientVo> Listselectclient(int cid);
	
}
