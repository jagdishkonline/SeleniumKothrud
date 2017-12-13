package secondpack;

public class DoWhileLoop {
public static void main(String[] args) {
	//syntax of do while   = first execute and check the conditions
	//initialisation
	int i=1;
	System.out.println(i++ + --i - i-- + ++i); // 
	do{
		//statement
		
		System.out.println(i);
		
		//increment/decrement
		i++;++i;
	}while(i<=10);  // op= 1 to 10
	//while(i>=10)   //op=1
}
}
