package driver.web.local;

import driver.manager.web.local.*;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);

    private static final Supplier<WebDriver> CHROME = ChromeManager::getDriver;
    private static final Supplier<WebDriver> FIREFOX = FireFoxManager::getDriver;
    private static final Supplier<WebDriver> EDGE = EdgeManager::getDriver;
    private static final Supplier<WebDriver> IE = IEManager::getDriver;
    private static final Supplier<WebDriver> SAFARI = SafariManager::getDriver;

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
