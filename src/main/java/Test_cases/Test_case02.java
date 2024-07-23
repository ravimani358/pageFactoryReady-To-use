package Test_cases;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.colorUpChipsPage;
import pages.menuPage;
import pages.zonePage;
import singleton.Browser;

public class Test_case02 extends Browser{
	
	@Test(enabled = true, priority = 2)
	public void Test_case02() throws InterruptedException {

		LoginPage loginAction = new LoginPage(driver);
        loginAction.clickWarningOkayButton();
        loginAction.clickSettings();
        loginAction.updateETMField();
        loginAction.clickTestButton();
        loginAction.clickSaveButton();
        loginAction.enterUserID();
        loginAction.enterPIN();
        loginAction.clickLoginButton();
        zonePage zonePageAction = new zonePage(driver);
        zonePageAction.chooseArea();
        zonePageAction.clickNextButton();
        menuPage menuPageAction = new menuPage(driver);
        menuPageAction.choosePrint();
        menuPageAction.chooseTable();
        menuPageAction.chooseColorUp();
        colorUpChipsPage colorUpChipsPageAction = new colorUpChipsPage(driver);
        colorUpChipsPageAction.enterAmountField();
        colorUpChipsPageAction.clickSubmitButton();
        colorUpChipsPageAction.clickConfirmButton();
        colorUpChipsPageAction.clickSuccessOkayButton();       
		
	}
}
