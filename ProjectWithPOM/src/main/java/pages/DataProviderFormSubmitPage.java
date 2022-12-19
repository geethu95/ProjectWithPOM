package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DataProviderUtility;
import utilities.PageUtility;

public class DataProviderFormSubmitPage {
	WebDriver driver;
	By firstName = By.xpath("//input[@id='validationCustom01']");
	By lastName = By.xpath("//input[@id='validationCustom02']");
	By userName = By.xpath("//input[@id='validationCustomUsername']");
	By city = By.xpath("//input[@id='validationCustom03']");
	By state = By.xpath("//input[@id='validationCustom04']");
	By zip = By.xpath("//input[@id='validationCustom05']");
	By terms = By.xpath("//input[@id='invalidCheck']");
	By submitbutton = By.xpath("//button[@class='btn btn-primary']");

	public DataProviderFormSubmitPage(WebDriver driver) {
		this.driver = driver;
	}

	public void formSubmit(String firstName, String lastName, String userName, String city, String state, String zip) {
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		DataProviderUtility.sendKeyValue(driver, FirstName, firstName);
		WebElement LastName = driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		DataProviderUtility.sendKeyValue(driver, LastName, lastName);
		WebElement UserName = driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		DataProviderUtility.sendKeyValue(driver, UserName, userName);
		WebElement City = driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		DataProviderUtility.sendKeyValue(driver, City, city);
		WebElement State = driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		DataProviderUtility.sendKeyValue(driver, State, state);
		WebElement Zip = driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		DataProviderUtility.sendKeyValue(driver, Zip, zip);
		WebElement Terms = driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		PageUtility.clickOnElement(Terms);
		WebElement SubmitButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		PageUtility.clickOnElement(SubmitButton);
	}
}
