package com.devsam.Usermanagementservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserModel {
    private String firstName;
    private String lastName;
    private String email;
    private String  password;
}
