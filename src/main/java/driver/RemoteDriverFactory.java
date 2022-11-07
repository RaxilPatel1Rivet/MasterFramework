package driver;

import config.ConfigFactory;
import enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getDriver(){

        BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode();

        if(browserRemoteModeType == BrowserRemoteModeType.BROWSER_STACK){

        } else if (browserRemoteModeType == BrowserRemoteModeType.SELENIUM) {

        } else {

        }

        return null;
    }

}
