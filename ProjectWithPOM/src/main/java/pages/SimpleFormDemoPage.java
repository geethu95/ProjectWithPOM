package pages;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import utilities.WaitUtility;
import utilities.PageUtility;

public class SimpleFormDemoPage {
	WebDriver driver;
	By enterMessageField = By.xpath("//input[@id='single-input-field']");
	By showMessageButton = By.xpath("//button[@id='button-one']");
	By yourMessage = By.xpath("//div[@id='message-one']");
	By dragAndDrop= By.xpath("//a[@href='drag-drop.php' and text()='Drag and Drop']");
	By drag= By.xpath("//span[text()='Draggable n°1']");
	By drop= By.xpath("//div[@id='mydropzone']");
	By droppedItemList= By.xpath("//div[@id='mylist']//child::span");
	By tableRow=By.xpath("//table[@id='dtBasicExample']//child::tbody//tr");
	By tableColumn=By.xpath("//tr[@role='row']//child::th");

	public SimpleFormDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifySingleInputField() {
		String inputMessage = "test", actualMessage;
		String expectedMessage = "Your Message : " + inputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement EnterMessageField=driver.findElement(enterMessageField);
		PageUtility.enterText(EnterMessageField, inputMessage);
		
		//Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				//.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		WaitUtility.waitForelementToBeClickable(driver, showMessageButton, null);

		WebElement ShowMessageButton=driver.findElement(showMessageButton);
		PageUtility.clickOnElement(ShowMessageButton);
		
		WebElement ActualMessage=driver.findElement(yourMessage);
		actualMessage = PageUtility.getElementText(ActualMessage);
		
		WaitUtility.waitFortextToBe(driver, yourMessage, actualMessage);
		Assert.assertEquals(actualMessage, expectedMessage, "Message not same");
	}

	public void verifyDragAndDropField()  {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action= new Actions(driver);
		WebElement fromElement=driver.findElement(drag);
		WebElement toElement=driver.findElement(drop);
		action.dragAndDrop(fromElement, toElement).build().perform();
		WaitUtility.waitForvisibilityOfElementLocated(driver, droppedItemList);
	}
	
	public void verifyMouseHover() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action= new Actions(driver);
		WebElement fromElement=driver.findElement(dragAndDrop);
		action.moveToElement(fromElement).perform();
		//action.click();
		//action.clickAndHold(fromElement).perform();
		//action.doubleClick(fromElement);
		action.contextClick(fromElement).perform();   //right click
	}	
	
	public void dynamicWebTable() {
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> rowCount =driver.findElements(tableRow);
		rowCount.size();
		List<WebElement> columnCount=driver.findElements(tableColumn);
		columnCount.size();	
	}
	

	

}
