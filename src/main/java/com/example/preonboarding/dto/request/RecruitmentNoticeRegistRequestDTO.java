package com.example.preonboarding.dto.request;

import lombok.Builder;

@Builder
public record RecruitmentNoticeRegistRequestDTO(
        Long companyId,
        String recruitmentPosition,
        Long recruitmentCompensation,
        String content,
        String stacks)
{
}
