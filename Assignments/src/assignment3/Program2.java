package assignment3;
/*   Print, using For loop
3  2  1
2   1
1
*/
public class Program2 {
	public static void main(String[] args) {
		
	
		for (int i = 3; i >= 1; i--) 
	    {
	        for (int j = i; j >= 1; j--)
	        {
	            System.out.print(j+" ");
	        }
	         
	        System.out.println();
	    }       
		
	}
}
