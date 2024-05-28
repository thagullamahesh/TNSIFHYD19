package com.day2;

public class Or1 {
	static int display(int a,int b) {
	
		return a+b;
}
}
   public class Or2 extends  Or1 {
	   static int  display(int  a ,int b) {
		    return a+b;
	}
   }
	public class OR {
		public static void main(String[] args) {
			Or1.display(5,6);
			Or2.display(10,2);
		}

	}

