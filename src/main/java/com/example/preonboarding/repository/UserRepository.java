package com.example.preonboarding.repository;

import com.example.preonboarding.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<User, Long> {
}
