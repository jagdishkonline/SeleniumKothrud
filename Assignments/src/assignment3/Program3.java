package assignment3;
/*
3.    Print, using while loop
3  2  1
2   1
1
*/

public class Program3 {

	public static void main(String[] args) {
		int i=3;
		while( i >= 1) 
	    {
			int j=i;
	        while( j >= 1)
	        {
	            System.out.print(j+" ");
	            j--;
	        }
	        i--;
	        System.out.println();
	     
	    }       
		

	}

}
