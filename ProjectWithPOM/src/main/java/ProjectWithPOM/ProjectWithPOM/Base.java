package ProjectWithPOM.ProjectWithPOM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;

	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\Resourses\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);       deprecated version(before selenium 4)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		   // after selenium 4

	}

	
	 @AfterMethod
	 public void browserQuit() { 
		 driver.quit();
		 }
	  
	 public void browserClose() { 
		 driver.close(); 
		 }
	 
}
