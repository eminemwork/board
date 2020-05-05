package com.example.board.controller;

import com.example.board.controller.dto.PostListResponseDto;
import com.example.board.controller.dto.PostsSaveRequestDto;
import com.example.board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;

    @PostMapping("/post")
    public Long addPost(@RequestBody PostsSaveRequestDto requestDto) {
        return postService.save(requestDto);
    }

    @GetMapping("/post")
    public List<PostListResponseDto> getAllPosts(Model model) {
        return postService.findAllDesc();
    }
}
