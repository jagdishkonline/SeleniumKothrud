package project_Page_Action;

import org.openqa.selenium.WebDriver;

public class Gmail_Home_Page_Action {
private WebDriver driver;
	
	private final String TITLE = "Gmail";
	
	public Gmail_Home_Page_Action(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public boolean isAt() {
		
		return this.driver.getTitle().equals(TITLE);
	}
}
