package interfaces;

interface AllMethods{  
	void add();  
	void subtract();  
	void multiply();  
	void division();  
}  
  
/*abstract class interFace implements AllMethods{  
	public void multiply(){System.out.println("We are in multiply");}  
} */ 
  
class inheritence implements AllMethods{  
	public void add(){System.out.println("We are in add");}  
	public void subtract(){System.out.println("We are in subtract");}  
	public void division(){System.out.println("We are in division");} 
	public void multiply(){System.out.println("We are in multiply");}
}  
  
  