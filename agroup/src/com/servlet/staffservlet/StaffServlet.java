package com.servlet.staffservlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.service.staffservice.StaffService;
import com.vo.ClientVo;
import com.vo.StaffVo;

@Controller
@SessionAttributes(value= {"list"})
public class StaffServlet {
	@Autowired
	private StaffService staffService;

	@RequestMapping("/login")
	public ModelAndView login(String usename,String psw) {
		ModelAndView m = new ModelAndView();
<<<<<<< HEAD
=======
		
>>>>>>> refs/remotes/origin/master
		StaffVo s = new StaffVo();
		s.setSUsername(usename);
		s.setSPassworld(psw);
		StaffVo stvo = staffService.loginList(s);
		m.addObject("list",stvo);
		if (stvo==null) {
			m.setViewName("/dead.jsp");
		} else {
			System.out.println(stvo.getSId());
			m.setViewName("redirect:/main");
		}
		return m;
	}

	@RequestMapping("/addcli")
	public ModelAndView addclie(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView m = new ModelAndView();
		String name = req.getParameter("customerJob");	
		String email = req.getParameter("customerEmail");
		String phone = req.getParameter("customerMobile");
		String qq = req.getParameter("customerQq");
		String dz = req.getParameter("customerAddress");
		String zt = req.getParameter("customerType");
		String num = req.getParameter("customerAddress1");
		String yg = req.getParameter("yuangong");
		int d = Integer.parseInt(num);
		int n = Integer.parseInt(yg);
		ClientVo cl = new ClientVo();
		cl.setCName(name);
		cl.setCState(zt);
		cl.setCMailbox(email);
		cl.setIPhone(phone);
		cl.setCSite(dz);
		cl.setCQq(qq);
		cl.setCAid(d);
		cl.setCId(n);
		int c = staffService.addcliClientVo(cl);
		return m;

	}
}
