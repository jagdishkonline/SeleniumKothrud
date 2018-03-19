package string.jagdish.Practice;

public class DigitsVowelsWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is Jagdish 16";
		int vowels=0,digits=0,blanks = 0;
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e'||ch=='E'|| ch=='i'|| ch=='I'||ch=='o'||ch=='O'||ch=='u' ||ch=='U')
			{
				vowels ++;
			}else
				if(Character.isDigit(ch))
				{
					digits++;
				}else
					if(Character.isWhitespace(ch))
					{
						blanks++;
					}
		
		}
		System.out.println("Vowels="+vowels);
		System.out.println("Digits="+digits);
		System.out.println("Balnaks="+blanks);
	}

}
