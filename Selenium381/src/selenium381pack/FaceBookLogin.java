package selenium381pack;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookLogin {
static FirefoxDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new FirefoxDriver();
		 driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("9762215699");
		String str = driver.getPageSource();
		System.out.println(str);
		
		//System.out.println(str);
		 
		
		

	}

}
