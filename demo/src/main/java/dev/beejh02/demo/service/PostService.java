package dev.beejh02.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.beejh02.demo.mapper.PostMapper;
import dev.beejh02.demo.model.Post;
import dev.beejh02.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;


    public List<Post> postList() {
        return postRepository.findAll();
        // return postMapper.listPost();
    }
}
