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

        Response response = given()
                .spec(RestAssuredSpec.getRequestSpec())
                .when()
                .get(Endpoints.GET_APPLICATIONS)
                .then()
                .spec(RestAssuredSpec.getResponseSpec())
                .extract()
                .response();

        ApplicantResponse applicantResponse = response.as(ApplicantResponse.class);

        List<ApplicantResponse.Applicant> applicants = applicantResponse.getData();

    }
}
