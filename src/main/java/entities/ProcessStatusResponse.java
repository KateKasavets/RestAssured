package entities;
import lombok.Data;


@Data
public class ProcessStatusResponse {

    private ResponseProcStatus data;

    private String requestId;

    @Data
    public static class ResponseProcStatus {

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
