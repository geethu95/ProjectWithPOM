package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstrapAlertPage {
	WebDriver driver;

	By normalSuccessButton = By.xpath("//button[@id='normal-btn-success']");
	By normalWarningButton = By.xpath("//button[@id='normal-btn-warning']");
	By normalDangerButton = By.xpath("//button[@id='normal-btn-danger']");
	By normalInfoButton = By.xpath("//button[@id='normal-btn-info']");
	By successClose = By.xpath("//div[@class='alert alert-success alert-normal-success']//child::button");
	By warningClose = By.xpath("//div[@class='alert alert-warning alert-normal-warning']//child::button");
	By dangerClose = By.xpath("//div[@class='alert alert-danger alert-normal-danger']//child::button");
	By infoClose = By.xpath("//div[@class='alert alert-info alert-normal-info']//child::button"); 

	public BootstrapAlertPage(WebDriver driver) {
		this.driver = driver;
	}

	public void bootstrapAlert() {
		WebElement NormalSuccess = driver.findElement(normalSuccessButton);
		NormalSuccess.click();
		WebElement NormalSuccessClose = driver.findElement(successClose);
		NormalSuccessClose.click();

		WebElement NormalWarning = driver.findElement(normalWarningButton);
		NormalWarning.click();
		WebElement NormalWarningClose = driver.findElement(warningClose);
		NormalWarningClose.click();

		WebElement NormalDanger = driver.findElement(normalDangerButton);
		NormalDanger.click();
		WebElement NormalDangerClose = driver.findElement(dangerClose);
		NormalDangerClose.click();
		
		WebElement NormalInfo=driver.findElement(normalInfoButton);
		NormalInfo.click();
		WebElement InfoClose=driver.findElement(infoClose);
		InfoClose.click();
		
	}
}