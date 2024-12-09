package utilsAPI;

import static endpoints.ЗАГСendpoints.BASEURI;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestAssuredSpec {
    public static RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASEURI)
                .setContentType(ContentType.JSON)
                .setAuth(RestAssured.basic(ConfProperties.getUserName(), ConfProperties.getPassword()))
                .log(LogDetail.METHOD)
                .build();
    }

    public static ResponseSpecification getResponseSpec() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .log(LogDetail.BODY)
                .build();
    }
}
