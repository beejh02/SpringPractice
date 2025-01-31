package dev.beejh02.demo.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import dev.beejh02.demo.model.Post;



public interface PostRepository extends JpaRepository<Post, UUID>{
    
}
