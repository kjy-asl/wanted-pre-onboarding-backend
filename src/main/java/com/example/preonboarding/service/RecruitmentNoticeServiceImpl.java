package com.example.preonboarding.service;

import com.example.preonboarding.dto.request.RecruitmentNoticeDeleteRequestDTO;
import com.example.preonboarding.dto.request.RecruitmentNoticeRegistRequestDTO;
import com.example.preonboarding.dto.response.RecruitmentNoticeResponseDTO;
import com.example.preonboarding.dto.request.RecruitmentNoticeUpdateRequestDTO;
import com.example.preonboarding.entity.RecruitmentNotice;
import com.example.preonboarding.repository.CompanyRepository;
import com.example.preonboarding.repository.RecruitmentNoticeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecruitmentNoticeServiceImpl implements RecruitmentNoticeService{
    private final RecruitmentNoticeRepository recruitmentNoticeRepository;
    private final CompanyRepository companyRepository;
    @Override
    public RecruitmentNoticeResponseDTO getNotices(){
        val NoticeList = recruitmentNoticeRepository.findAll();
        return RecruitmentNoticeResponseDTO.of(NoticeList);
    }

    @Override
    @Transactional
    public void registNotice(Long companyId, RecruitmentNoticeRegistRequestDTO request){
        val company = companyRepository.findById(request.companyId())
                .orElseThrow();
        val recruitmentNotice = RecruitmentNotice.builder()
                .company(company)
                .recruitPosition(request.recruitmentPosition())
                .recruitmentCompensation(request.recruitmentCompensation())
                .content(request.content())
                .stacks(request.stacks())
                .build();
        recruitmentNoticeRepository.save(recruitmentNotice);
    }

    @Override
    @Transactional
    public void updateNotice(Long companyId, RecruitmentNoticeUpdateRequestDTO request) {
        val notice = recruitmentNoticeRepository.findById(request.noticeId())
                .orElseThrow();
        notice.setRecruitPosition(request.recruitmentPosition());
        notice.setRecruitmentCompensation(request.recruitmentCompensation());
        notice.setContent(request.content());
        notice.setStacks(request.stacks());
    }

    @Override
    @Transactional
    public void deleteNotice(Long companyId, RecruitmentNoticeDeleteRequestDTO request){
        val notice = recruitmentNoticeRepository.findById(request.noticeId())
                .orElseThrow();
        val company = companyRepository.findById(companyId);

        recruitmentNoticeRepository.delete(notice);
    }
}
