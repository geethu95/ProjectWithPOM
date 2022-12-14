package ProjectWithPOM.ProjectWithPOM;


import org.testng.annotations.Test;

import pages.SimpleFormDemoPage;

public class SimpleFormDemotest extends Base{
	SimpleFormDemoPage simpleFormDemoPageObj;

	@Test
	public void enterMessageAndVerifySingleInputField() {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifySingleInputField();
	}
	
	@Test
	public void verifyDragAndDrop()   {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifyDragAndDropField();
	}
	
	@Test
	public void verifyMouseHover() {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifyMouseHover();
}
	@Test
	public void dynamicWebTable() {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.dynamicWebTable();
	}
}
