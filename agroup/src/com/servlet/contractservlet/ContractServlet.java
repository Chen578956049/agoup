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

import com.service.clientservice.ClientService;
import com.service.contractservice.ContractService;
import com.service.staffservice.StaffService;
import com.vo.ClientVo;
import com.vo.ContractVo;
import com.vo.StaffVo;


@Controller
public class ContractServlet{
	
	@Autowired
	private ContractService contractService;
	@Autowired
	private StaffService staffService;
	@Autowired
	private ClientService clientService;
	
	private static Logger log = LogManager.getLogger();
	//添加合同
	@RequestMapping("/findCustomerByCAId")
	public ModelAndView findCustomerByCAId(@ModelAttribute ContractVo con) {
		int contract=contractService.addcontract(con);
		if("潜在".equals(clientService.Listselectclient(con.getCONCid()).getCState())&&contract!=0) {
			System.out.println("------------------"+con.getCONCid()+"-----------第一个---------"+"已成交");
			clientService.StateClientUpdate(con.getCONCid(), "已成交");
		}else if("已成交".equals(clientService.Listselectclient(con.getCONCid()).getCState())&&contract!=0) {
			System.out.println("------------------"+con.getCONCid()+"------------第二个--------"+"已成交");
			clientService.StateClientUpdate(con.getCONCid(),"老客户");
		}else if("老客户".equals(clientService.Listselectclient(con.getCONCid()).getCState())&&contract!=0) {
			System.out.println("------------------"+con.getCONCid()+"----------第三个----------"+"已成交");
			clientService.StateClientUpdate(con.getCONCid(),"老客户");
		}
		return null;
	}
	
	//供查找跳转的servlet方法
	@RequestMapping("/aaa")
	public ModelAndView aaa(String add) {
		
		if("addcdailylog".equals(add)) {
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
	public ModelAndView StaffIdSelectContract(@SessionAttribute("list") StaffVo staff,String queryType){
			ModelAndView modelAndView =new ModelAndView();
			if(staff.getSPid()==2) {
				List<ContractVo> list=contractService.StaffIdSelectContract(staff);
				modelAndView.addObject("conlist",list);
				modelAndView.addObject("queryType",queryType);
				modelAndView.setViewName("/view/contractView/contract_list.jsp");
				return modelAndView;
			}else if(staff.getSPid()==1){
				List<ContractVo> list=contractService.ListStaffIdSelectContract();
				modelAndView.addObject("conlist",list);
				modelAndView.addObject("queryType",queryType);
				modelAndView.setViewName("/view/contractView/contract_list.jsp");
				return modelAndView;
			}
			return null;
	}
	
	
	
	@RequestMapping("/StaffNameSelectContractVo")
	public ModelAndView StaffNameSelectContractVo(@SessionAttribute("list") StaffVo staff,String userName,String queryType){
		ModelAndView modelAndView =new ModelAndView();
		if("1".equals(queryType)&&staff.getSPid()==1) {
			List<StaffVo> sta=staffService.StaffNameSelect(userName);
			modelAndView.addObject("sta",sta);
			modelAndView.addObject("queryType",queryType);
			modelAndView.setViewName("/view/contractView/contract_list.jsp");
			return modelAndView;
		}else if("2".equals("queryType")&&staff.getSPid()==2) {
			List<ClientVo> client=clientService.ClientNameSelect(userName);
			modelAndView.addObject("client",client);
			modelAndView.addObject("queryType",queryType);
			modelAndView.setViewName("/view/contractView/contract_list.jsp");
			return modelAndView;
		}
		return null;
	}

}
