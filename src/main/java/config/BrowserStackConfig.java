package config;

import config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/browser-stack.properties"
})
public interface BrowserStackConfig extends Config {

    @DefaultValue("rax")
    @Key("username")
    String userName();

    @DefaultValue("rax123")
    @Key("key")
    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserstackURL();

}
