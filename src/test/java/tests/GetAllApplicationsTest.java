package tests;

import endpoints.ЗАГСendpoints;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utilsAPI.RestAssuredSpec;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllApplicationsTest {

    @Test
    public void test_1() throws IOException {

        Response response = given()
                .spec(RestAssuredSpec.getRequestSpec())
                .when()
                .get(ЗАГСendpoints.APPLICATIONS);
        response.then()
                .spec(RestAssuredSpec.getResponseSpec())
                .body("data", notNullValue());

        Files.write(Paths.get("response.json"), response.getBody().asString().getBytes());

        System.out.println("Ответ записан в файл response.json");
    }
}
