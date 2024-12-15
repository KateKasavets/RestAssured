package entities;

import lombok.Data;
import java.util.List;

public class ApplicantResponse extends BaseResponse <List<ApplicantResponse.ResponseData>> {

    @Data
    public static class ResponseData {

        private int applicationid;
        private int citizenid;
        private int applicantid;
        private int staffid;
        private String dateofapplication;
        private String kindofapplication;
        private String statusofapplication;
        private String channel;
        private String image;
    }
}
