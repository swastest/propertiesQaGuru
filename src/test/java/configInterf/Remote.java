package configInterf;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:configProperties/remote.properties")
public interface Remote extends Config {
    String browserSize();
    String baseUrl();
    String browser();
    String browserVersion();
    String remote();

}
