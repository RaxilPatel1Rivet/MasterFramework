package driver;

import config.factory.ConfigFactory;
import driver.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;


public final class Driver {

    private Driver(){}

    public static void initDriver(){

        WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());

        driver.get("https://google.co.in");

    }

    public static void quitDriver(){
//        driver.quit();
    }

}
