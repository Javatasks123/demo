package com.example.demo.model;

public class Post {
    private String text;
    private Integer likes;
    public Post(String string){
        this.text = string;
        this.likes = 0;
    }
    public Post(String string,Integer likeCount){
        this.text = string;
        this.likes = likeCount;
    }
    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
}
