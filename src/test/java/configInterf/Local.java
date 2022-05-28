package configInterf;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:configProperties/local.properties")
public interface Local extends Config {
    String browserSize();
    String baseUrl();
    String browser();
    String browserVersion();
    String remote();
}
