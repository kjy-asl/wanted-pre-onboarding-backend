package com.example.preonboarding.dto.request;

import jakarta.validation.constraints.NotNull;

public record RecruitmentNoticeDeleteRequestDTO(
        @NotNull
        Long noticeId
) {
}
