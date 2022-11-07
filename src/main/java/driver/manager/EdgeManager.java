package driver.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public final class EdgeManager {

    private EdgeManager(){}

    public static WebDriver getDriver(){
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

}
