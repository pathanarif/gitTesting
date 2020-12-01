import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		
		WebDriver webDriver=new InternetExplorerDriver();
		
		webDriver.get("https://www.google.com");
		
		webDriver.manage().window().maximize();
		
		/*
		 * DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		 * 
		 * capability.setCapability("ignoreZoomSetting", true);
		 */
		/*
		 * capability.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "");
		 * 
		 * webDriver = new InternetExplorerDriver(capability);
		 */
		
	}

}
