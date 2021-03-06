package seleniumQTP_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumQTP_RegistrationPage2_Locators {
	WebDriver driver=null;
	public SeleniumQTP_RegistrationPage2_Locators(WebDriver driver)// creating constructor
	{
		this.driver= driver;
		PageFactory.initElements(this.driver, this);//very imp line  for intialising locators........
	}
	@FindBy(name="First_Name") // we can use any locator here 
	private WebElement firstName;
		public WebElement getFirstName()  //ex of Encapsulation by using get method can access private element
		{
			return firstName;
			
		}
		@FindBy(name="Last_Name") // we can use any locator here 
		private WebElement lastName;
			public WebElement getLastName()  //ex of Encapsulation by using get method can access private element
			{
				return lastName;
				
			}
			@FindBy(name="Email_Id") // we can use any locator here 
			private WebElement emaiId;
				public WebElement getemailId()  //ex of Encapsulation by using get method can access private element
				{
					return emaiId;
					
				}
				@FindBy(name="Mobile_Number") // we can use any locator here 
			private WebElement mobileNumber;
				public WebElement getMobileNumber()  //ex of Encapsulation by using get method can access private element
				{
					return mobileNumber;
					
				}// we can use any locator here 
				
				@FindBy(name="insert") // we can use any locator here 
				private WebElement nextButton;
					public WebElement getNextButton()  //ex of Encapsulation by using get method can access private element
					{
						return nextButton;
						
					}

	}
