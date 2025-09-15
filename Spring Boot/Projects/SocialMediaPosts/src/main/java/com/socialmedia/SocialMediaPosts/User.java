package com.socialmedia.SocialMediaPosts;

public interface User {
    void setUserName(String userName);
    String getUserName();

    void setPostList(PostList postList);
    PostList getPostList();
}
