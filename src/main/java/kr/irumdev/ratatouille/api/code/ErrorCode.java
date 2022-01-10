package kr.irumdev.ratatouille.api.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    INTERNAL_SERVER_ERROR("서버에 오류가 발생했습니다."),
    INVALID_REQUEST("잘못된 요청입니다."),
    METHOD_NOT_SUPPORT("서비스하지 않는 메소드입니다."),

    NO_RECIPE("해당하는 레시피가 없습니다.");

    private final String message;
}
