package polymorphism;

public class CallingOverRiding {

	public static void main(String args[]){  
		Selenium s=new Selenium();  
		QTP q=new QTP();  
		SoapUI u=new SoapUI();  
		System.out.println("Selenium Cost is: "+s.getToolCost());  
		System.out.println("QTP Cost is: "+q.getToolCost());  
		System.out.println("SoapUI Cost is: "+u.getToolCost());  
	}  
}