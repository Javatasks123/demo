package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private List<Post> posts;
    public PostService(){
        Post post1 = new Post("post1",12);
        Post post2 = new Post("post2");
        Post post3 = new Post("post3");
        this.posts = List.of(post1, post2, post3);
    }
    public List<Post> listAllPosts(){
        return posts;
    }
}
