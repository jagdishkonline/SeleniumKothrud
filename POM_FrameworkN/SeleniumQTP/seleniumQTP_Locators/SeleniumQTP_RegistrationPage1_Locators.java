package seleniumQTP_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumQTP_RegistrationPage1_Locators {
	WebDriver driver=null;
	public SeleniumQTP_RegistrationPage1_Locators(WebDriver driver)// creating constructor
	{
		this.driver= driver;
		PageFactory.initElements(this.driver, this);//very imp line  for intialising locators........
	}
//	WebElemnt ele =driver.findElement(By.name("name")); this line means @FindBy
	@FindBy(name= "name") // we can use any locator here 
private WebElement userName;
	public WebElement getUserName()  //ex of Encapsulation by using get method can access private element
	{
		return userName;
		
	}
	@FindBy(name= "password") // we can use any locator here 
	private WebElement password;
		public WebElement getPassword()  //ex of Encapsulation by using get method can access private element
		{
			return password;
			
		}
		@FindBy(name= "confirmpassword") // we can use any locator here 
		private WebElement confmPassword;
			public WebElement getConfPassword()  //ex of Encapsulation by using get method can access private element
			{
				return confmPassword;
				
			}
			@FindBy(name= "insert") // we can use any locator here 
			private WebElement submit;
				public WebElement getSubmit()  //ex of Encapsulation by using get method can access private element
				{
					return submit;
					
				}


}
