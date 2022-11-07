package driver.web.remote;

import driver.manager.web.remote.browserstack.*;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackFactory {

    private BrowserStackFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);

    private static final Supplier<WebDriver> CHROME = BrowserStackChromeManager::getDriver;
    private static final Supplier<WebDriver> FIREFOX = BrowserStackFireFoxManager::getDriver;
    private static final Supplier<WebDriver> EDGE = BrowserStackEdgeManager::getDriver;
    private static final Supplier<WebDriver> IE = BrowserStackIEManager::getDriver;
    private static final Supplier<WebDriver> SAFARI = BrowserStackSafariManager::getDriver;

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
