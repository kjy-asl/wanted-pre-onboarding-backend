package com.example.preonboarding.dto;

import lombok.Builder;

@Builder
public record RecruitmentNoticeUpdateRequestDTO(
        Long noticeId,
        String recruitmentPosition,
        Long recruitmentCompensation,
        String content,
        String stacks)
{
}