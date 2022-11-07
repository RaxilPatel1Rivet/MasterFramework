package driver;

import config.ConfigFactory;
import driver.manager.*;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDriver(){

        WebDriver driver;

        if(isBrowserFireFox()) driver = FireFoxManager.getDriver();
        else if ((isBrowserEDGE())) driver = EdgeManager.getDriver();
        else if ((isBrowserIE())) driver = IEManager.getDriver();
        else if ((isBrowserSAFARI())) driver = SafariManager.getDriver();
        else driver = ChromeManager.getDriver();

        return driver;
    }

    private static boolean isBrowserChrome(){
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }

    private static boolean isBrowserFireFox(){
        return ConfigFactory.getConfig().browser() == BrowserType.FIREFOX;
    }

    private static boolean isBrowserEDGE(){
        return ConfigFactory.getConfig().browser() == BrowserType.EDGE;
    }

    private static boolean isBrowserIE(){
        return ConfigFactory.getConfig().browser() == BrowserType.IE;
    }

    private static boolean isBrowserSAFARI(){
        return ConfigFactory.getConfig().browser() == BrowserType.SAFARI;
    }

}
