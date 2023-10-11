package com.example.preonboarding.controller;


import com.example.preonboarding.common.ApiResponse;
import com.example.preonboarding.common.Message.ResponseMessage;
import com.example.preonboarding.dto.RecruitmentNoticeRegistRequestDTO;
import com.example.preonboarding.dto.RecruitmentNoticeUpdateRequestDTO;
import com.example.preonboarding.service.RecruitmentNoticeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/regist")
    public ResponseEntity<ApiResponse> registNotice(
            Long companyId,
            @Valid @RequestBody RecruitmentNoticeRegistRequestDTO request)
    {
        recruitmentNoticeService.registNotice(companyId, request);
        return ResponseEntity.ok(ApiResponse.success(ResponseMessage.SUCCESS_REGIST_NOTICE.getMessage()));
    }

    @PatchMapping("/update")
    public ResponseEntity<ApiResponse> updateNotice(
            Long companyId,
            @Valid @RequestBody RecruitmentNoticeUpdateRequestDTO request)
    {
        recruitmentNoticeService.updateNotice(companyId, request);
        return ResponseEntity.ok(ApiResponse.success(ResponseMessage.SUCCESS_REGIST_NOTICE.getMessage()));
    }
}
