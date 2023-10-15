package com.springboot.blog.springbootblogrestapi.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
public class CommentDto {

    private long id;
    //name should not be null or empty
    @NotEmpty(message = "Name should not be null or empty")
    private String name;
    //email should not be null or empty
    //email field validation
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;
    //comment body should not be null or empty
    //comment body must be minimum 10 characters
    @NotEmpty(message = "Comment body should not be null or empty")
    @Size(min = 5,message = "Comment body must be minimum 10 characters")
    private String body;

}
