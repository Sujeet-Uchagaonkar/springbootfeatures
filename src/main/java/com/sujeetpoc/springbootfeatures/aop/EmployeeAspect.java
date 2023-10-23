package com.sujeetpoc.springbootfeatures.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Aspect
@Component
@Log
public class EmployeeAspect {

	// AOP : Aspect based programming , application can be logically divided using
	// cross cutting concerns. e.g. Spring AOP, AspectJ
	// Aspect : class with advice and pointcut definition
	// Pointcut : is an expression which decide where to execute an advice
	// Advice : an action taken before/after/around the execution pointcut
	// Join point : point of application execution where we can apply aspect
	// Target object : on which aspect is applied (In this case :
	// EmployeeService.java)
	// Proxy: It is an object that is created after applying advice to a target
	// object is called proxy. AOP implements the JDK dynamic proxy

	@Before(value = "execution(* com.sujeetpoc.springbootfeatures.service.EmployeeService.*())")
	public void beforeCallingEmployeeMethods() {
		log.info("Aspect- Before Creating Employee..");
	}

	@After(value = "execution(* com.sujeetpoc.springbootfeatures.service.EmployeeService.getSampleEmployee(..))")
	public void afterCreatingSampleEmployee() {
		log.info("Aspect- After Creating Employee..");
	}

	@Around(value = "execution(* com.sujeetpoc.springbootfeatures.service.EmployeeService.getEmployees())")
	public void aroundGetEmployees() {
		log.info("Aspect- Around Getting Employees..");
	}
	
	

	
}
