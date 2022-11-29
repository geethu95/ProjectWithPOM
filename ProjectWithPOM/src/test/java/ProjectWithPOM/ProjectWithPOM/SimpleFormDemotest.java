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
}
