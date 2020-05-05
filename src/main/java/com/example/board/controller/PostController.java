package com.example.board.controller;

import com.example.board.model.Post;
import com.example.board.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/post")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @PostMapping
    public @ResponseBody String addPost(@RequestParam String title, @RequestParam String author, @RequestParam String content) {
        System.out.println(title + " " + author + " " + content);
        Post p = new Post();
        p.setTitle(title);
        p.setAuthor(author);
        p.setContent(content);
        postRepository.save(p);
        return "Saved";
    }

    @GetMapping
    public @ResponseBody Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
