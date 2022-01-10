package kr.irumdev.ratatouille.api.exception;

import kr.irumdev.ratatouille.api.code.ErrorCode;
import kr.irumdev.ratatouille.api.dto.ErrorResponse;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(BaseException.class)
    public ErrorResponse handleRecipeException() {
        return ErrorResponse.builder()
                .errorCode(ErrorCode.NO_RECIPE)
                .errorMessage(ErrorCode.NO_RECIPE.getMessage())
                .build();
    }

    @ExceptionHandler(value = {
            MethodArgumentNotValidException.class,
            MethodArgumentTypeMismatchException.class
    })
    public ErrorResponse handleBadRequest(Exception e, HttpServletRequest request) {
        return ErrorResponse.builder()
                .errorCode(ErrorCode.INVALID_REQUEST)
                .errorMessage(ErrorCode.INVALID_REQUEST.getMessage())
                .build();
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ErrorResponse handleHttpRequestMethodNotSupport() {
        return ErrorResponse.builder()
                .errorCode(ErrorCode.METHOD_NOT_SUPPORT)
                .errorMessage(ErrorCode.METHOD_NOT_SUPPORT.getMessage())
                .build();
    }

    @ExceptionHandler(Exception.class)
    public ErrorResponse handleException(Exception e, HttpServletRequest request) {
        return ErrorResponse.builder()
                .errorCode(ErrorCode.INTERNAL_SERVER_ERROR)
                .errorMessage(ErrorCode.INTERNAL_SERVER_ERROR.getMessage())
                .build();
    }
}
