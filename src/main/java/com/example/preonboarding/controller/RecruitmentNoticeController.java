package com.example.preonboarding.controller;


import com.example.preonboarding.common.ApiResponse;
import com.example.preonboarding.common.Message.ResponseMessage;
import com.example.preonboarding.dto.request.RecruitmentNoticeDeleteRequestDTO;
import com.example.preonboarding.dto.request.RecruitmentNoticeDetailRequestDTO;
import com.example.preonboarding.dto.request.RecruitmentNoticeRegistRequestDTO;
import com.example.preonboarding.dto.request.RecruitmentNoticeUpdateRequestDTO;
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
        return ResponseEntity.ok(ApiResponse.success(ResponseMessage.SUCCESS_UPDATE_NOTICE.getMessage()));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ApiResponse> deleteNotice(
            Long companyId,
            @Valid @RequestBody RecruitmentNoticeDeleteRequestDTO request)
    {
        recruitmentNoticeService.deleteNotice(companyId, request);
        return ResponseEntity.ok(ApiResponse.success(ResponseMessage.SUCCESS_DELETE_NOTICE.getMessage()));
    }

    @GetMapping("/detail")
    public ResponseEntity<ApiResponse> detailNotice(
            Long companyId,
            @Valid @RequestBody RecruitmentNoticeDetailRequestDTO request)
    {
        val response = recruitmentNoticeService.detailNotice(companyId, request);
        return ResponseEntity.ok(ApiResponse.success(ResponseMessage.SUCCESS_DETAIL_MESSAGE.getMessage()));
    }
    )
}
