package com.example.blog;

@org.springframework.context.annotation.Configuration()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017\u00a8\u0006\t"}, d2 = {"Lcom/example/blog/BlogConfiguration;", "", "()V", "databaseInitializer", "Lorg/springframework/boot/ApplicationRunner;", "userRepository", "Lcom/example/blog/UserRepository;", "articleRepository", "Lcom/example/blog/ArticleRepository;", "blog"})
public class BlogConfiguration {
    
    public BlogConfiguration() {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.boot.ApplicationRunner databaseInitializer(@org.jetbrains.annotations.NotNull()
    com.example.blog.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.example.blog.ArticleRepository articleRepository) {
        return null;
    }
}