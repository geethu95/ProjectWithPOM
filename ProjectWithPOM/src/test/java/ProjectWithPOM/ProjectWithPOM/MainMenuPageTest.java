package ProjectWithPOM.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.MainMenuPage;

public class MainMenuPageTest extends Base {
	MainMenuPage MainMenuPageObj;
	@Test
	public void mainMenu() throws IOException {
		MainMenuPageObj=new MainMenuPage(driver);
		MainMenuPageObj.mainMenu("PROGRESS BAR");
		
		
	}
}
