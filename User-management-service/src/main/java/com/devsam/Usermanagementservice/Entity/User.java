package com.devsam.Usermanagementservice.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String  password;
}
