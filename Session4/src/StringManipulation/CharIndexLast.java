package StringManipulation;

public class CharIndexLast {

	public static void main(String[] args) {
		
		//charAt(), indexOf() & lastIndexOf()
		
		String text = "automAtedscriptse";
		//String text="seleniumautomation";
		
		int index = text.charAt(5);
		char ch = text.charAt(5);
		
		int indexOf = text.indexOf('e');
		int lastIndexOf = text.lastIndexOf('e');
				
		System.out.println("ASCII value : " + index);
		System.out.println("Value for index '5' is : "+ ch);
		
		System.out.println("\n First index of 'e' : " + indexOf);
		System.out.println("Last index of 'e' : " + lastIndexOf);
		System.out.println("Length if String is=" +text.length());
		

	}

}
