package assignment5;

public class Program2 {
	
	
	static String name="Jack";
	String name2="Automation";
	public void nonStatic()
	{
		//this.name2 = name2;
	 System.out.println(name2);
	}
	static void staticMethod(String name1)
	{
		 name = name1;
		 System.out.println(name1);
	}
	
	
public static void main(String[] args) {
	
	staticMethod(name);
	Program2 pr = new Program2();
//	pr.nonStatic(name2);
	pr.nonStatic();
	
}
	

}


