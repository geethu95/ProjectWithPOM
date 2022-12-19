package ProjectWithPOM.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.SideMenuPage;

public class SideMenuTest extends Base {
	SideMenuPage SideMenuPageObj;
	@Test
	public void sideMenu()  {
		SideMenuPageObj=new SideMenuPage(driver);
		SideMenuPageObj.sideMenu("Form Submit");
		
	}
}
