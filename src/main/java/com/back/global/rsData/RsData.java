package com.back.global.rsData;

import com.back.standard.resultType.ResultType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RsData<T> implements ResultType {
    private final String resultCode; //200-1 성공 등(200은 http 상태코드, -1은 케이스별 회사규칙)
    private final String msg;
    private final T data;

    public RsData(String resultCode, String msg) {
        this(resultCode, msg, null);
    }
}