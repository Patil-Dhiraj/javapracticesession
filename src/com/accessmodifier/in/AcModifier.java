package com.accessmodifier.in;

public class AcModifier {
	
	public int a= 10;
	public int b =20;
	
	
		public void addition() {
			System.out.println("Addition = "+(a+b));
		}
}
	
 class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AcModifier am = new AcModifier();
			am.addition();
			
			System.out.println();
			
	  }
}


