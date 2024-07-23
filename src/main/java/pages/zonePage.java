package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import singleton.Browser;


public class zonePage extends Browser{
	
	WebDriver driver;

	@FindBy(xpath = "//div[contains(text(),' Default Area ')]")
	WebElement defaultArea;
	
	@FindBy(xpath = "//button[contains(text(),' NEXT ')]")
	WebElement nextButton;
	
    public zonePage(WebDriver driver) {
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public boolean chooseArea() {
		defaultArea.click();
		return true;
	}
	
	public boolean clickNextButton() {
		nextButton.click();
		return true;
	}
	
}
