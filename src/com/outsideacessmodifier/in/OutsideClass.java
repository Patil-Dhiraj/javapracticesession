package com.outsideacessmodifier.in;
import com.advanced.accessmodifiers.*;

 class OutsideClass  {

	public static void main(String[] args) {
		
		 DerivedClass dc = new  DerivedClass();
		 dc.baseMethod();
		 dc.derivedMethod();
		 
		 System.out.println(dc.derivedVariable);
		 
	//	 BaseClass bc = new BaseClass();
		 
		 System.out.println(dc.derivedVariable);
		 
		// System.out.println(bc.baseVariable);
	}
}
