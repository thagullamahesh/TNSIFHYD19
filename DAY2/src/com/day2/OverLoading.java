package com.day2;

public class OverLoading {
	
	void display(int a) {
		System.out.println("print some value "+a);
	}
		static void display(float b) {
			System.out.println("something");
		}
		public static void main(String[] args) {
			
		
		OverLoading a1 = new OverLoading();
		a1.display(5);
		 OverLoading.display(2.2f);
	}

}
