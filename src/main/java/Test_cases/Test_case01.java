package Test_cases;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.buyInChipsPage;
import pages.menuPage;
import pages.zonePage;
import singleton.Browser;

public class Test_case01 extends Browser{
	
	@Test(enabled = true, priority = 1)
	public void Test_case01() throws InterruptedException {
		
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
        menuPageAction.chooseBuyChips();
        buyInChipsPage buyInChipsPageAction = new buyInChipsPage(driver);
        buyInChipsPageAction.enterNumber();
        buyInChipsPageAction.goButton();
        buyInChipsPageAction.successOkButton();
        buyInChipsPageAction.submitButton();
        buyInChipsPageAction.confirmButton();
        Thread.sleep(5000);
        buyInChipsPageAction.redeemedOk();
        buyInChipsPageAction.redeemedAmount();
        
	}
	
}
