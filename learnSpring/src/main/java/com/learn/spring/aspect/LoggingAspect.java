package com.learn.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

	@Before("allGetters()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("Advice run. Get method called.");
	}

	@Before("args(name) && execution(public * set*(..))")
	public void setter(String name) {
		System.out.println("setting " + name);
	}

	@Pointcut("execution(public * get*(..))")
	public void allGetters() {
	}

	@Pointcut("within(com.learn.spring.model.Circle)")
	public void allCircleMethods() {
	}

	@Pointcut("args(String)")
	public void argsWith() {
	}

	@AfterReturning("execution(public * set*(..))")
	public void afterTest(JoinPoint jp){
		System.out.println(jp);
	}

	@Around("allGetters()")
	void around(ProceedingJoinPoint pjp) throws Throwable {
		pjp.proceed();
	}
}
