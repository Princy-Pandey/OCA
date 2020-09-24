package com.oca.day1;

class Product{
	double price;
}

public class Test4 {
	public void updatePrice(Product product,double price)
	{
		price=price*2;
		product.price= product.price + price;
	}

	public static void main(String[] args) {
		Product prt=new Product();
		prt.price=200;
		double newPrice=100;
		Test4 t=new Test4();
		t.updatePrice(prt, newPrice);
		System.out.print(prt.price+ ""+ newPrice);
		
		
		// TODO Auto-generated method stub

	}

}
