package hierachyInheritence;


public class ChildClass1Hierachy extends ParentClassHierachy{

	int seleniumExpert=10;   
	 public static void main(String args[]){  
	   ChildClass1Hierachy p=new ChildClass1Hierachy();  
	   System.out.println("QTP Expert are:"+p.qtpExpert);  
	   System.out.println("Selenium Expert are:"+p.seleniumExpert); 
	   System.out.println("You are in ChildClass1");
	} 

}
