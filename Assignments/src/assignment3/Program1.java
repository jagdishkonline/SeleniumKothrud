package assignment3;
/*1.    Print, using while loop 
3  2  1
3  2
3
*/
public class Program1 {

	public static void main(String[] args) {
		
		int i=1;
		while( i <= 3)   //Loop For Rows
	    {
			int j=3;
	        while( j >= i) // Loop for columns
	        {
	            System.out.print(j+" ");
	            j--;
	        }
	        i++;
	        System.out.println();
	     
	    }       
		
		
		
}
}
