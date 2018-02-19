package assignment9;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LocalDriverFactory {
	static WebDriver createInstance(String browserName) {
        WebDriver driver = null;
        if (browserName.toLowerCase().contains("firefox")) {
            driver = new FirefoxDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("ie")) {
        	DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		    capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		    File file = new File("D:/Lib/IEDriverServer.exe");
		    System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		    driver = new InternetExplorerDriver(capabilities);
            return driver;
        }
        if (browserName.toLowerCase().contains("chrome")) {
        	File ChromeDriver = new File("D:/Lib/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", ChromeDriver.getAbsolutePath() );
  		  	driver = new ChromeDriver();
            return driver;
        }
        return driver;
    }
}
