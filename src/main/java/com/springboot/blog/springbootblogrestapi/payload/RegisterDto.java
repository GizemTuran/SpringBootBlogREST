package com.springboot.blog.springbootblogrestapi.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//TO TRANSFER THE DATA BETWEEN CLIENT AND SERVER
public class RegisterDto {
    private String name;
    private String username;
    private String email;
    private String password;
}
