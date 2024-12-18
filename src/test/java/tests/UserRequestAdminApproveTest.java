package tests;

import entities.*;
import endpoints.Endpoints;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilsAPI.RestAssuredSpec;
import static io.restassured.RestAssured.given;

public class UserRequestAdminApproveTest {

    private static String applicationId;
    private static String staffId;

    @Test(priority = 1)
    public void sendUserRequest() {
        UserCreatedRequest userRequest = createUserRequest();

        UserCreatedResponse userResponse = given()
                .spec(RestAssuredSpec.getRequestSpec())
                .body(userRequest)
                .when()
                .post(Endpoints.USER_REQUEST)
                .then()
                .spec(RestAssuredSpec.getResponseSpec())
                .extract()
                .response().as(UserCreatedResponse.class);

        applicationId = String.valueOf(userResponse.getData().getApplicationid());

        System.out.println("ApplicationId: " + applicationId);

        Assert.assertNotNull(applicationId, "ApplicationID not  null");
    }

    @Test(dependsOnMethods = "sendUserRequest")
    public void getUserRequestStatus() {
        ApplStatusResponse applStatusResponse = given()
                .spec(RestAssuredSpec.getRequestSpec())
                .pathParam("applicationId", applicationId)
                .when()
                .get(Endpoints.GET_APPLICATION_STATUS)
                .then()
                .extract()
                .response()
                .as(ApplStatusResponse.class);

        String statusOfApplication = applStatusResponse.getData().getStatusofapplication();

        System.out.println("Status of application: " + statusOfApplication);

        Assert.assertEquals(statusOfApplication, "under consideration", "Status is not as expected.");
    }

    @Test(priority = 2)
    public void sendAdminRequest() {
        AdminCreatedRequest adminRequest = createAdminRequest();

        AdminCreatedResponse responseAdminCr = given()
                .spec(RestAssuredSpec.getRequestSpec())
                .body(adminRequest)
                .when()
                .post(Endpoints.ADMIN_REQUEST)
                .then()
                .spec(RestAssuredSpec.getResponseSpec())
                .extract()
                .response().as(AdminCreatedResponse.class);

        staffId = String.valueOf(responseAdminCr.getData().getStaffId());

        System.out.println("StaffId: " + staffId);
    }

    @Test(dependsOnMethods = {"sendUserRequest", "sendAdminRequest"})
    public void processRequest() {
        Assert.assertNotNull(applicationId, "ApplicationID  not  null");
        Assert.assertNotNull(staffId, "StaffID not null");

        ProcessStatusRequest processRequest = ProcessStatusRequest.builder()
                .applId(Integer.parseInt(applicationId))
                .staffId(staffId)
                .action("approved")
                .build();

        ProcessStatusResponse responseProcess = given()
                .spec(RestAssuredSpec.getRequestSpec())
                .body(processRequest)
                .when()
                .post(Endpoints.PROCESS_REQUEST)
                .then()
                .spec(RestAssuredSpec.getResponseSpec())
                .extract()
                .response().as(ProcessStatusResponse.class);

        Assert.assertEquals(responseProcess.getData().getStatusofapplication(), "approved");
    }

    private UserCreatedRequest createUserRequest() {
        return UserCreatedRequest.builder()
                .mode("wedding")
                .personalFirstName("Igor")
                .personalMiddleName("Victorovich")
                .personalLastName("Blaskovich")
                .personalPhoneNumber("375295342312")
                .personalNumberOfPassport("KH4326295")
                .citizenLastName("Blaskovich")
                .citizenFirstName("Igor")
                .citizenMiddleName("Victorovich")
                .citizenBirthDate("12.12.2020")
                .citizenNumberOfPassport("KH4326295")
                .citizenGender("Male")
                .dateOfMarriage("12.12.2020")
                .newLastName("Blaskovich")
                .anotherPersonLastName("Queen")
                .anotherPersonFirstName("Kventelina")
                .anotherPersonMiddleName("Borisovna")
                .birthOfAnotherPerson("12.12.2020")
                .anotherPersonPassport("КН4532355")
                .birthPlace("Москва")
                .build();
    }

    private AdminCreatedRequest createAdminRequest() {
        return AdminCreatedRequest.builder()
                .dateofbirth("12.31.2000")
                .personalFirstName("Justin")
                .personalLastName("Biber")
                .personalMiddleName("Jackovich")
                .personalNumberOfPassport("КН45108998")
                .personalPhoneNumber("375333133565")
                .build();
    }
}
