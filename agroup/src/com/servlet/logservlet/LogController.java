package com.servlet.logservlet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vo.LogVo;

@Controller
public class LogController {
	
	@Autowired
	private com.service.logservice.LogService logService;
	
	
	@RequestMapping("/main")
	public ModelAndView main() {
//		ModelAndView m = new ModelAndView();
		ModelAndView m = new ModelAndView("/view/frame/main.jsp");
//		m.setViewName("/view/frame/main.jsp");
		return m;
	}
	
	@RequestMapping("/top")
	public ModelAndView top() {
		ModelAndView m = new ModelAndView("/view/frame/top.jsp");
		return m;
	}
	
	@RequestMapping("/left")
	public ModelAndView left() {
		ModelAndView m = new ModelAndView("/view/frame/left.jsp");
		return m;
	}
	
	@RequestMapping("/down")
	public ModelAndView down() {
		ModelAndView m = new ModelAndView("/view/frame/down.jsp");
		return m;
	}
	
	//查询所有日志信息
	@RequestMapping("/queryLog")
	public ModelAndView queryLog() {
		ModelAndView m = new ModelAndView("/view/cdailylogView/linkrecord_list.jsp");
		List<LogVo> list = logService.queryLog();
		m.addObject("list",list);
		return m;
	}
	
	//查询某一个员工日志信息
	@RequestMapping("/queryLogBySID")
	public ModelAndView queryLogBySID(int sid) {
		System.out.println("============================================================="+sid);
		ModelAndView m = new ModelAndView("/view/cdailylogView/linkrecord_list.jsp");
		List<LogVo> list = logService.queryLogBySID(sid);
		m.addObject("list",list);
		return m;
	}
	
	//在日志查询页面点击添加按钮跳转至日志添加页面
	@RequestMapping("/preAdd")
	public ModelAndView preAddLog() {
		ModelAndView m = new ModelAndView("/view/cdailylogView/linkrecord_add.jsp");
		return m;
	}

	//在日志添加页面点击添加按钮添加日志信息
//	@RequestMapping("/addLog")
//	//@ResponseBody//修饰的方法返回的数据，springmvc将其自动转换成json格式，然后返回给前端
//	public @ResponseBody String addLog(@RequestBody LogVo lvo) {//@RequestBody修饰目标方法的入参，可以将ajax发送的json对象赋值给入参
//		System.out.println("-----------------------------------------------------------addLog--------------------------------------------------------------------------");
//		System.out.println(lvo);
//		String str = null;
//		if(logService.addLog(lvo)) {
//			str = "success";
//		}
//		System.out.println(str);
//		return str;
//	}
	
	//在日志添加页面点击添加按钮添加日志信息
	@RequestMapping("/addLog")
	public ModelAndView addLog(LogVo lvo) {
		System.out.println(lvo);
		ModelAndView modelView = new ModelAndView();
		boolean b = logService.addLog(lvo);
		if(b==true) {
			System.out.println("----------------------"+b+"-------------------------------------addLog--------------------------------------------------------------------------");
			//重定向跳转
			//modelView.setViewName("redirect:/queryLog");
			//数据转发跳转
			modelView.setViewName("forward:/queryLog");
		}
		return modelView;
	}
	
	
	
}
