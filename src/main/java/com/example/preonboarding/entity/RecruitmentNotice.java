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
    @JoinColumn(name = "company")
    private Company company;

    @Column(name = "title")
    private String title;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "country")
    private String country;

    @Column(name = "region")
    private String region;

    @Column(name = "recruit_position")
    private String recruitPosition;

    @Column(name = "recruitment_compensation")
    private Long;

    @Column(name = "stacks")
    private String stacks;

    @Column(name = "content")
    private String content;

    @Builder
    public RecruitmentNotice(
            String title,
            String companyName,
            String country,
            String region,
            String recruitPosition,
            Long recruitmentCompensation,
            String stacks,
            String content)
    {
        this.title = title;
        this.companyName = companyName;
        this.country = country;
        this.region = region;
        this.recruitPosition = recruitPosition;
        this.recruitmentCompensation = recruitmentCompensation;
        this.stacks = stacks;
        this.content = content;
    }
}
