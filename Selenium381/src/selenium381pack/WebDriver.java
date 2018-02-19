/**
 * 
 */
package selenium381pack;

/**
 * @author Jagdish
 *
 */
interface WebDriver {
	void get();
	void refresh();
	void close();

}
abstract class RemoteWebDriver implements WebDriver
{
	public void get()
	{
		System.out.println("Browser is Launched");
	}
}