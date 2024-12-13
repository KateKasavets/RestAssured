package entities;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class AdminCreatedResponse {

    private AdminCreatedResp data;
    private String requestId;

    @Data
    public static class AdminCreatedResp {
        @JsonProperty("staffid")
        private int staffId;
    }
}

