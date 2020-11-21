package com.gokul.springblog.dto;

public class PostDto {
    private long Id;
    private String content;
    private String title;
    private String username;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
