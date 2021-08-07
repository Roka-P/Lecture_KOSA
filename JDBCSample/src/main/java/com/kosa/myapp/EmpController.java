package com.kosa.myapp;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {
	
	@Autowired
	IEmpService empService;
	
	@RequestMapping(value="/hr/count")
	public String empCount(@RequestParam(value="deptid", required=false, defaultValue="0") int deptid, Model model) {
		if(deptid==0) {
			model.addAttribute("count", empService.getEmpCount());
		} else {
			model.addAttribute("count", empService.getEmpCount(deptid));
		}
		return "hr/count";
		}
	
	@RequestMapping(value= {"/hr","/hr/list"})
	public String getAllEmps(Model model) {
		List<EmpVO> empList = empService.getEmpList();
		model.addAttribute("empList", empList);
		return "hr/list";
		}
	
	@RequestMapping(value= "/hr/insert", method=RequestMethod.GET)
	public String insertEmp(Model model) {
		model.addAttribute("deptList", empService.getAllDeptId());
		model.addAttribute("jobList", empService.getAllJobId());
		model.addAttribute("managerList", empService.getAllManagerId());
		return "hr/insertform";
		}
	
	@RequestMapping(value= "/hr/insert", method=RequestMethod.POST)
	public String insertEmp(EmpVO emp) {
		empService.insertEmp(emp);
		return "Redirect:hr/";
	}
	
}
