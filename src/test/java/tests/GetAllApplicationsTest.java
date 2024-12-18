package tests;
import endpoints.Endpoints;
import entities.ApplicantResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utilsAPI.RestAssuredSpec;
import java.util.List;
import static io.restassured.RestAssured.given;

public class GetAllApplicationsTest {

    @Test
    public void getAllApplicationTest(){

        ApplicantResponse applicantResponse  = given()
                .spec(RestAssuredSpec.getRequestSpec())
                .when()
                .get(Endpoints.GET_APPLICATIONS)
                .then()
                .spec(RestAssuredSpec.getResponseSpec())
                .extract()
                .response().as(ApplicantResponse.class);

        List<ApplicantResponse.ResponseData> applicants = applicantResponse.getData();

    }
}
