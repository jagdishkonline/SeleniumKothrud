package threePkg;

public class AccessStaticNonStatic {


public void nonStatic()//thumb rule = we should create reference variable outside 
{
	FunctionClass inst = new FunctionClass();
	System.out.println(inst.x);
	System.out.println(inst.z);//warnings are not allowed to push the code z is static variable should call with reference variable
	System.out.println(FunctionClass.z);//static outside class Class Name variable
}
public static void main(String[] args) {
	
	
	
}

}
