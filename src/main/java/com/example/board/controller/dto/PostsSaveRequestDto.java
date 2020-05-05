package com.example.board.controller.dto;

import com.example.board.model.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String author;
    private String content;

    @Builder
    public PostsSaveRequestDto(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Post toEntity() {
        return Post.builder().title(title).author(author).content(content).build();
    }

}
