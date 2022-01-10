package kr.irumdev.ratatouille.api.dto;

import kr.irumdev.ratatouille.api.code.ErrorCode;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {
    private ErrorCode errorCode;
    private String errorMessage;
}
