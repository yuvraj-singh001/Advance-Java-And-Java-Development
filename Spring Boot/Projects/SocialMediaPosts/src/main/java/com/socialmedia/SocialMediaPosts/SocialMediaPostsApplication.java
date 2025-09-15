package com.socialmedia.SocialMediaPosts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class SocialMediaPostsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SocialMediaPostsApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

                Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username");
        String userName = sc.next();

        User user = (User)context.getBean("user");
        user.setUserName(userName);

        PostList postList = (PostList) context.getBean("postlist");
        while(true){
        System.out.println("Choose Form below\n1. Create a Post\n2. See all your Post");
        int userSelect = sc.nextInt();

        switch (userSelect) {
            case 1: {
                Post post = (Post) context.getBean("post");
                sc.nextLine();
                String message = sc.nextLine();
                post.setMessage(message);
                postList.setPost(post);
                user.setPostList(postList);
                break;
            }
            case 2: {
                postList.getAllPost().forEach(item -> System.out.println(item.getMessage()));
                break;
            }
        }
        }
	}

}
