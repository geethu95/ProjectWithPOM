package ProjectWithPOM.ProjectWithPOM;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.ParameterizationPage;
import pages.SideMenuPage;


public class ParameterizationTest extends Base{
	ParameterizationPage ParameterizationPageObj;
	SideMenuPage SideMenuPageObj;
	
	@Test
	@Parameters({ "firstName","lastName","userName","city","state","zip"})
	public void sendKeyData(String firstName,String lastName,String userName,String city,String state,String zip) {
		SideMenuPageObj=new SideMenuPage(driver);
		SideMenuPageObj.sideMenu("Form Submit");
		
		ParameterizationPageObj=new ParameterizationPage(driver);
		ParameterizationPageObj.formSubmit(firstName,lastName,userName,city,state,zip);
	}

}
