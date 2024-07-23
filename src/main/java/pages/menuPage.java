package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import singleton.Browser;

public class menuPage {
	
	WebDriver driver;

	@FindBy(xpath = "(//select[contains(@class,'form-select')])[1]")
	WebElement printer;
	
	@FindBy(xpath = "(//select[contains(@class,'form-select')])[2]")
	WebElement table;
	
	@FindBy(xpath = "//div[text()='BUY IN CHIPS']")
	WebElement buyInChips;
	
	@FindBy(xpath = "//div[contains(text(),'CHIPS TO TICKET')]")
	WebElement colorUpChips;
	
	@FindBy(xpath = "//div[text()='REPRINT']")
	WebElement reprint;
	
    public menuPage(WebDriver driver) {
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public boolean choosePrint() {
		printer.click();
		Select select = new Select(printer);
		select.selectByValue("2: Object");
		return true;
	}
	
	public boolean chooseTable() {
		table.click();
		Select select = new Select(table);
		select.selectByValue("1: TestA1");
		return true;
	}
	
	public boolean chooseBuyChips() {
		buyInChips.click();
		return true;
	}
	
	public boolean chooseColorUp() {
		colorUpChips.click();
		return true;
	}
	
	public boolean chooseReprint() {
		reprint.click();
		return true;
	}
	
}
