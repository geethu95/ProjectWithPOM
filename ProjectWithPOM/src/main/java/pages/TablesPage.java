package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.ExcelUtility;

public class TablesPage {
	public ExcelUtility excelUtilityObj;
	WebDriver driver;
	By tableRow = By.xpath("//table[@id='dtBasicExample']//child::tbody//tr");
	By tableColumn = By.xpath("//tr[@role='row']//child::th");

	public TablesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void dynamicWebTable() throws IOException {

		List<WebElement> rowCount = driver.findElements(tableRow);
		rowCount.size();
		List<WebElement> columnCount = driver.findElements(tableColumn);
		columnCount.size();

		for (int i = 0; i < columnCount.size(); i++) {
			WebElement name = columnCount.get(i);
			System.out.println(name.getText());
		}

		for (int j = 0; j < rowCount.size(); j++) {
			WebElement row = rowCount.get(j);
			String Output = row.getText();
			System.out.println(Output);
			String input = ExcelUtility.dynamicTableInput(1, 0, "\\src\\main\\java\\Resourses\\selectinput.xlsx",
					"dynamictable");
			if (Output.contains(input)) {
				System.out.println("Dynamic table contains the data " + input);
				break;
			}
		}
	}

}
