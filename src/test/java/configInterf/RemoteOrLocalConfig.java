package configInterf;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:configProperties/${localOrRemote}.properties")
public interface RemoteOrLocalConfig extends Config {
    String browserSize();
    String baseUrl();
    String browser();
    String browserVersion();
    String remote();

}
