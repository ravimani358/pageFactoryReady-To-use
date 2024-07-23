package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import singleton.Browser;


public class buyInChipsPage extends Browser {
	
	WebDriver driver;
	
	@FindBy(name = "manualBarcode")
	WebElement ticketNumber;
	
	@FindBy(xpath = "//button[contains(text(),' SUBMIT ')]")
	WebElement submitButton;
	
	@FindBy(xpath="//img[@class = 'go-button']")
	WebElement goButton;
	
	@FindBy(xpath="//button[contains(text(),' OK ')]")
	WebElement successOkButton;
	
	@FindBy(xpath="//button[contains(text(),' CONFIRM ')]")
	WebElement confirmButton;
	
	@FindBy(xpath="//button[contains(text(),' OK ')]")
	WebElement redeemOk;
	
	@FindBy(xpath="//button[contains(text(),' OK ')]")
	WebElement redeemAmountOk;
	
    public buyInChipsPage(WebDriver driver) {
    	//driver = this.driver;
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public boolean enterNumber() {
		ticketNumber.sendKeys("881606301022651196");
		return true;
	}
	
	public boolean goButton() {
		goButton.click();
		return true;
	}
	
	public boolean successOkButton() throws InterruptedException {
		Thread.sleep(3000);
		successOkButton.click();
		return true;
	}
	
	public boolean submitButton() {
		submitButton.click();
		return true;
	}
	
	public boolean confirmButton() {
		confirmButton.click();
		return true;
	}
	
	public boolean redeemedOk() throws InterruptedException {
		Thread.sleep(7000);
		redeemOk.click();
		return true;
	}
	
	public boolean redeemedAmount() throws InterruptedException {
		Thread.sleep(2000);
		redeemAmountOk.click();
		return true;
	}

}
