package driver.web.remote;

import driver.manager.web.remote.selenoid.*;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SelenoidFactory {

    private SelenoidFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);

    private static final Supplier<WebDriver> CHROME = SelenoidChromeManager::getDriver;
    private static final Supplier<WebDriver> FIREFOX = SelenoidFireFoxManager::getDriver;
    private static final Supplier<WebDriver> EDGE = SelenoidEdgeManager::getDriver;
    private static final Supplier<WebDriver> IE = SelenoidIEManager::getDriver;
    private static final Supplier<WebDriver> SAFARI = SelenoidSafariManager::getDriver;

    static {
        MAP.put(BrowserType.CHROME, CHROME);
        MAP.put(BrowserType.FIREFOX, FIREFOX);
        MAP.put(BrowserType.EDGE, EDGE);
        MAP.put(BrowserType.IE, IE);
        MAP.put(BrowserType.SAFARI, SAFARI);
    }

    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }

}
