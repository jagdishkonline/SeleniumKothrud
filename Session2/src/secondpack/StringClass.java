package secondpack;

public class StringClass {
	public static void main(String[] args) {
		String s = "selenium";
		String s1 = "java";
		int a=10;
		int b=20;
		//String is Classs We treat here as Data Type
	
		System.out.println(s);
		/*int s1 = s.length();
		System.out.println(s1);*/
		System.out.println(s.length()); //Instead of craeting anothr object we used same object
		System.out.println(s+s1+a+b); // op=seleniumjava1020
		System.out.println(a+b+s+s1); //op=30seleniumjava
	}

}
