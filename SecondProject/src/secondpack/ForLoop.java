package secondpack;

public class ForLoop {
public static void main(String[] args) {
//	Syntax
//	for(initilisation; condition; increment/decrement)
//		//statements
	
	for(int row=1;row<=10;row++)  //select "row" word and right click and refactor it for changing all reference variabe name
	{
		for(int col=1;col<=10;col++)
		{
			System.out.print(row + "  " + col);
		}
		System.out.println(" ");
	}
}

}
