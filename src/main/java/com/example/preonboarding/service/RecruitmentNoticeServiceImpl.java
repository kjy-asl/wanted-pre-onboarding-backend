package com.example.preonboarding.service;

import com.example.preonboarding.dto.RecruitmentNoticeRegistRequestDTO;
import com.example.preonboarding.dto.RecruitmentNoticeResponseDTO;
import com.example.preonboarding.entity.RecruitmentNotice;
import com.example.preonboarding.repository.RecruitmentNoticeRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecruitmentNoticeServiceImpl implements RecruitmentNoticeService{
    private final RecruitmentNoticeRepository recruitmentNoticeRepository;

    @Override
    public RecruitmentNoticeResponseDTO getNotices(){
        val NoticeList = recruitmentNoticeRepository.findAll();
        return RecruitmentNoticeResponseDTO.of(NoticeList);
    }

    @Override
    public void registNotice(Long companyId, RecruitmentNoticeRegistRequestDTO request){
        val recruitmentNotice = RecruitmentNotice.builder()
                .
    }
}
