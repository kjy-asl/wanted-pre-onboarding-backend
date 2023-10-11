package com.example.preonboarding.dto;

import jakarta.validation.constraints.NotNull;

public record RecruitmentNoticeDeleteRequestDTO(
        @NotNull
        Long noticeId
) {
}
