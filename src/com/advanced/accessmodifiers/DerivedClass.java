package com.advanced.accessmodifiers;

public class DerivedClass extends BaseClass {
	
	public String  derivedVariable = "derived variable";
	
	public void baseMethod() {
		System.out.println(" Override Base Method.....");
	}
	
	public void derivedMethod() {
		System.out.println("Derived Method....");
	}
}
