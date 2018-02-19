package selenium381pack;

public class TestDemoSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				RemoteWebDriver r;
				r = new FirefoxBrowser();
				r.get();
				r.refresh();
				r.close();
				r= new ChromeBrowser();
				r.get();
				r.refresh();
				r.close();
	}

}
