package ProjectWithPOM.ProjectWithPOM;

import org.testng.annotations.Test;

import pages.JavaScriptAlertsPage;
import pages.MainMenuPage;
import pages.SideMenuPage;

public class JavaScriptAlertsTest extends Base{

	JavaScriptAlertsPage JavaScriptAlertsPageObj;
	MainMenuPage MainMenuPageObj;
	SideMenuPage SideMenuPageObj;
	
	@Test
	public void alertJavaScript() {
		MainMenuPageObj=new MainMenuPage(driver);
		MainMenuPageObj.mainMenu("ALERTS AND MODALS");
		SideMenuPageObj=new SideMenuPage(driver);
		SideMenuPageObj.sideMenu("Javascript Alert");
		JavaScriptAlertsPageObj=new JavaScriptAlertsPage(driver);
		JavaScriptAlertsPageObj.simpleAlert();
		JavaScriptAlertsPageObj.confirmAlert();
		JavaScriptAlertsPageObj.promtAlert();
		JavaScriptAlertsPageObj.getTextalert();
	}
}
