package dev.beejh02.demo.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.beejh02.demo.model.User;

public interface UserRepository extends JpaRepository<User, UUID>{
    
    public Optional<User> findByEmail(String email);
    
}
