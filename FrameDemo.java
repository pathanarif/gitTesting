import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	
	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver webDriver=new ChromeDriver();
		
		webDriver.get("http://demo.guru99.com/test/guru99home/");
		

		webDriver.manage().window().maximize();
		
	}
}
