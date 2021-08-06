package com.kosa.member;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		MemberController controller = context.getBean(MemberController.class);
		controller.printInfo();
		context.close();
	}
}
