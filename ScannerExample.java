package string.jagdish.Practice;

import java.util.Scanner;

public class ScannerExample {
	
	public static void add()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number=");
		int i=	sc.nextInt();
		System.out.println("Enter Second Number=");
		int j=	sc.nextInt();
		
		int z= i+j;
		System.out.println("Addition is :"+z);
	}
	public static void main(String[] args) {
		ScannerExample.add();
		
	}

}
