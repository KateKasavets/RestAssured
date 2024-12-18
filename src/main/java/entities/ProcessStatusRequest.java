package entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProcessStatusRequest {
    private int applId;
    private String staffId;
    private String action;
}
