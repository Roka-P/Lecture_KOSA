package com.kosa.myapp;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloLog {
	
	@Before("execution(* com..HelloService.sayHello(..))")
	public static void log() {
		System.out.println(">>>LOG : " + new java.util.Date());
	}
	
	
}
