package com.example.board.repository;

import com.example.board.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    @Query("SELECT p FROM Post p ORDER BY p.id DESC")
    List<Post> findAllDesc();
}
