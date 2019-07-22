package com.service.staffservice;

import java.util.List;

import com.vo.ClientVo;
import com.vo.StaffVo;

public interface StaffService {
	public StaffVo loginList (StaffVo st );
	
	public int addcliClientVo(ClientVo cliVo);
	
	public StaffVo ListStaffSelect(int sid);
	
	public List<StaffVo> StaffNameSelect(String SName);
	
	
}
