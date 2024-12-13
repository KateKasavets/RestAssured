package entities;
import lombok.Data;

@Data
public class ApplStatusResponse {

    private ApplResponse data;

    private String requestId;

    @Data
    public static class ApplResponse {

        private int applicantid;

        private String dateofapplication;

        private String kindofapplication;

        private String channel;

        private String statusofapplication;
    }
}

