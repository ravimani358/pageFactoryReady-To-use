package Test_cases;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.buyInChipsPage;
import pages.menuPage;
import pages.zonePage;
import singleton.Browser;

public class Test_case01 extends Browser{
	
	@Test(enabled = true, priority = 1)
	public static void Test_case01() throws InterruptedException {
		
//		LoginPage loginAction = new LoginPage();
//        loginAction.clickWarningOkayButton();
//        loginAction.clickSettings();
//        loginAction.updateETMField();
//        loginAction.clickTestButton();
//        loginAction.clickSaveButton();
//        loginAction.enterUserID();
//        loginAction.enterPIN();
//        loginAction.clickLoginButton();
//        zonePage zonePageAction = new zonePage();
//        zonePageAction.chooseArea();
//        zonePageAction.clickNextButton();
//        menuPage menuPageAction = new menuPage();
//        menuPageAction.choosePrint();
//        menuPageAction.chooseTable();
//        menuPageAction.chooseBuyChips();
//        buyInChipsPage buyInChipsPageAction = new buyInChipsPage();
//        buyInChipsPageAction.enterNumber();
//        buyInChipsPageAction.goButton();
//        buyInChipsPageAction.successOkButton();
//        buyInChipsPageAction.submitButton();
//        buyInChipsPageAction.confirmButton();
		
			System.out.println("testing");
	}
	
}
