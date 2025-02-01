package com.beejh02.practice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.beejh02.practice.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
    
}
