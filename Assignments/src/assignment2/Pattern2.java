package assignment2;

/*
		3 2 1 
		3 2 
		3   */
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
        for (int i = 1; i <= 3; i++) 
        { 
            for (int j = 3; j >= i; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }   
	}

}
