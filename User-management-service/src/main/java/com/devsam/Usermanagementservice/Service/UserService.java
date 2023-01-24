package com.devsam.Usermanagementservice.Service;

import com.devsam.Usermanagementservice.Entity.User;
import com.devsam.Usermanagementservice.Model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
