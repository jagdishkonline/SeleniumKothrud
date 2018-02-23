package com.oops.singleinheritance;


public class Kumar extends Siva
{
	
	
	public void method2()
	{
		System.out.println("method2 executed");
	}
	public static void main(String[] args) {
		Kumar k = new Kumar();
		k.method1();
		k.method2();
	}
	
}
