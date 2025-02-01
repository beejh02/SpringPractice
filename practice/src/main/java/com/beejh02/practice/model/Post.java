package com.beejh02.practice.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Post {
    @Id
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdAt;

    // 기본 생성자
    public Post() {}

    // 모든 필드를 받는 생성자 (필요하면 사용)
    public Post(Long id, String title, String content, String author, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
    }

    // Getter & Setter 추가
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
