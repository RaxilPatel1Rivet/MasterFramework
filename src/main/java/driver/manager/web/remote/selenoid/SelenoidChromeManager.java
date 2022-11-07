package driver.manager.web.remote.selenoid;

import config.factory.ConfigFactory;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidChromeManager {

    private SelenoidChromeManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(BrowserType.CHROME));
        capabilities.setCapability("browserVersion", "97.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), capabilities);
    }
}
