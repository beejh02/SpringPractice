package dev.beejh02.demo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.beejh02.demo.model.Post;
import dev.beejh02.demo.service.PostService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/list")
    public List<Post> postList() {
        return postService.postList();
    }

    // @GetMapping("/{postID}")
    // public Post postDetail(@PathVariable String postID) {
    //     return Post.builder()
    //             .postId(UUID.randomUUID())
    //             .title("title1")
    //             .contents("contents1")
    //             .author("")
    //             .createdDateTime(LocalDateTime.now())
    //             .build();
    // }
}