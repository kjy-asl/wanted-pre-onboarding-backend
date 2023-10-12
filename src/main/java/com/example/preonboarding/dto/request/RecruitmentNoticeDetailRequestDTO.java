package com.example.preonboarding.dto.request;

import jakarta.validation.constraints.NotNull;

public record RecruitmentNoticeDetailRequestDTO(
        @NotNull
        Long noticeId
) {
}
