package com.example.preonboarding.service;

import com.example.preonboarding.dto.RecruitmentNoticeRegistRequestDTO;
import com.example.preonboarding.dto.RecruitmentNoticeResponseDTO;

public interface RecruitmentNoticeService {
    RecruitmentNoticeResponseDTO getNotices();
    void registNotice(Long companyId, RecruitmentNoticeRegistRequestDTO request);
}
