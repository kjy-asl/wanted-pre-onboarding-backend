package com.example.preonboarding.entity;


import com.example.preonboarding.entity.superclass.TimeStamped;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Company extends TimeStamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "region")
    private String region;

    @Builder
    public Company(String name, String country, String region){

        this.name = name;
        this.country = country;
        this.region = region;
    }
}
