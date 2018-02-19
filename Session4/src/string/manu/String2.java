package string.manu;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "class jupiter.com.google.login.Google_Login_Test";
		System.out.println(s.length());
	//	String2 [] para=s.split("_");
		String text = "automatedscript";
		for(int i=0;i<text.length();i++)
		{
			for(int j=i+1;j<text.length();j++)
			{
				if(text.charAt(i)==text.charAt(j))
				{
					System.out.println("indexof"+i+"index of "+j+"is matched");
				}
				
			}
		}
		
		System.out.println(s.substring(31, 48));
		

	}

}
