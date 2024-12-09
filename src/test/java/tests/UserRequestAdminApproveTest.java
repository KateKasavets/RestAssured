package tests;

import POJO.AdminRequest;
import POJO.ProcessRequest;
import POJO.UserRequest;
import endpoints.ЗАГСendpoints;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utilsAPI.RestAssuredSpec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UserRequestAdminApproveTest {

    private static String applicationId;
    private static String staffId;

    @Test(priority = 1)
    public void sendUserRequest() {
        UserRequest userRequest = new UserRequest();
        userRequest.setMode("wedding");
        userRequest.setPersonalFirstName("Igor");
        userRequest.setPersonalLastName("Blaskovich");
        userRequest.setPersonalMiddleName("Victorovich");
        userRequest.setPersonalPhoneNumber("375295342312");
        userRequest.setPersonalNumberOfPassport("KH4326295");
        userRequest.setCitizenLastName("Blaskovich");
        userRequest.setCitizenFirstName("Igor");
        userRequest.setCitizenMiddleName("Victorovich");
        userRequest.setCitizenBirthDate("12.12.2020");
        userRequest.setCitizenNumberOfPassport("KH4326295");
        userRequest.setCitizenGender("Male");
        userRequest.setDateOfMarriage("12.12.2020");
        userRequest.setNewLastName("Blaskovich");
        userRequest.setAnotherPersonLastName("Queen");
        userRequest.setAnotherPersonFirstName("Kventelina");
        userRequest.setAnotherPersonMiddleName("Borisovna");
        userRequest.setBirthOfAnotherPerson("12.12.2020");
        userRequest.setAnotherPersonPassport("КН4532355");
        userRequest.setBirthPlace("Москва");
        userRequest.setBirthMother(null);
        userRequest.setBirthFather(null);
        userRequest.setDeathDateOfDeath(null);
        userRequest.setDeathPlaceOfDeath(null);

        Response response1 = given()
                .spec(RestAssuredSpec.getRequestSpec())
                .body(userRequest)
                .when()
                .post(ЗАГСendpoints.UserRequest)
                .then()
                .spec(RestAssuredSpec.getResponseSpec())
                .extract()
                .response();

        applicationId = response1.jsonPath().getString("data.applicationid");

        System.out.println("ApplicationId: " + applicationId);

        assertThat("ApplicationID not  null", applicationId, notNullValue());
    }

    @Test(dependsOnMethods = "sendUserRequest")
    public void getUserRequestStatus() {
        given()
                .spec(RestAssuredSpec.getRequestSpec())
                .pathParam("applicationId", applicationId)
                .when()
                .get(ЗАГСendpoints.AppStatus)
                .then()
                .spec(RestAssuredSpec.getResponseSpec())
                .body("data.statusofapplication", equalTo("under consideration"));
    }

    @Test(priority = 2)
    public void sendAdminRequest() {
        AdminRequest adminRequest = new AdminRequest();
        adminRequest.setDateofbirth("12.31.2000");
        adminRequest.setPersonalFirstName("Justin");
        adminRequest.setPersonalLastName("Biber");
        adminRequest.setPersonalMiddleName("Jackovich");
        adminRequest.setPersonalNumberOfPassport("КН45108998");
        adminRequest.setPersonalPhoneNumber("375333133565");

        Response response2 = given()
                .spec(RestAssuredSpec.getRequestSpec())
                .body(adminRequest)
                .when()
                .post(ЗАГСendpoints.AdminRequest)
                .then()
                .spec(RestAssuredSpec.getResponseSpec())
                .extract()
                .response();

        staffId = response2.jsonPath().getString("data.staffid");

        System.out.println("StaffId: " + staffId);
    }

    @Test(dependsOnMethods = {"sendUserRequest", "sendAdminRequest"})
    public void processRequest() {
        assertThat("ApplicationID not null", applicationId, notNullValue());
        assertThat("StaffID not null", staffId, notNullValue());

        ProcessRequest processRequest = new ProcessRequest();
        processRequest.setApplId(Integer.parseInt(applicationId));
        processRequest.setStaffId(staffId);
        processRequest.setAction("approved");


        given()
                .spec(RestAssuredSpec.getRequestSpec())
                .body(processRequest)
                .when()
                .post(ЗАГСendpoints.ProcessRequest)
                .then()
                .spec(RestAssuredSpec.getResponseSpec())
                .body("data.statusofapplication", equalTo("approved"));
    }
}
