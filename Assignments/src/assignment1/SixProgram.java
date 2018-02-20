package assignment1;

public class SixProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long carprice =70;
		if(carprice>90)
		{
			System.out.println("Premium");
		}
		else if(carprice >75)
		{
			System.out.println("Platinum");
		}
		else if(carprice > 45)
		{
			System.out.println("Gold");
		}
		else if(carprice > 25)
		{
			System.out.println("Classic");
		}

	}

}
