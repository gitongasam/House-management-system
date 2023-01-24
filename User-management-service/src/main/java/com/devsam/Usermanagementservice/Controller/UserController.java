package com.devsam.Usermanagementservice.Controller;

import com.devsam.Usermanagementservice.Entity.User;
import com.devsam.Usermanagementservice.Model.UserModel;
import com.devsam.Usermanagementservice.Service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;
    @PostMapping("/register")
      public User registerUser(@RequestBody UserModel userModel){
        return userService.registerUser(userModel);

      }
}
