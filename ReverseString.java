package string.jagdish.Practice;

import java.util.Scanner;

public class ReverseString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String in console=");
		String name= sc.nextLine();
		String reverse = " ";//String Initialisation is very important
	//	int len=name.length();
	//	System.out.println("String Length="+len);
		for(int i=name.length()-1;i>=0;i-- )
		{
			reverse=reverse+name.charAt(i);
		}
		
		System.out.println("Reverse String is="+reverse);

	}

}

/*//Program to reverse word in the String
public class StringRev2
{

	public static void main(String[] args) 
	{
		String input="Welcome to Java Session"; 		//Input String	
		String[] words=input.split(" ");				//Split the word from String
		String[] revwords=new String[words.length];
		int j=0;
		for(int i=words.length-1;i>=0;i--)				//Loop for Reversing the Word	
		{
			revwords[j]=words[i];						//Storing the reversed words
			System.out.print(revwords[j]+" ");
			j++;
		}	
	}

}
*/