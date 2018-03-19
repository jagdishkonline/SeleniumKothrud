package assignment1;

public class FourthProgram {
public static void main(String[] args) {
	int a=20;
	double d =100.0d;
	float avg;
	int avg1;
	avg=(float) (d/a);
	System.out.println("Average is =" +avg);
	avg1 = (int) (d/a);
	System.out.println("Aveage is ="+avg1);
    if(avg==avg1)
	{
		System.out.println(avg);
	}
	else
	{
		System.out.println(avg1);
	}
	
}
}
