package com.study.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.jwt.entity.UserEntity;

public interface UserRepository extends JpaRepository <UserEntity, Integer>{
    
    Boolean existsByUsername(String username);

}
