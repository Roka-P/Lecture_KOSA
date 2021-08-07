package com.kosa.myapp;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("sayHello메서드 실행");
//		System.out.println(">>>LOG : " + new java.util.Date());
//		HelloLog.log();  >>횡단적 산재
		String message = "Hello~~~~" + name;
		return message;
	}

	@Override
	public String sayGoodbye(String name) {
		String message = "Goodbye~~~~" + name;
		return message;
	}

}
