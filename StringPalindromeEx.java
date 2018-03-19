package string.jagdish.Practice;

public class StringPalindromeEx {
	
	public static void main(String[] args) {
		
		
		String original ="nitin";
		String reverse ="";
		int length=original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(reverse.equals(original))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is Not Palindrome");
		}
	}

}
