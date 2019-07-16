package com.service.contractservice;

import java.util.List;

import com.vo.ContractVo;
import com.vo.StaffVo;

public interface ContractService {
	public void addcontract(ContractVo con);
	
	public List<ContractVo> StaffIdSelectContract(StaffVo staff);
	
	public List<ContractVo> ListStaffIdSelectContract();
	
	public List<ContractVo> ClientNameSelectContractVot(int cid);
	
	public List<ContractVo> StaffNameSelectContractVo(int sid);

}
