package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.vo.ClientVo;
import com.vo.ContractVo;
import com.vo.StaffVo;

public interface ContractMapper {
	
	//添加合同
	@Insert("INSERT INTO CONTRACT(CON_TIME,CON_MONEY,CON_PHOTOGRAPH,CON_CID,CON_SID,CON_CONSTATE) VALUES(#{CONTime,jdbcType=DATE},#{CONMoney,jdbcType=BIGINT},"
			+ "#{CONPhotograph,jdbcType=VARCHAR},#{CONCid,jdbcType=BIGINT},#{CONSid,jdbcType=BIGINT},#{CONConstate,jdbcType=VARCHAR})")
	public int addcontract(ContractVo con);
	

	
	//查询合同
	@Select("SELECT CON_ID,CON_TIME,CON_MONEY,CON_PHOTOGRAPH,CON_CID,CON_SID,CON_CONSTATE FROM CONTRACT WHERE CON_SID=#{SId,jdbcType=BIGINT}")
	@Results(id="contractMap",value= {
			@Result(column = "CON_ID", property = "CONId", javaType = Integer.class, id = true),
			@Result(column = "CON_TIME", property = "CONTime", javaType = String.class),
			@Result(column = "CON_MONEY", property = "CONMoney", javaType = Float.class),
			@Result(column = "CON_PHOTOGRAPH", property = "CONPhotograph", javaType = String.class),
			@Result(column = "CON_CID", property = "CONCid", javaType = Integer.class),
			@Result(column = "CON_CID", property = "clientVo", javaType = ClientVo.class,
			one = @One(select ="com.mapper.ClientMapper.Listselectclient",
					fetchType = FetchType.EAGER)),
			@Result(column = "CON_SID", property = "CONSid", javaType = Integer.class),
			@Result(column = "CON_SID", property = "staffVo", javaType = StaffVo.class,
			one = @One(select ="com.mapper.StaffMapper.ListStaffSelect",
					fetchType = FetchType.EAGER)),
			@Result(column = "CON_CONSTATE", property = "CONConstate", javaType = String.class)
	})
	public List<ContractVo> StaffIdSelectContract(StaffVo staff);
	
	//查询所有合同
	@Select("SELECT CON_ID,CON_TIME,CON_MONEY,CON_PHOTOGRAPH,CON_CID,CON_SID,CON_CONSTATE FROM CONTRACT ")
	@ResultMap("contractMap")
	public List<ContractVo> ListStaffIdSelectContract();
	
	
	//根据客户名字查询
	@Select("SELECT CON_ID,CON_TIME,CON_MONEY,CON_PHOTOGRAPH,CON_CID,CON_SID,CON_CONSTATE FROM CONTRACT WHERE CON_CID=#{cid,jdbcType=BIGINT}")
	@ResultMap("contractMap")
	public List<ContractVo> ClientNameSelectContractVo(int cid);
		
		
	//根据员工名字查询
	@Select("SELECT CON_ID,CON_TIME,CON_MONEY,CON_PHOTOGRAPH,CON_CID,CON_SID,CON_CONSTATE FROM CONTRACT WHERE CON_SID=#{sid,jdbcType=BIGINT}")
	@ResultMap("contractMap")
	public List<ContractVo> StaffNameSelectContractVo(int SId);
	
	
	
	
	
	
	
}
