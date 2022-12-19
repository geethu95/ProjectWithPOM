package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ProjectWithPOM.ProjectWithPOM.Base;

public class SideMenuPage extends Base {
	WebDriver driver;
	By sideMenu = By.xpath("//ul[@class='list-group list-group-flush']//child::li//a");
	
	public SideMenuPage(WebDriver driver) {
		this.driver = driver;
	}
	public void sideMenu(String actualsideMenu)  {
		List <WebElement> sideMenuitems = driver.findElements(sideMenu);
			for(WebElement sideNavMenu : sideMenuitems) {
				if(sideNavMenu.getText().equals(actualsideMenu)) {
					sideNavMenu.click();
					break;
				}
			}
}
}

