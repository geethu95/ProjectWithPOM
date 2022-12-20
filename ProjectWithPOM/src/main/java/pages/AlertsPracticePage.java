package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.AlertAndPopupUtility;
import utilities.ExcelUtility;

public class AlertsPracticePage {

	WebDriver driver;
	By alertButton = By.xpath("//button[@id='alertButton']");
	By timeAlertButton = By.xpath("//button[@id='timerAlertButton']");
	By confirmAlertButton = By.xpath("//button[@id='confirmButton']");
	By promtAlertButton = By.xpath("//button[@id='promtButton']");
	By accept = By.xpath("//span[@id='confirmResult']");
	By cancel = By.xpath("//span[@id='confirmResult']");
	By promOut=By.xpath("//span[@id='promptResult']");

	public AlertsPracticePage(WebDriver driver) {
		this.driver = driver;
	}

	public void alertHandling() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement AlertButton = driver.findElement(alertButton);
		AlertAndPopupUtility.acceptAlert(driver, AlertButton);
	}

	public void timealertHandling() {
		WebElement TimeAlert = driver.findElement(timeAlertButton);
		AlertAndPopupUtility.acceptandWaitAlert(driver, TimeAlert);
	}

	public void confirmAlertHandling() throws IOException {
		String actualTextforAccept = ExcelUtility.ReadStringDataExcel(1, 0,
				"\\src\\main\\java\\Resourses\\selectinput.xlsx", "alertdata");
		String actualTextforCancel = ExcelUtility.ReadStringDataExcel(2, 0,
				"\\src\\main\\java\\Resourses\\selectinput.xlsx", "alertdata");

		WebElement ConfirmAlert = driver.findElement(confirmAlertButton);
		AlertAndPopupUtility.acceptAlert(driver, ConfirmAlert);
		String expectedTextforAccept = driver.findElement(accept).getText();
		Assert.assertEquals(actualTextforAccept, expectedTextforAccept);
		AlertAndPopupUtility.cancelAlert(driver, ConfirmAlert);
		String expectedTextforCancel = driver.findElement(cancel).getText();
		Assert.assertEquals(actualTextforCancel, expectedTextforCancel);
	}

	public void promtAlertHandling() throws IOException {
		String promtInput = ExcelUtility.ReadStringDataExcel(3, 0, "\\src\\main\\java\\Resourses\\selectinput.xlsx",
				"alertdata");
		
		WebElement PromtAlert = driver.findElement(promtAlertButton);
		AlertAndPopupUtility.sendKeyForAlert(driver, PromtAlert, promtInput);
		String promtOutput = driver.findElement(promOut).getText();
		if(promtOutput.contains(promtInput)) {
			System.out.println("text are same");
		}
		
		
	}
}
