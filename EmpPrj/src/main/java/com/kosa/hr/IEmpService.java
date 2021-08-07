package com.kosa.hr;

import java.util.List;
import java.util.Map;

public interface IEmpService {
	
	int getEmpCount(int deptid);
	
	EmpVO getEmp(int empid);
	
	List<EmpVO> getAllEmps();
	
	String getDepartmentName(int deptid); 
	
	List<Map<Integer, String>> getAllDeptId();
	
	List<Map<String, String>> getAllJobId();

	void insertEmp(EmpVO emp);
	
	void updateEmp(EmpVO emp);
}