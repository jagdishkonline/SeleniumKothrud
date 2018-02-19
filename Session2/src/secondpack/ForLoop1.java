package secondpack;


/*1
  1 2
  1 2 3*/

//Home work
/*
321
21
1


   1
  21
 321
 
 
 321
  21
   1
   
       1
      212
     32123
     
      
      32123
       212
        1
        
        
*/
public class ForLoop1 {
	public static void main(String[] args) {
	for(int row=1;row<=3;row++)  //select "row" word and right click and refactor it
	{
		for(int col=1;col<=row;col++)
		{
			System.out.print(col);
		}
		System.out.println("");
		
	}
}

}

