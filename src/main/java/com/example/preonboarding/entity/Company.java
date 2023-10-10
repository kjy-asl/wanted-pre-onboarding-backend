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

    @Builder
    public Company(String name){
        this.name = name;
    }
}
