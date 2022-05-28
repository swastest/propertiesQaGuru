package uiTests;

import com.codeborne.selenide.Configuration;
import configInterf.RemoteOrLocalConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBaseForMultitest {
    @BeforeAll
    static void setUp() {
        System.setProperty("localOrRemote", "local");
        RemoteOrLocalConfig config = ConfigFactory
                .create(RemoteOrLocalConfig.class,System.getProperties());
        Configuration.browserSize = config.browserSize();
        Configuration.baseUrl = config.baseUrl();
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();
        Configuration.remote = config.remote();
    }

}
