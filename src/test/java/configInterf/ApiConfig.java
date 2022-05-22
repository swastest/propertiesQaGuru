package configInterf;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:configProperties/api.properties")
public interface ApiConfig extends Config {
    String baseUrl();
    String token();
}
