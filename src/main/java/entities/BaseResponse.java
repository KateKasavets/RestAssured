package entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class BaseResponse<T> {

    @Getter
    private T data;

    @JsonProperty("requestId")
    private String requestId;

}
