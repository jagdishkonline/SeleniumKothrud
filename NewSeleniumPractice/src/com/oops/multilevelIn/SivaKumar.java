package com.oops.multilevelIn;

public class SivaKumar extends Kumar {
	public void method3()
	{
		System.out.println("Method3 Executed");
	}
public static void main(String[] args) {
	SivaKumar sk =new SivaKumar();
	sk.method1();
	sk.method2();
	sk.method3();
}
}
