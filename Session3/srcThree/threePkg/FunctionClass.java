package threePkg;

public class FunctionClass {
	
	int x =200;  //instance variable or global variable= it declares outside of method but declare within class. it stores in heap memory
	static int z= 300;//global/static/class variable  it is stores in class memory or context memory
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e =10; // local variable
		FunctionClass inst = new FunctionClass(); //inst is reference of that FunctionClass or instance variable or non static variable
		System.out.println(inst.x);
		System.out.println(z);

	}
	int y=10; //instance variable or global variable
	public void add() //non static method or instance method
	{
		System.out.println("We are in add");
		System.out.println(x);
		System.out.println(z);
		
	}
	public void substract(int a, int b)// no return type with two parameters
	{
		System.out.println(a-b);
	}
	public int devide(int c , int d) //return type and no. of variables
	{
		return 1;
		
	}

}
