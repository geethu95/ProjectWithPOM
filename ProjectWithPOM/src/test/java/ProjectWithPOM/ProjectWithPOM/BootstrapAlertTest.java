package ProjectWithPOM.ProjectWithPOM;

import org.testng.annotations.Test;

import pages.BootstrapAlertPage;
import pages.MainMenuPage;

public class BootstrapAlertTest extends Base {

	MainMenuPage MainMenuPageObj;
	BootstrapAlertPage BootstrapAlertPageObj;
	
	@Test
	public void bootStrap() {
		MainMenuPageObj=new MainMenuPage(driver);
		MainMenuPageObj.mainMenu("ALERTS AND MODALS");
		BootstrapAlertPageObj=new BootstrapAlertPage(driver);
		BootstrapAlertPageObj.bootstrapAlert();
	}
}
