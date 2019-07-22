package com.dao.clientimpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mapper.ClientMapper;
import com.vo.ClientVo;

@Repository
public class ClientDaoImpl extends SqlSessionDaoSupport implements ClientMapper{
		private final static String NAMESPACE="com.mapper.ContractMapper";
		
		private static String ChangeToNameSpace(String method) {
		
			return NAMESPACE+method;
		}
		
	@Autowired
	public void init(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public ClientVo Listselectclient(int cid) {
		ClientVo client=this.getSqlSessionTemplate().selectOne(ChangeToNameSpace("Listselectclient"),cid);
		return client;
	}

	@Override
	public List<ClientVo> ClientNameSelect(String CName) {
		List<ClientVo> list=this.getSqlSessionTemplate().selectList(ChangeToNameSpace("ClientNameSelect"),CName);
		return list;
	}
	
	//修改客户状态
	@Override
	public void StateClientUpdate(int CId, String CState) {
		
	}

}
