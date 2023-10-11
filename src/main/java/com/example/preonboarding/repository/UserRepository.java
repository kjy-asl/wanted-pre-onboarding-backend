package com.example.preonboarding.repository;

import com.example.preonboarding.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
