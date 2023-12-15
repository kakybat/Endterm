package com.post.service;

import com.post.model.Post;
import com.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id){
        return postRepository.findById(id).orElse(null);
    }
    @Override
    public Post createPost(Post post){
        post.setCreationDate(new Date());
        return postRepository.save(post);
    }

    @Override
    public void deletePost(Long id){
        postRepository.deleteById(id);
    }
}
