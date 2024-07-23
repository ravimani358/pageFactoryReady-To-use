package singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;

public class Browser {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
    	Singleton singletonInstance = Singleton.getInstance();
    	driver = singletonInstance.getDriver();
      //driver.get("https://maaappssk03t.everi.com/#/login");
        driver.get("https://www.google.com/");
    }

    @AfterSuite(alwaysRun = true)
    public void teardownSuite() {
    	Singleton singletonInstance = Singleton.getInstance();
    	singletonInstance.quitDriver();
    }
}