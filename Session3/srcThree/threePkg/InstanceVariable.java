package threePkg;

public class InstanceVariable {
	int a = 10;//instance/global/non static
	public static void main(String[] args) {
		InstanceVariable inst = 
				new InstanceVariable();
		System.out.println(inst.a);
//		inst.add();
	}
	public void add(){
		System.out.println(a);
	}
}

