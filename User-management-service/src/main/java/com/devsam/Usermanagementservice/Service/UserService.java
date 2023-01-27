package com.devsam.Usermanagementservice.Service;

import com.devsam.Usermanagementservice.Entity.SignUpDto;
import com.devsam.Usermanagementservice.Entity.User;

public interface UserService {
    User registerUser(SignUpDto signUpDto);
}
