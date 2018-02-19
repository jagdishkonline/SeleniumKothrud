package interfaces;

class MultipleInheritence implements InterfaceClass1,InterFaceClass2{

	public void tool(){System.out.println("Selenium");}  
	public void prize(){System.out.println("10000 INR");}  
	  
	public static void main(String args[]){  
	MultipleInheritence obj = new MultipleInheritence();  
	obj.tool();  
	obj.prize();  
	 }  
}
