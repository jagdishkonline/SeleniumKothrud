package string.jagdish.Practice;

public class StringConCatenation {
	
	public static void main(String[] args) {
		String str1="Jagdish";
		String str2="Kamble";
	String str3=str1+str2;//using + operator
		
		System.out.println("String Concatenation with plus Operator=" +str3);
		String str4=str1.concat(str2);
		System.out.println("String Concatenation="+str4);
	}

}
