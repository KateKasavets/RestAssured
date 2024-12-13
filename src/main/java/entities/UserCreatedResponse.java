package entities;

import lombok.Data;

@Data
public class UserCreatedResponse {

    private ResponseData data;
    private String requestId;

    @Data
    public static class ResponseData {

        private int applicantid;

        private int citizenid;

        private int applicationid;

        private int merrigecertificateid;
    }
}
