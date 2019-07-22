package com.service.clientservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ClientMapper;
import com.service.clientservice.ClientService;
import com.vo.ClientVo;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientMapper clientMapper;

	@Override
	public ClientVo Listselectclient(int cid) {
		return clientMapper.Listselectclient(cid);
	}

	@Override
	public List<ClientVo> ClientNameSelect(String CName) {
		return clientMapper.ClientNameSelect(CName);
	}

	@Override
	public void StateClientUpdate(int CId, String CState) {
		clientMapper.StateClientUpdate(CId,CState);
		
	}
	
	


}
