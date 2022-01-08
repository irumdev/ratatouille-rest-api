package kr.irumdev.ratatouille.api.exception;

import kr.irumdev.ratatouille.api.dto.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler
    public ErrorResponse handleException(Exception e, HttpServletRequest request) {
        return ErrorResponse.builder()
            .errorCode(ErrorCode.INTERNAL_SERVER_ERROR)
            .errorMessage(ErrorCode.INTERNAL_SERVER_ERROR.getMessage())
            .build();
    }
}
