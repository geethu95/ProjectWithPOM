package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.AlertAndPopupUtility;

public class JavaScriptAlertsPage {
	WebDriver driver;

	By clickMeButton=By.xpath("//button[@class='btn btn-success']");
	By cancelButton=By.xpath("//button[@class='btn btn-warning']");
	By promptButton=By.xpath("//button[@class='btn btn-danger']");
	
	public JavaScriptAlertsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void simpleAlert() {
		WebElement ClickMe=driver.findElement(clickMeButton);
		AlertAndPopupUtility.acceptandWaitAlert(driver, ClickMe);
	}
	public void confirmAlert() {
		WebElement Cancel=driver.findElement(cancelButton);
		AlertAndPopupUtility.cancelAlert(driver, Cancel);
	}
	
	public void promtAlert() {
		String input="promt sample";
		WebElement Promt=driver.findElement(promptButton);
		AlertAndPopupUtility.sendKeyForAlert(driver, Promt, input);
	}
	
	public void getTextalert() {
		WebElement Cancel=driver.findElement(cancelButton);
		String alertText=AlertAndPopupUtility.getTextOfAlert(driver, Cancel);
	}
}
