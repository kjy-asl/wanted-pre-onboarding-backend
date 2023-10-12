package com.example.preonboarding.service;

import com.example.preonboarding.dto.request.RecruitmentNoticeDeleteRequestDTO;
import com.example.preonboarding.dto.request.RecruitmentNoticeDetailRequestDTO;
import com.example.preonboarding.dto.request.RecruitmentNoticeRegistRequestDTO;
import com.example.preonboarding.dto.request.RecruitmentNoticeUpdateRequestDTO;
import com.example.preonboarding.dto.response.RecruitmentNoticeDetailResponseDTO;
import com.example.preonboarding.dto.response.RecruitmentNoticeResponseDTO;

public interface RecruitmentNoticeService {
    RecruitmentNoticeResponseDTO getNotices();
    RecruitmentNoticeDetailResponseDTO detailNotice(Long companyId, RecruitmentNoticeDetailRequestDTO request);
    void registNotice(Long companyId, RecruitmentNoticeRegistRequestDTO request);
    void updateNotice(Long companyId, RecruitmentNoticeUpdateRequestDTO request);
    void deleteNotice(Long companyId, RecruitmentNoticeDeleteRequestDTO request);
}
