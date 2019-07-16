package com.service.logservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.LogMapper;
import com.service.logservice.LogService;
import com.vo.LogVo;

@Service
public class LogServiceImpl implements LogService {
	
	@Autowired
	private LogMapper logMapper;
	
	@Override
	public List<LogVo> queryLog() {
		List<LogVo> list = logMapper.queryLog();
		return list;
	}

	@Override
	public boolean addLog(LogVo lvo) {
		boolean b = (logMapper.addLog(lvo)>0 ? true : false);
		return b;
	}

	@Override
	public List<LogVo> queryLogBySID(int sid) {
		List<LogVo> list = logMapper.queryLogBySID(sid);
		return list;
	}

}
