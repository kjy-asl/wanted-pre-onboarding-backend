package com.example.preonboarding.common.Message;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseMessage {
    SUCCESS_REGIST_NOTICE("채용 공고 등록을 성공하였습니다."),
    SUCCESS_UPDATE_NOTICE("채용 공고 수정을 성공하였습니다."),
    SUCCESS_DELETE_NOTICE("채용 공고 삭제를 성공하였습니다."),
    SUCCESS_GET_NOTICES("채용 공고 목록 조회를 성공하였습니다."),
    SUCCESS_DETAIL_MESSAGE("채용 공고 상세 화면 조회를 성공하였습니다.");

    private final String message;
}
