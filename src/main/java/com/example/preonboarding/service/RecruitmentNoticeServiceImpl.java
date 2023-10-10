package com.example.preonboarding.service;

import com.example.preonboarding.repository.RecruitmentNoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecruitmentNoticeServiceImpl implements RecruitmentNoticeService{
    private final RecruitmentNoticeRepository recruitmentNoticeRepository;
}
