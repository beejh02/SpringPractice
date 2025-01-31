package dev.beejh02.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.beejh02.demo.model.Post;
import dev.beejh02.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

    private final PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Post> postList = List.of(
            Post.builder()
                .title("title1")
                .contents("contents1")
                .author("")
                .createdDateTime(LocalDateTime.now())
                .build(),
            Post.builder()
                .title("title2")
                .contents("contents2")
                .author("")
                .createdDateTime(LocalDateTime.now())
                .build(),
            Post.builder()
                .title("title3")
                .contents("contents3")
                .author("")
                .createdDateTime(LocalDateTime.now())
                .build()
        );
        postRepository.saveAll(postList);
    }
}