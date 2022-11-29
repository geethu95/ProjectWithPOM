package ProjectWithPOM.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.RadioButtonsDemoPage;

public class RadioButtonsDemoTest extends Base {
	RadioButtonsDemoPage RadioButtonsDemoPageObj;
	
	@Test
	public void radioButtonNotSelected() throws IOException {
		RadioButtonsDemoPageObj=new RadioButtonsDemoPage(driver);
		RadioButtonsDemoPageObj.radioButtonEnabled();
	}
	@Test
	public void radioButtonMaleSelected() throws IOException {
		RadioButtonsDemoPageObj=new RadioButtonsDemoPage(driver);
		RadioButtonsDemoPageObj.maleRadiobuttonChecked();
	}
	@Test
	public void radioButtonFemaleSelected() throws IOException {
		RadioButtonsDemoPageObj=new RadioButtonsDemoPage(driver);
		RadioButtonsDemoPageObj.femaleRadiobuttonChecked();
	}
}
