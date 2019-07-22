package com.service.logservice;

import java.util.List;

<<<<<<< HEAD
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vo.LogVo;

@Transactional(value="transactionManager",isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED,noRollbackFor=NullPointerException.class)
=======
import com.vo.LogVo;

>>>>>>> refs/remotes/origin/master
public interface LogService {
	
	public List<LogVo> queryLog();
	
	public boolean addLog(LogVo lvo);
	
	public List<LogVo> queryLogBySID(int sid) ;
}
