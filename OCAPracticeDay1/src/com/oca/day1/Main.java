package com.oca.day1;
class Base{
	public static void show() {
		System.out.println("Base Called");
	}
}
	class Derived extends  Base{
		public static void show() {
		System.out.println("Derived Called");
	}
}
public class Main {

	public static void main(String[] args) {
		Base b= new Derived();
	
		b.show();
		// TODO Auto-generated method stub

	}

}

// Base Class Called
