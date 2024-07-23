package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import singleton.Browser;

public class LoginPage extends Browser{
	
	WebDriver driver;
	
	@FindBy(xpath = "//button[contains(text(),' OK ')]")
	WebElement warningAlert;
	
	@FindBy(name = "userId")
	WebElement userName;
	
	@FindBy(name = "pin")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='LOGIN']")
	WebElement loginButton;
	
	@FindBy(className = "settings")
	WebElement settings;
	
	@FindBy(xpath = "//input[contains(@placeholder,'https')]")
	WebElement urlField;
	
	@FindBy(xpath = "//button[text()='Test']")
	WebElement testButton;
	
	@FindBy(xpath = "//button[contains(text(),' Save ')]")
	WebElement saveButton;
	
    public LoginPage(WebDriver driver) {
    	//driver = this.driver;
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public boolean clickSettings() {
		wait.until(ExpectedConditions.elementToBeClickable(warningAlert));
		settings.click();
		return true;
	}
	
	public boolean updateETMField() {
		urlField.sendKeys("https://maaappssk03t.everi.com:4500");
		return true;
	}
	
	public boolean clickTestButton() {
		testButton.click();
		return true;
	}
	
	public boolean clickSaveButton() throws InterruptedException {
		Thread.sleep(3000);
		saveButton.click();
		return true;
	}
	
	public boolean clickWarningOkayButton() {
		warningAlert.click();
		return true;
	}
	
	public boolean enterUserID() {
		userName.sendKeys("6970");
		return true;
	}
	
	public boolean enterPIN() {
		password.sendKeys("1234");
		return true;
	}
	
	public boolean clickLoginButton() {
		loginButton.click();
		return true;
	}

}