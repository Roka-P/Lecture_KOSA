package com.kosa.myapp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;


public class PerformanceAspect {
	public Object trace(ProceedingJoinPoint joinpoint) {
		Signature s = joinpoint.getSignature();
		String methodName = s.getName();
		System.out.println("[Log] Before : " + methodName + " time check start");
		
		Object result = null;
		long startTime = System.nanoTime();
		try {
			result = joinpoint.proceed();
		} catch (Throwable e) {
			System.out.println("[Log]Exception : " + methodName);
		} finally {
			System.out.println("[Log]Finally : " + methodName);
		}
		long endTime = System.nanoTime();
		System.out.println("[Log]After : " + methodName + " time check end");
		System.out.println("[Log]" + methodName + (endTime-startTime));
		
		return result;
	}
}
