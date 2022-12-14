package ProjectWithPOM.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.MainMenuPage;
import pages.SimpleFormDemoPage;
import pages.TablesPage;

public class TablesTest extends Base {
	TablesPage TablesPageObj;
	MainMenuPage MainMenuPageObj;
	@Test
	public void dynamicWebTable() throws IOException {	
		MainMenuPageObj=new MainMenuPage(driver);
		MainMenuPageObj.mainMenu("TABLE");
		TablesPageObj = new TablesPage(driver);
		TablesPageObj.dynamicWebTable();
	}
	
	
}
