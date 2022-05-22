package uiTests;

import configInterf.RemoteOrLocalConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PultikTest {
    //Не проходит
    @Test
    void test001(){
        System.setProperty("localOrRemote", "remote");
        RemoteOrLocalConfig config = ConfigFactory.create(RemoteOrLocalConfig.class, System.getProperties());
        assertThat(config.browser()).isEqualTo("CHROME");
        
    }
}
