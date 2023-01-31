package com.devsam.Usermanagementservice.Entity;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}