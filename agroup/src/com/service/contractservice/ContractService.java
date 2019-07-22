package com.service.contractservice;

import java.util.List;

<<<<<<< HEAD
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vo.ContractVo;
import com.vo.StaffVo;

@Transactional(value="transactionManager",isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED,noRollbackFor=NullPointerException.class)
public interface ContractService {
	public int addcontract(ContractVo con);
=======
import com.vo.ContractVo;
import com.vo.StaffVo;

public interface ContractService {
	public void addcontract(ContractVo con);
>>>>>>> refs/remotes/origin/master
	
	public List<ContractVo> StaffIdSelectContract(StaffVo staff);
	
	public List<ContractVo> ListStaffIdSelectContract();
	
	public List<ContractVo> ClientNameSelectContractVot(int cid);
	
	public List<ContractVo> StaffNameSelectContractVo(int sid);

}
