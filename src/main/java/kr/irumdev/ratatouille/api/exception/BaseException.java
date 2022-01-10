package kr.irumdev.ratatouille.api.exception;

import kr.irumdev.ratatouille.api.code.ErrorCode;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private ErrorCode errorCode;
    private String detailMessage;

    public BaseException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.detailMessage = errorCode.getMessage();
    }
}
