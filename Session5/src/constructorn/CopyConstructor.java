package constructorn;

public class CopyConstructor {
	int age=10;
	String name="Ganesh";
	CopyConstructor(CopyConstructor c){
		//int age=10;
		age = c.age;
		
	}
	CopyConstructor(int age , String name)
	{
		this.age = age;
		this.name= name;
	}
	public CopyConstructor(int age2) {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		CopyConstructor cd = new CopyConstructor(20);
		CopyConstructor cc = new CopyConstructor(22, "Jagdish");
		

	}

}
