package javaprograms;


//Program to reverse word in the String
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

/*public class StringRev2{
	 
public static void main(String args[])
{
	String string = "Welcome to Java Programming and Dotnet Programming";
	String[] wordsCount = string.split(" ");
	
	System.out.println("The Given String is:\n" + string + "\n");
	System.out.println("After Reverse String is:");
	
	for(int i = wordsCount.length;i > 0;i--)
	{
		System.out.print(wordsCount[i - 1] + " ");
		}
	}
}*/

/*public class StringRev2{
    public static void main(String args[]){
  String str[] = "He is the one".split(" ");//here String array taken
    	
    String finalStr="";
        for(int i = str.length-1; i>= 0 ;i--)//array is there thats why not taken length() function
        {
         //   finalStr += str[i]+" ";  or
        	finalStr = finalStr + str[i] +" ";
        }
        System.out.println(finalStr);
    }
}*/