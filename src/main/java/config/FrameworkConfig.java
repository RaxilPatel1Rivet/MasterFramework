package config;

import config.converters.StringToBrowserTypeConverter;
import config.converters.StringToRemoteModeBrowserTypeConverter;
import config.converters.StringToRunModeBrowserTypeConverter;
import enums.BrowserRemoteModeType;
import enums.BrowserType;
import enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();

}
