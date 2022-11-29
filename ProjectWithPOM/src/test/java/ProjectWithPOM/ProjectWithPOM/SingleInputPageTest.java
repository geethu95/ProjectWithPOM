package ProjectWithPOM.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.SelectInputPage;

public class SingleInputPageTest extends Base {
	SelectInputPage SelectInputPageObj;

	@Test(enabled=false)
	public void SingleInputColor() throws IOException {
		SelectInputPageObj = new SelectInputPage(driver);
		SelectInputPageObj.verifySelectSingleInputColor();
		
	}
	@Test
	public void MultipleInputColor() throws IOException {
		SelectInputPageObj = new SelectInputPage(driver);
		SelectInputPageObj.verifySelectMultipleInputColor();
	}


}
