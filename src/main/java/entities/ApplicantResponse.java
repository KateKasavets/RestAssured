package entities;

import lombok.Data;

import java.util.List;
@Data
public class ApplicantResponse {

    private List<Applicant> data;
    private String requestId;

    @Data
    public static class Applicant {

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
