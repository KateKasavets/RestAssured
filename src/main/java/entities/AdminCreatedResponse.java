package entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


public class AdminCreatedResponse extends BaseResponse<AdminCreatedResponse.ResponseData> {
    @Data
    public static class ResponseData {

        @JsonProperty("staffid")
        private int staffId;
    }
}





