package com.kosa.myapp;

import org.springframework.stereotype.Component;


public class HelloServiceProxy extends HelloService {

	@Override
	public String sayHello(String name) {
		HelloLog.log();
		String result = super.sayHello(name);
		return result;
	}

}