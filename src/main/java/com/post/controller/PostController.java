package com.post.controller;

import com.post.model.Post;
import com.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id){
        return postService.getPostById(id);
    }
    @PostMapping
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }
    @DeleteMapping
    public void deletepost(@PathVariable Long id){
        postService.deletePost(id);
    }
}
