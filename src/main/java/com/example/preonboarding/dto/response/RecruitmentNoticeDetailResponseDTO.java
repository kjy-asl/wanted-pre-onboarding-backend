package com.example.preonboarding.dto.response;

import com.example.preonboarding.entity.Company;
import com.example.preonboarding.entity.RecruitmentNotice;
import lombok.Builder;

import java.util.List;

@Builder
public record RecruitmentNoticeDetailResponseDTO(
        Long noticeId,
        String companyName,
        String country,
        String region,
        String recruitmentPosition,
        Long recruitmentCompensation,
        String stacks,
        String content,
        List<Long> noticeIds)
{
    public RecruitmentNoticeDetailResponseDTO of(Company company, RecruitmentNotice recruitmentNotice, List<Long> ids){
        return RecruitmentNoticeDetailResponseDTO.builder()
                .noticeId(recruitmentNotice.getId())
                .companyName(company.getName())
                .country(company.getCountry())
                .region(company.getRegion())
                .recruitmentPosition(recruitmentNotice.getRecruitPosition())
                .recruitmentCompensation(recruitmentNotice.getRecruitmentCompensation())
                .stacks(recruitmentNotice.getStacks())
                .content(recruitmentNotice.getContent())
                .noticeIds(ids)
                .build();
    }
}
