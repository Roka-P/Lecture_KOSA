package com.kosa.hr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		EmpController controller = context.getBean(EmpController.class);
		controller.printInfo(50);
		context.close();

	}

}
