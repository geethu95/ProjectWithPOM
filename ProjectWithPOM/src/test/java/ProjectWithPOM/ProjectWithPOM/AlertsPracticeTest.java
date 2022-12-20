package ProjectWithPOM.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AlertsPracticePage;

public class AlertsPracticeTest extends Base {
	AlertsPracticePage AlertsPracticePageObj;
	
	@Test
	public  void alertHandling() throws IOException {
		AlertsPracticePageObj=new AlertsPracticePage(driver);
		AlertsPracticePageObj.alertHandling();
		AlertsPracticePageObj.timealertHandling();
		AlertsPracticePageObj.confirmAlertHandling();
		AlertsPracticePageObj.promtAlertHandling();
	}
}
