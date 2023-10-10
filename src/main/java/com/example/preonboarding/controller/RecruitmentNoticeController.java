package com.example.preonboarding.controller;


import com.example.preonboarding.common.ApiResponse;
import com.example.preonboarding.common.Message.ResponseMessage;
import com.example.preonboarding.service.RecruitmentNoticeService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recruitment-notice")
public class RecruitmentNoticeController {
    private final RecruitmentNoticeService recruitmentNoticeService;

    @GetMapping("")
    public ResponseEntity<ApiResponse> getNotices(){
        val response = recruitmentNoticeService.getNotices();
        return ResponseEntity.ok(ApiResponse.success(ResponseMessage.SUCCESS_GET_NOTICES.getMessage(), response));
    }

}
