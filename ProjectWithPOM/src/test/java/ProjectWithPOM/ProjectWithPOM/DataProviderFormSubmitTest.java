package ProjectWithPOM.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.DataProviderFormSubmitPage;
import pages.SideMenuPage;
import utilities.DataProviderUtility;

public class DataProviderFormSubmitTest extends Base{
	

	@Test(dataProvider="formData",dataProviderClass=DataProviderUtility.class)
	public void checkFillAndSubmitFormByDataProvider(String firstName,String lastName,String userName,String city,String state,String zip) throws IOException {
		SideMenuPage SideMenuPageObj = new SideMenuPage(driver);
		SideMenuPageObj.sideMenu("Form Submit");
		DataProviderFormSubmitPage DataProviderFormSubmitPageObj=new DataProviderFormSubmitPage(driver);
		DataProviderFormSubmitPageObj.formSubmit(firstName, lastName,userName, city, state, zip);
}
}
