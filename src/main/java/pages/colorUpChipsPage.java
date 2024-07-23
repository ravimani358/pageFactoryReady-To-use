package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import singleton.Browser;

public class colorUpChipsPage{
	
	WebDriver driver;

	@FindBy(xpath = "//input[@name = 'Chip amount']")
	WebElement amountField;
	
	@FindBy(xpath = "//button[contains(text(),' SUBMIT ')]")
	WebElement submitButton;
	
	@FindBy(xpath="//button[contains(text(),' CONFIRM ')]")
	WebElement confirmButton;
	
	@FindBy(xpath="//button[contains(text(),' OK ')]")
	WebElement successOkButton;
	 
	public colorUpChipsPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public boolean enterAmountField() {
		amountField.sendKeys("12.00");
		return true;
	}
	
	public boolean clickSubmitButton() {
		submitButton.click();
		return true;
	}
	
	public boolean clickConfirmButton() {
		confirmButton.click();
		return true;
	}
	
	public boolean clickSuccessOkayButton() {
		successOkButton.click();
		return true;
	}
	
}
