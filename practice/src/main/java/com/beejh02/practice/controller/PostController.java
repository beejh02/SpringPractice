package com.beejh02.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.beejh02.practice.model.Post;
import com.beejh02.practice.service.PostService;

@Controller
public class PostController {
    private final PostService postService;

    // 생성자 주입
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "posts";
    }

    @GetMapping("/posts/{id}")
    public String getPostById(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "post";
    }

    @GetMapping("/posts/new")
    public String newPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "new-post";
    }

    @PostMapping("/posts")
    public String createPost(@ModelAttribute Post post) {
        postService.createPost(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/edit/{id}")
    public String editPostForm(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "edit-post";
    }

    @PostMapping("/posts/{id}")
    public String updatePost(@PathVariable Long id, @ModelAttribute Post post) {
        postService.updatePost(id, post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/delete/{id}")
    public String deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return "redirect:/posts";
    }
}
