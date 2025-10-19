package com.example.blog;

@jakarta.persistence.Entity()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/example/blog/User;", "", "login", "", "firstName", "lastName", "description", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLastName", "setLastName", "getLogin", "setLogin", "blog"})
public class User {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String login;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String firstName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @jakarta.persistence.Id()
    @jakarta.persistence.GeneratedValue()
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long id;
    
    public User(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.Long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLogin() {
        return null;
    }
    
    public void setLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getFirstName() {
        return null;
    }
    
    public void setFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLastName() {
        return null;
    }
    
    public void setLastName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getDescription() {
        return null;
    }
    
    public void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
}