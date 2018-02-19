package variabletype;

public class FunctionClass {
//int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		FunctionClass inst = new FunctionClass();
	//	inst.add();
		inst.add(1, 2);
		inst.add(100, 2);
		inst.add(1, 200);
		inst.add(121, 2);
	}

	public void add(int a, int b) {
		//System.out.println(FunctionClass.class);
		System.out.println(a + b);
		
	}
	/*public void add()
	{
		System.out.println(a);
	}*/

}
