package com.servlet.contractservlet;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.service.contractservice.ContractService;
import com.service.staffservice.StaffService;
import com.vo.ContractVo;
import com.vo.StaffVo;


@Controller
public class ContractServlet{
	
	@Autowired
	private ContractService contractService;
	@Autowired
	private StaffService staffService;
	
	private static Logger log = LogManager.getLogger();
	//添加合同
	@RequestMapping("/findCustomerByCAId")
	public ModelAndView findCustomerByCAId(@ModelAttribute ContractVo con) {
		contractService.addcontract(con);
		return null;
	}
	
	//供查找跳转的servlet方法
	@RequestMapping("/aaa")
	public ModelAndView aaa(String add) {
		
		if("addcdailylog".equals(add)) {
			System.out.println("---------------------------------------"+add);
			ModelAndView modelAndView =new ModelAndView();
			modelAndView.setViewName("/view/customerView/customer_add.jsp");
			return modelAndView;
		}else if("addcontract".equals(add)) {
			
			ModelAndView modelAndView =new ModelAndView();
			modelAndView.setViewName("/view/contractView/contract_add.jsp");
			return modelAndView;
		}
		return null;
	}
	
	//查找合同				  
	@RequestMapping("/StaffIdSelectContract")
	public ModelAndView StaffIdSelectContract(@SessionAttribute("list") StaffVo staff){
		ModelAndView modelAndView =new ModelAndView();
		if(staff.getSId()==2) {
			List<ContractVo> list=contractService.StaffIdSelectContract(staff);
			modelAndView.addObject("conlist",list);
			modelAndView.setViewName("/view/contractView/contract_list.jsp");
			return modelAndView;
		}else if(staff.getSId()==1){
			List<ContractVo> list=contractService.ListStaffIdSelectContract();
			modelAndView.addObject("conlist",list);
			modelAndView.setViewName("/view/contractView/contract_list.jsp");
			return modelAndView;
		}
		return null;
	}
	
//	@RequestMapping("/StaffNameSelectContractVo")
//	public ModelAndView StaffNameSelectContractVo(int sid){
//		ModelAndView modelAndView =new ModelAndView();
////		List<StaffVo> list=staffService
//		
//		
//		
//		return null;
//	}

}
