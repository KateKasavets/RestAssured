package entities;

import lombok.Data;

public class ApplStatusResponse extends BaseResponse<ApplStatusResponse.ResponseData> {

    @Data
    public static class ResponseData {

        private int applicantid;
        private String dateofapplication;
        private String kindofapplication;
        private String channel;
        private String statusofapplication;
    }
}
