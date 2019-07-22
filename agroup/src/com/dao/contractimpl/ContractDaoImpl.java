package com.dao.contractimpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mapper.ContractMapper;
import com.vo.ContractVo;
import com.vo.StaffVo;

@Repository
public class ContractDaoImpl extends SqlSessionDaoSupport implements ContractMapper{
	private final static String NAMESPACE="com.mapper.ContractMapper";
	
	private static String ChangeToNameSpace(String method) {
	
		return NAMESPACE+method;
		
	}
	
	@Autowired
	public void init(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
	@Override
<<<<<<< HEAD
	public int addcontract(ContractVo con) {
		return this.getSqlSessionTemplate().insert(ChangeToNameSpace("addcontract"),con);
	}

	@Override
	public List<ContractVo> StaffIdSelectContract(StaffVo staff) {
		List<ContractVo> list=this.getSqlSessionTemplate().selectList(ChangeToNameSpace("StaffIdSelectContract"),staff);
		return list;
=======
	public void addcontract(ContractVo con) {

	}

	@Override
	public List<ContractVo> StaffIdSelectContract(StaffVo staff) {
		List<ContractVo> list=this.getSqlSessionTemplate().selectList(ChangeToNameSpace("StaffIdSelectContract"),staff);
		return list;
	}

	@Override
	public void updateClient() {
		// TODO Auto-generated method stub
		
>>>>>>> refs/remotes/origin/master
	}

	@Override
	public List<ContractVo> ListStaffIdSelectContract() {
		List<ContractVo> list=this.getSqlSessionTemplate().selectList(ChangeToNameSpace("ListStaffIdSelectContract"));
		return list;
	}
	
	@Override
	public List<ContractVo> ClientNameSelectContractVo(int cid) {
		List<ContractVo> list=this.getSqlSessionTemplate().selectList(ChangeToNameSpace("ClientNameSelectContractVo"),cid);
		return list;
	}
	
	@Override
	public List<ContractVo> StaffNameSelectContractVo(int sid) {
		List<ContractVo> list=this.getSqlSessionTemplate().selectList(ChangeToNameSpace("StaffNameSelectContractVo"),sid);
		return list;
	}
	
	

}
