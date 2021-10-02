package com.bilgeadam.melih.control;



public class ValueOf {
 
		public static void main(String args[]){  
		
			//int castNumber=Integer.valueOf(num1);
			
			int value=30;  
		String s1=String.valueOf(value);  
		System.out.println(s1+10);
		
		int x =Integer.parseInt("9");
	      double c = Double.parseDouble("5");
	      int b = Integer.parseInt("1010",2);

	      System.out.println(x);
	      System.out.println(c);
	      System.out.println(b);
	      
	      String string=String.valueOf(value);
	      String string1 = Integer.toString(value);
	      
		
		}  
		
		

}
