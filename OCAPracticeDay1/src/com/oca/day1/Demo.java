package com.oca.day1;

public class Demo {

	public static void main(String[] args) {
		int score=1;
		try {
			System.out.println(score++);
		}
		catch(Throwable t){
			System.out.println(score++);
			
		}
		finally {
			System.out.println(score++);
		}
		System.out.println(score++);
		
		// TODO Auto-generated method stub

	}

}
//output:
//	1
//	2
//	3
