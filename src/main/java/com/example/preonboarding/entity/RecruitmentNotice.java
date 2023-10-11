package com.example.preonboarding.entity;

import com.example.preonboarding.entity.superclass.TimeStamped;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RecruitmentNotice extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @Column(name = "recruit_position")
    private String recruitPosition;

    @Column(name = "recruitment_compensation")
    private Long recruitmentCompensation;

    @Column(name = "stacks")
    private String stacks;

    @Column(name = "content")
    private String content;

    @Builder
    public RecruitmentNotice(
            Company company,
            String recruitPosition,
            Long recruitmentCompensation,
            String stacks,
            String content)
    {
        this.company = company;
        this.recruitPosition = recruitPosition;
        this.recruitmentCompensation = recruitmentCompensation;
        this.stacks = stacks;
        this.content = content;
    }
}
