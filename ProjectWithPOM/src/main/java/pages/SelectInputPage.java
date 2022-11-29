package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.ExcelUtility;

public class SelectInputPage {
	public ExcelUtility excelUtilityObj;
	public WebDriver driver;
	By selectInputField = By.xpath("//select[@id='single-input-field']");
	By actMessage = By.xpath("//div[@id='message-one']");
	By multipleInputField = By.xpath("//select[@id='multi-select-field']");
	By getFirstSelectedButton = By.xpath("//button[@id='button-first']");
	By getAllSelectedButton = By.xpath("//button[@id='button-all']");
	By multipleActualMessage = By.xpath("//div[@id='message-two']");

	public SelectInputPage(WebDriver driver) {
		this.driver = driver;
	}
	public void verifySelectSingleInputColor() throws IOException {
		//ExcelUtility excelUtilityObj = new ExcelUtility();
		String inputColor, expectedMessage = "Selected Color : ", actualMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select inputSelect = new Select(driver.findElement(selectInputField));
		inputColor = ExcelUtility.ReadStringDataExcel(0, 0, "\\src\\main\\java\\Resourses\\selectinput.xlsx", "inputcolour");
		inputSelect.selectByVisibleText(inputColor);
		actualMessage = driver.findElement(actMessage).getText();
		Assert.assertEquals(expectedMessage + inputColor, actualMessage);
	}
	public void verifySelectMultipleInputColor() throws IOException {
		//ExcelUtility excelUtilityObj = new ExcelUtility();
		String actualMessage, expectedMessage = "All selected colors are : ", color1, color2, color3;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select multipleSelect = new Select(driver.findElement(multipleInputField));
		multipleSelect.isMultiple();
		multipleSelect.selectByVisibleText(ExcelUtility.ReadStringDataExcel(0, 0,"\\src\\main\\java\\Resourses\\selectinput.xlsx", "inputcolour"));
		multipleSelect.selectByVisibleText(ExcelUtility.ReadStringDataExcel(1, 0,"\\src\\main\\java\\Resourses\\selectinput.xlsx","inputcolour"));
		multipleSelect.selectByVisibleText(ExcelUtility.ReadStringDataExcel(2, 0,"\\src\\main\\java\\Resourses\\selectinput.xlsx","inputcolour"));
		driver.findElement(getAllSelectedButton).click();
		actualMessage = driver.findElement(multipleActualMessage).getText();
		List<WebElement> multipleColor = multipleSelect.getOptions();
		color1 = multipleColor.get(0).getText();
		color2 = multipleColor.get(1).getText();
		color3 = multipleColor.get(2).getText();
		Assert.assertEquals(expectedMessage + color3, actualMessage);
	}
}
