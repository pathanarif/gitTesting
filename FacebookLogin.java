import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver webDriver=new ChromeDriver();
		
		webDriver.get("https://www.facebook.com");
		
		webDriver.manage().window().maximize();
		
		
		WebElement username=webDriver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		WebElement password=webDriver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
	//	WebElement LoginButton=webDriver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
		
		//or
		
		WebElement LoginButton1=webDriver.findElement(By.xpath("//*[@name=\"login\"]"));
		
		username.sendKeys("aaaa");
		password.sendKeys("123");

		LoginButton1.click();
		
	}

}
