package assignment2;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=1,n2=1,n3,i,count=12;    
		 System.out.print(n1+" "+n2);//printing 1 and 1    
		    
		 for(i=2;i<count;i++)//loop starts from 2 because 1 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
		

	}

}
