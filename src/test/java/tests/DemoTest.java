package tests;

import config.factory.BrowserStackConfigFactory;
import config.factory.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTest {

//    local, remote(selenium, selenoid, browserstack) : chrome, firefox, edge, IE, safari

    @Test
    public void testLogin(){


        System.out.println(ConfigFactory.getConfig().browser());

        System.out.println(BrowserStackConfigFactory.getConfig().browserstackURL());



    }


}
