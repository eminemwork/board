package com.example.board.controller;

import com.example.board.controller.dto.PostsSaveRequestDto;
import com.example.board.model.Post;
import com.example.board.repository.PostRepository;
import com.example.board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;

    @PostMapping("/post")
    public Long addPost(@RequestBody PostsSaveRequestDto requestDto) {
        return postService.save(requestDto);
    }

//    @GetMapping("/post")
//    public @ResponseBody Iterable<Post> getAllPosts() {
//        return postRepository.findAll();
//    }
}
