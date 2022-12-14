package pages;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.WaitUtility;


public class RadioButtonsDemoPage {
	WebDriver driver;
	By maleRadioButton = By.xpath("//label[@for='inlineRadio1']");
	By femaleRadioButton = By.xpath("//label[@for='inlineRadio2']");
	By showSelectedValueButton = By.xpath("//button[@id='button-one']");
	By outputMessage1 = By.id("message-one");
	

	public RadioButtonsDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void radioButtonEnabled() throws IOException {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement ShowSelectedValueButton=driver.findElement(showSelectedValueButton);
		Boolean maleIsEnabled, femaleIsEnabled, maleIsSelected, femaleIsSelected;
		String actualMessage, expectedMessage, url;
		url = driver.getCurrentUrl();
		WaitUtility.waitForurlMatches(driver, url);
		
		maleIsEnabled = driver.findElement(maleRadioButton).isEnabled();
		femaleIsEnabled = driver.findElement(femaleRadioButton).isEnabled();
		WaitUtility.waitForvisibilityOfElementLocated(driver, maleRadioButton);
		
		maleIsSelected = driver.findElement(maleRadioButton).isSelected();
		femaleIsSelected = driver.findElement(femaleRadioButton).isSelected();
		if (maleIsEnabled && femaleIsEnabled) {
			if (!maleIsSelected && !femaleIsSelected) {				
				WaitUtility.waitForElementClickable(driver, ShowSelectedValueButton);
				ShowSelectedValueButton.click();
				
				actualMessage = driver.findElement(outputMessage1).getText();
				expectedMessage = ExcelUtility.demoRadiobutton(0, 0, "\\src\\main\\java\\Resourses\\selectinput.xlsx",
						"Radiobutton");
				Assert.assertEquals(expectedMessage, actualMessage, "Expected and Actual Messages Same");

			}
		}
	}

	public void maleRadiobuttonChecked() throws IOException {
		Boolean maleIsSelected, femaleIsSelected;
		String actualMessage, expectedMessage, title;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		title = driver.getTitle();
		WaitUtility.waitFortitleContains(driver, title);
		WaitUtility.waitForvisibilityOfAllElementsLocatedBy(driver, femaleRadioButton);
		maleIsSelected = driver.findElement(maleRadioButton).isSelected();
		femaleIsSelected = driver.findElement(femaleRadioButton).isSelected();
		if (maleIsSelected == false && femaleIsSelected == false) {
			driver.findElement(maleRadioButton).click();
			driver.findElement(showSelectedValueButton).click();
			actualMessage = driver.findElement(outputMessage1).getText();
			expectedMessage = ExcelUtility.demoRadiobutton(1, 0, "\\src\\main\\java\\Resourses\\selectinput.xlsx",
					"Radiobutton");
			Assert.assertEquals(expectedMessage, actualMessage, "Expected and Actual Messages  equal");
		}
	}

	public void femaleRadiobuttonChecked() throws IOException {
		Boolean maleIsSelected, femaleIsSelected;
		String actualMessage, expectedMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		maleIsSelected = driver.findElement(maleRadioButton).isSelected();
		WaitUtility.waitForelementSelectionStateToBe(driver, femaleRadioButton);
		femaleIsSelected = driver.findElement(femaleRadioButton).isSelected();
		if (!maleIsSelected && !femaleIsSelected) {
			driver.findElement(femaleRadioButton).click();
			driver.findElement(showSelectedValueButton).click();
			actualMessage = driver.findElement(outputMessage1).getText();
			expectedMessage = ExcelUtility.demoRadiobutton(2, 0, "\\src\\main\\java\\Resourses\\selectinput.xlsx",
					"Radiobutton");
			
			//wait.until(ExpectedConditions.textToBe(outputMessage1, expectedMessage));
			
			Assert.assertEquals(expectedMessage, actualMessage, "Expected and Actual Messages  equal");
		}
	}
}
