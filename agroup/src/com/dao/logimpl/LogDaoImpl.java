package com.dao.logimpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mapper.LogMapper;
import com.vo.LogVo;

@Repository
public class LogDaoImpl extends SqlSessionDaoSupport implements LogMapper {

	private final static String NAMESPACE = "com.mapper.LogMapper.";
	
	//命名空间拼接
	private static String ChangeToNameSpace(String method) {
		return NAMESPACE + method;

	}
	
	@Autowired
	public void init(SqlSessionTemplate sqlSessionTemplate){
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public int addLog(LogVo lvo) {
		int i = this.getSqlSessionTemplate().insert("addLog", lvo);
		return i ;
	}

	@Override
	public List<LogVo> queryLog() {
		List<LogVo> list = this.getSqlSessionTemplate().selectList(ChangeToNameSpace("queryLog"));
		return list;
	}

	@Override
	public List<LogVo> queryLogBySID(int sid) {
		List<LogVo> list = this.getSqlSessionTemplate().selectList(ChangeToNameSpace("queryLogBySID"));
		return list;
	}
}
