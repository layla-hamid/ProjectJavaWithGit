package com.learnjava;

public class CalcoTest {

	public static void main(String[] args) {
		
		Calco c = new Calco();
		c.additionner(2, 5, 10, -7);
//		c.additionner(12);
//		c.additionner(5);
//		c.additionner(8);
		System.out.println(c.getResult());

	}

}
