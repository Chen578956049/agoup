package com.service.clientservice;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vo.ClientVo;

@Transactional(value="transactionManager",isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED,noRollbackFor=NullPointerException.class)
public interface ClientService {
	
	public ClientVo Listselectclient(int cid);
	
	public List<ClientVo> ClientNameSelect(String CName);
	
	public void StateClientUpdate(int CId, String CState);

}
