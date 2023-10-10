package com.example.preonboarding.common.Message;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseMessage {
    SUCCESS_GET_NOTICES("채용 공고 목록 조회를 성공하였습니다.");

    private final String message;
}
