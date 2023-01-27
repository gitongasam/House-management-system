package com.devsam.Usermanagementservice.Entity;

import lombok.Data;

@Data
public class SignUpDto {
    private String firstName;
    private String lastName;

    private String userName;
    private String email;
    private String password;
}