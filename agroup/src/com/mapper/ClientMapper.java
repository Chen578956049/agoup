package com.mapper;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.vo.ClientVo;

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
	public ClientVo Listselectclient(int cid);
	
	
	//根据名字查找客户
	@Select("SELECT C_ID,C_NAME,C_IPHONE,C_QQ,C_MAILBOX,C_SITE,C_STATE,C_AID,C_SID FROM CLIENT WHERE C_NAME LIKE CONCAT('%',#{CName},'%')")
	@Results(id="nameclientMap",value= {
			@Result(column = "C_ID", property = "CId", javaType = Integer.class, id = true),
			@Result(column = "C_NAME", property = "CName", javaType = String.class),
			@Result(column = "C_IPHONE", property = "IPhone", javaType = String.class),
			@Result(column = "C_QQ", property = "CQq", javaType = String.class),
			@Result(column = "C_MAILBOX", property = "CMailbox", javaType = String.class),
			@Result(column = "C_SITE", property = "CSite", javaType = String.class),
			@Result(column = "C_STATE", property = "CState", javaType = String.class),
			@Result(column = "C_AID", property = "CAid", javaType = Integer.class),
			@Result(column = "C_SID", property = "CSid", javaType = Integer.class),
			@Result(column = "C_ID", property = "contracts", javaType=ArrayList.class,
			many= @Many(select ="com.mapper.ContractMapper.StaffNameSelectContractVo"))
	})
	public List<ClientVo> ClientNameSelect(String CName);
	
	//根据id修改客户状态
	@Update("UPDATE CLIENT SET C_STATE=#{CState,jdbcType=VARCHAR} WHERE C_ID=#{CId,jdbcType=BIGINT}")
	@ResultMap("ListclientMap")
	public void StateClientUpdate(@Param("CId") int CId,@Param("CState") String CState);
=======
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
>>>>>>> refs/remotes/origin/master
	
}
