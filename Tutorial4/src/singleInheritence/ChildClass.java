package singleInheritence;

public class ChildClass extends ParentClass{

	int seleniumExpert=10;  
	
	 public static void main(String args[]){  
	   ChildClass p=new ChildClass();  
	   System.out.println("QTP Expert are:"+p.qtpExpert);  
	   System.out.println("Selenium Expert are:"+p.seleniumExpert);  
	}  

}
