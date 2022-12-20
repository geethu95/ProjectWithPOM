package ProjectWithPOM.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.MainMenuPage;
import pages.ReduceScopeforTablePage;

public class ReduceScopeforTableTest extends Base {
	ReduceScopeforTablePage ReduceScopeforTablePageObj;
	MainMenuPage MainMenuPageObj;
	
	
	@Test
	public void reduceScope() throws IOException {
		MainMenuPageObj=new MainMenuPage(driver);
		MainMenuPageObj.mainMenu("TABLE");
		ReduceScopeforTablePageObj=new ReduceScopeforTablePage(driver);
		ReduceScopeforTablePageObj.tableLocate();
	}
	
}
