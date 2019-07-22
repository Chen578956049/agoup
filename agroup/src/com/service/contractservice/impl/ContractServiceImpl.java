package com.service.contractservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.ContractMapper;
import com.service.contractservice.ContractService;
import com.vo.ContractVo;
import com.vo.StaffVo;


@Service
public class ContractServiceImpl implements ContractService{
	
	@Autowired
	private ContractMapper contractMapper;
	
	@Override
	public int addcontract(ContractVo con) {
		
		return contractMapper.addcontract(con);
		}

	
	@Override
	public List<ContractVo> StaffIdSelectContract(StaffVo staff) {
		return contractMapper.StaffIdSelectContract(staff);
	}


	@Override
	public List<ContractVo> ListStaffIdSelectContract() {
		return contractMapper.ListStaffIdSelectContract();
	}


	@Override
	public List<ContractVo> ClientNameSelectContractVot(int cid) {
		return contractMapper.ClientNameSelectContractVo(cid);
	}


	@Override
	public List<ContractVo> StaffNameSelectContractVo(int sid) {
		return contractMapper.StaffNameSelectContractVo(sid);
	}



}
