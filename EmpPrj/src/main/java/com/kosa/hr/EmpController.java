package com.kosa.hr;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import oracle.jdbc.driver.DatabaseError;

public class EmpController {
	
	IEmpService empService;

	public void setEmpService(IEmpService empService) {
		this.empService = empService;
	}
	
	public void printInfo(int deptid) {
//		int count = empService.getEmpCount(deptid);
//		System.out.println("사원의 수 : " + count);
		EmpVO emp = empService.getEmp(300);
		System.out.println(empService.getDepartmentName(emp.getDepartmentId()));
//		System.out.println(emp);
//		System.out.println("-------------");
//		List<EmpVO> empList = empService.getAllEmps();
//		for (EmpVO vo : empList) {
//			System.out.println(vo);
//		}
//		List<Map<Integer, String>> deptList = empService.getAllDeptId();
//		for (Map<Integer, String> dept : deptList) {
//			System.out.println(dept);
//		}
//		List<Map<String, String>> jobList = empService.getAllJobId();
//		for (Map<String, String> job : jobList) {
//			System.out.println(job);
//		}
//		Date now = new Date(2010,03,03);
//		EmpVO newEmp = new EmpVO(300,"ROKA", "PARK", "rok", "010.1234.5678", now, "IT_PROG", 10000, 0.1, 100, 10);
//		empService.insertEmp(newEmp);
		
		System.out.println("--------수정 전---------");
		System.out.println(empService.getEmp(300));
		EmpVO updateEmp = new EmpVO();
		updateEmp.setEmployeeId(300);
		updateEmp.setFirstName("ROKA");
		updateEmp.setSalary(10000);
		empService.updateEmp(updateEmp);
		System.out.println("--------수정 후---------");
		System.out.println(empService.getEmp(300));
	}

}
