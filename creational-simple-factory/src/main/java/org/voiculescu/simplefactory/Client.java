package org.voiculescu.simplefactory;

public class Client {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println(post.getClass().getSimpleName());
        Post post1 = PostFactory.createPost("news");
        System.out.println(post1.getClass().getSimpleName());
        Post post2 = PostFactory.createPost("product");
        System.out.println(post2.getClass().getSimpleName());
    }
}
