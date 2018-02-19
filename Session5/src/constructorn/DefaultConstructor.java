package constructorn;

public class DefaultConstructor {
	// Constructor is a Special type of method which is used to initialize the Object/instance/reference
	DefaultConstructor()
	{
		System.out.println("We are in Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("we are in method ");

		DefaultConstructor instanse = new DefaultConstructor();
		System.out.println("we are in method2 ");
		
	}

}
