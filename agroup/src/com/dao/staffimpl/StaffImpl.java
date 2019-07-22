package com.dao.staffimpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mapper.StaffMapper;
import com.vo.ClientVo;
import com.vo.StaffVo;

@Repository
public class StaffImpl extends SqlSessionDaoSupport implements StaffMapper{

	private final static String NAMESPACE="com.mapper.loginmapper.";
	private static String ChangeToNameSpace(String method) {
		
		return NAMESPACE+method;
		
	}
	
	
	
	@Autowired
	public void init (SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
	@Override
	public StaffVo loginList(StaffVo st) {
		StaffVo sto = (StaffVo) this.getSqlSessionTemplate().selectList(ChangeToNameSpace("loginList"), st);
		return sto;
	}


	@Override
	public int addcliClientVo(ClientVo cliVo) {
		int cli = this.getSqlSessionTemplate().insert(ChangeToNameSpace("addcliClientVo"), cliVo);
		return cli;
	}



	@Override
	public StaffVo ListStaffSelect(int sid) {
		StaffVo staffVo=this.getSqlSessionTemplate().selectOne(ChangeToNameSpace("ListStaffSelect"),sid);
		return staffVo;
	}



	@Override
	public List<StaffVo> StaffNameSelect(String SName) {
		List<StaffVo> list=this.getSqlSessionTemplate().selectList(ChangeToNameSpace("StaffNameSelect"),SName);
		return list;
	}
	
	

}
