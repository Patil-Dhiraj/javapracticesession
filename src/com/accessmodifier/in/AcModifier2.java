package com.accessmodifier.in;

public class AcModifier2 {
	
	private int a = 10;
	private int b = 20;
	
		private void  printData() {
			System.out.println("Addition = "+a+b);
		}
		
	

		
 class Demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AcModifier2 am = new AcModifier2();
		// am.printData();  //	error
		// System.out.println(a);
	}

}
}