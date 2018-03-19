package string.jagdish.Practice;

public class StringClasses {
public static void main(String[] args) {
	String str1= "Jagdish";//Java String Literal Format Objects are Created in String Constant pool Area
	String str2="Jagdish";
	System.out.println(str1==str2);
	String str3= new String("Jagdish"); //object is created heap area,Heap Memory allows duplicate value
	String str4= new String("Jagdish");
	System.out.println(str3==str4);
	
}
}
