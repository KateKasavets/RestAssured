package entities;

import lombok.Data;


public class UserCreatedResponse extends BaseResponse<UserCreatedResponse.ResponseData> {

    @Data
    public static class ResponseData {

        private int applicantid;

        private int citizenid;

        private int applicationid;

        private int merrigecertificateid;
    }
}
