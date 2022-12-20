package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ExcelUtility;

public class ReduceScopeforTablePage {
	public ExcelUtility excelUtilityObj;
	WebDriver driver;
	By table=By.xpath("//table[@id='dtBasicExample']");
	By tableRow = By.xpath("//table[@id='dtBasicExample']//child::tbody//tr");
	By tableColumn = By.xpath("//tr[@role='row']//child::th");
	
	public ReduceScopeforTablePage(WebDriver driver) {
		this.driver = driver;
	}

public void tableLocate() throws IOException {
	WebElement Table=driver.findElement(table);
	List<WebElement> row=Table.findElements(tableRow);
	row.size();
	List<WebElement> column=Table.findElements(tableColumn);
	column.size();
	
	for (int i = 0; i < column.size(); i++) {
		WebElement name = column.get(i);
		System.out.println(name.getText());
	}

	for (int j = 0; j < row.size(); j++) {
		WebElement Row = row.get(j);
		String Output = Row.getText();
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
