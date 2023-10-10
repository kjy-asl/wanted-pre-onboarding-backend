package com.example.preonboarding.dto;

import com.example.preonboarding.entity.RecruitmentNotice;
import lombok.Builder;

import java.util.List;

@Builder
public record RecruitmentNoticeResponseDTO(
        List<RecruitmentNoticeResponseVO> noticeList)
{
    public static RecruitmentNoticeResponseDTO of(List<RecruitmentNotice> noticeList){
        return RecruitmentNoticeResponseDTO.builder()
                .noticeList(noticeList.stream().map(RecruitmentNoticeResponseVO::of)
                        .toList()).build();
    }
}

@Builder
record RecruitmentNoticeResponseVO(
        Long id,
        String companyName,
        String country,
        String region,
        String recruitPostion,
        Long recruitmentCompensation,
        String stacks)
{
    public static RecruitmentNoticeResponseVO of (RecruitmentNotice recruitmentNotice){
        return RecruitmentNoticeResponseVO.builder()
                .id(recruitmentNotice.getId())
                .companyName(recruitmentNotice.getCompanyName())
                .region(recruitmentNotice.getRegion())
                .recruitPostion(recruitmentNotice.getRecruitPosition())
                .recruitmentCompensation(recruitmentNotice.getRecruitmentCompensation())
                .stacks(recruitmentNotice.getStacks())
                .build();
    }
}
