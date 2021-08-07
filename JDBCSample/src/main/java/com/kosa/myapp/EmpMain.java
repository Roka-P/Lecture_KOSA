package com.kosa.myapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		IEmpService service = context.getBean(IEmpService.class);
		
		System.out.println("--사원의 수 조회--");
		System.out.println(service.getEmpCount());
		System.out.println(service.getEmpCount(50));
		
		System.out.println("--103번 사원의 정보를 조회합니다.");
		System.out.println(service.getEmpInfo(103));
		
		System.out.println("--사원 전체 정보를 조회합니다.");
		System.out.println(service.getEmpList());
		
		System.out.println("--새로운 사원의 정보를 입력합니다.");
		EmpVO emp = new EmpVO();
		emp.setEmployeeId(210);
		emp.setFirstName("roka");
		emp.setLastName("park");
		emp.setEmail("ROKA");
		emp.setPhoneNumber("222-2222");
		emp.setJobId("IT_PROG");
		emp.setSalary(8000);
		emp.setCommissionPct(0.2);
		emp.setManagerId(100);
		emp.setDepartmentId(10);
		try {
			service.insertEmp(emp);
			System.out.println("Insert Complete");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("--신규 사원의 정보를 조회/출력 합니다.");
		EmpVO emp210 = service.getEmpInfo(210);
		System.out.println(emp210);
		
		System.out.println("--210번 사원의 급여를 10% 인상시킵니다.");
		emp210.setSalary(emp210.getSalary()*1.1);
		service.updateEmp(emp210);
		
		System.out.println("--수정된 사원의 정보를 조회/출력 합니다.");
		emp210 = service.getEmpInfo(210);
		System.out.println(emp210);
		
		System.out.println("--210번 사원의 정보를 삭제합니다.");
		service.deleteEmp(210, "ROKA");
		
		System.out.println("--모든 부서번호와 부서이름 정보를 출력합니다.");
		System.out.println(service.getAllDeptId());

		System.out.println("--모든 직무아이디와 직무타이틀 정보를 출력합니다.");
		System.out.println(service.getAllJobId());

		System.out.println("--모든 매니저번호와 매니저름 정보를 출력합니다.");
		System.out.println(service.getAllManagerId());
		
		context.close();
	}

}
