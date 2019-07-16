package com.service.staffservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.StaffMapper;
import com.service.staffservice.StaffService;
import com.vo.ClientVo;
import com.vo.StaffVo;

@Service
public class StaffServiceImpl implements StaffService{

	@Autowired
	private StaffMapper staffMapper;
	
	@Override
	public StaffVo loginList(StaffVo st) {
		
		return staffMapper.loginList(st);
	}

	@Override
	public int addcliClientVo(ClientVo cliVo) {
		
		return staffMapper.addcliClientVo(cliVo);
	}

	@Override
	public StaffVo ListStaffSelect(int sid) {
		
		return staffMapper.ListStaffSelect(sid);
	}

	@Override
	public List<StaffVo> StaffNameSelect(String SName) {
		return staffMapper.StaffNameSelect(SName);
	}

}
