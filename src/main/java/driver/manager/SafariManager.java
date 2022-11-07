package driver.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public final class SafariManager {

    private SafariManager(){}

    public static WebDriver getDriver(){
        WebDriverManager.safaridriver().setup();
        return new SafariDriver();
    }

}
