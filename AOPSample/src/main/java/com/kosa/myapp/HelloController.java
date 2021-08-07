package com.kosa.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	
	@Autowired
	IHelloService helloService;
	
//	public void setHelloService(IHelloService helloService) {
//		this.helloService = helloService;
//	}
	
	public void hello(String name) {
		String result = helloService.sayHello(name);
		System.out.println(result);
	}
}
