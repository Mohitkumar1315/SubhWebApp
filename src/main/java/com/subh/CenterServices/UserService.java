package com.subh.CenterServices;

import java.util.List;

import com.subh.model.Staff;
import com.subh.model.StaffLogin1;

public interface UserService 
{

	List<Staff> findUser(StaffLogin1 staffLogin);

}
