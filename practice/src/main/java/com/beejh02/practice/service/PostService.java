package com.beejh02.practice.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.beejh02.practice.model.Post;
import com.beejh02.practice.repository.PostRepository;

@Service
public class PostService {
    private final PostRepository postRepository;

    // 생성자를 통한 의존성 주입
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public Post createPost(Post post) {
        post.setCreatedAt(LocalDateTime.now()); // createdAt 설정
        return postRepository.save(post);
    }

    public Post updatePost(Long id, Post postDetails) {
        Post post = postRepository.findById(id).orElse(null);
        if (post != null) {
            post.setTitle(postDetails.getTitle());
            post.setContent(postDetails.getContent());
            post.setAuthor(postDetails.getAuthor());
            return postRepository.save(post);
        }
        return null;
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
