package apiTest;

import configInterf.ApiConfig;
import io.restassured.http.ContentType;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTestGit {
    ApiConfig config = ConfigFactory.create(ApiConfig.class);
@Test
    void test00 (){
        given()
                .contentType(ContentType.JSON)
                .when()
                .queryParam(config.token())
                .get(config.baseUrl())
                .then().log().all()
                .statusCode(200);
    }
}
