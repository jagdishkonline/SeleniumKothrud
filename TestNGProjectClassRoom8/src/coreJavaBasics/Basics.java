package coreJavaBasics;

public class Basics {
	private String str;
//	public String str;
	
	public void sample1(){
	//	String str; //Local Declaration
		str="Suresh"; //Assigning the value
		System.out.println("Welcome "+str);	
	}
	public void sample2(){
		//String str1="Rajesh";
		str="Rajesh";
		System.out.println("Welcome "+str);	
	}
	public void sample3(){
		//String str2="Mahesh";
		str="Mahesh";
		System.out.println("Welcome "+str);	
	}
	public void sample4(String str4){
		
		System.out.println("Welcome "+str4);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basics b=new Basics(); //Instance or object
		/*b.sample4("Srinivas");
		b.sample4("RAjesh");
		b.sample4("Mahesh");
		b.sample4("Suresh");
	*/
		b.sample2();
	}

}





