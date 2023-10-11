package com.example.preonboarding.service;

import com.example.preonboarding.dto.RecruitmentNoticeRegistRequestDTO;
import com.example.preonboarding.dto.RecruitmentNoticeResponseDTO;
import com.example.preonboarding.dto.RecruitmentNoticeUpdateRequestDTO;

public interface RecruitmentNoticeService {
    RecruitmentNoticeResponseDTO getNotices();
    void registNotice(Long companyId, RecruitmentNoticeRegistRequestDTO request);
    void updateNotice(Long companyId, RecruitmentNoticeUpdateRequestDTO request);
}
