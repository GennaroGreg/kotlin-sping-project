package com.example.blog;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/article"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u0012\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/blog/ArticleController;", "", "repository", "Lcom/example/blog/ArticleRepository;", "(Lcom/example/blog/ArticleRepository;)V", "findAll", "", "Lcom/example/blog/Article;", "findOne", "slug", "", "blog"})
public class ArticleController {
    @org.jetbrains.annotations.NotNull()
    private final com.example.blog.ArticleRepository repository = null;
    
    public ArticleController(@org.jetbrains.annotations.NotNull()
    com.example.blog.ArticleRepository repository) {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/"})
    @org.jetbrains.annotations.NotNull()
    public java.lang.Iterable<com.example.blog.Article> findAll() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{slug}"})
    @org.jetbrains.annotations.NotNull()
    public com.example.blog.Article findOne(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.lang.String slug) {
        return null;
    }
}