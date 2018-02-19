package assignment5;

public class Program1 {
	
	
	
	public static void add()    //NonStatic Method
	{
		int a =20;      //Local Variable
		System.out.println(a);
	}
	public static void main(String[] args) {
	//	Program1 po = new Program1();
		add();     // Accessing NonStatic method and  Local variable in main method
		
		/*Program1.add();*/
	}

}
