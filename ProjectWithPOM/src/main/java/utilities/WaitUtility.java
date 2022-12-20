package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static final long IMPLICIT_WAIT = 20;
	public static final long PAGE_LOAD_WAIT = 20;
	public static final long EXPLICIT_WAIT = 100;
	public static final long FLUENT_WAIT = 50;
	
	
	public enum LocatorType {
		Id, Xpath, CssSelector, Linktext, PartiallinkText, Tagname, Name, ClassName;
	}
	public static void waitForElement(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.visibilityOf(target));
	}
	
	public static void waitForElementClickable(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(target));
}
	
	public static void waitForurlMatches(WebDriver driver, String target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.urlMatches(target));
	}
	
	public static void waitForvisibilityOfElementLocated(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOfElementLocated(target));
}
	
	public static void waitFortitleContains(WebDriver driver, String target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.titleContains(target));
}
	
	public static void waitForvisibilityOfAllElementsLocatedBy(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(target));
}
	public static void waitForelementSelectionStateToBe(WebDriver driver, By target) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementSelectionStateToBe(target,false));
}

	public static void waitForelementToBeClickable(WebDriver driver, By element, String value) {
		WebDriverWait fluentWait = new WebDriverWait(driver, Duration.ofSeconds(FLUENT_WAIT));
		fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitFortextToBe(WebDriver driver, By element,String text) {
		WebDriverWait fluentWait = new WebDriverWait(driver, Duration.ofSeconds(FLUENT_WAIT));
		fluentWait.until(ExpectedConditions.textToBe(element, text));
	}

	public static void waitForAlertPresent(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
