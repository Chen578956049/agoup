package com.service.logservice;

import java.util.List;

import com.vo.LogVo;

public interface LogService {
	
	public List<LogVo> queryLog();
	
	public boolean addLog(LogVo lvo);
	
	public List<LogVo> queryLogBySID(int sid) ;
}
