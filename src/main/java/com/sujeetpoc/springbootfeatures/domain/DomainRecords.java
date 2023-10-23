package com.sujeetpoc.springbootfeatures.domain;

public class DomainRecords {

	//Records is a new feature introduced in Java 14
	public record Employee(int empId, String empName) {}
	
}
