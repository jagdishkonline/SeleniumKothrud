package abstraction;

public class CallingAbstraction {

	public static void main(String[] args) {
		AutomationTool b=new Selenium();//if object is QTP, method of QTP will be invoked    
		int toolCost=b.getToolCost();    
		System.out.println("Tool Rate is: "+toolCost+" INR");
		//WebDriver driver = new FirefoxDriver();

	}

}
