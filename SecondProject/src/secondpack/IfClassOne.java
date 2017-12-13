package secondpack;
/*If Car Model is Honda then milege 20
maruti 15
mercedus 5
any other 100*/
public class IfClassOne {

	
	public static void main(String[] args) {
		
	
	String carmodel = "Honda";
	/*String s1= "Maruti";
	String s2= "Hundai";*/
	if(carmodel.equalsIgnoreCase("honda"))
	{
		System.out.println(" Milege 20");
		
	}else if(carmodel.equalsIgnoreCase("Maruti"))
	{
		System.out.println("Milege 15");
	}
}
}
