package config;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver==null){driver = DriverConfig.createDriver(Browsers.CHROMEINCOGNITO);}
        return driver;
    }
    @AfterClass
    public static void End() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
