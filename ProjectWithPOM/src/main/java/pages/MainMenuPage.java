package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ProjectWithPOM.ProjectWithPOM.Base;

public class MainMenuPage extends Base{
	WebDriver driver;
	By mainMenu = By.xpath("//ul[@class='navbar-nav']//child::li//a");
	
	
	public MainMenuPage(WebDriver driver) {
		this.driver = driver;
	}
	public void mainMenu(String actualMenu) {
		List<WebElement> menuitems = driver.findElements(mainMenu);
		for (WebElement menu : menuitems) {
			if (menu.getText().equals(actualMenu)) {
				menu.click();
				break;
			}
		}
	}
	
}
