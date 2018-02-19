package assignment3;
/*  Iterate through 100,  Print Grade
Marks greter than 75 = B
Marks greter than 60 = C
	Marks greter than 45 = D
	Marks less  than 35 = fail.*/

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Your Avg  Marks= ");
		int AvgMarks = sc.nextInt();
		// int AvgMarks=70;
		if (AvgMarks >= 90) {
			System.out.print("Grade A");
		} else if (AvgMarks >= 75) {
			System.out.print("Grade B");
		} else if (AvgMarks >= 60) {
			System.out.print("Grade C");
		} else if (AvgMarks >= 45) {
			System.out.print("Grade D");

		} else {
			System.out.println("Grade Fail");
		}
	}

}
