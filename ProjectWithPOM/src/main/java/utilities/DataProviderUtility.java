package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;


public class DataProviderUtility {
	
	public static void sendKeyValue(WebDriver driver,WebElement element,String input) {
		element.sendKeys(input);
	}
	
	@DataProvider(name="formData")
	public static Object[][] getDataFromFormData(){
		return new Object[][] {
			{"Vidhya","A","vidhya7","Trivandrum","Kerala","985321"}
		};
	}
}
