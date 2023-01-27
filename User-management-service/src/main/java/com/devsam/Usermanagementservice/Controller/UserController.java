package com.devsam.Usermanagementservice.Controller;

import com.devsam.Usermanagementservice.Entity.LoginDto;
import com.devsam.Usermanagementservice.Entity.Role;
import com.devsam.Usermanagementservice.Entity.SignUpDto;
import com.devsam.Usermanagementservice.Entity.User;
import com.devsam.Usermanagementservice.Repository.RoleRepository;
import com.devsam.Usermanagementservice.Repository.UserRepository;
import com.devsam.Usermanagementservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping("/register")
      public User registerUser(@RequestBody SignUpDto signUpDto){
        User user = new User();
        user.setFirstName((signUpDto.getFirstName()));
        user.setLastName(signUpDto.getLastName());
        user.setUserName(signUpDto.getUserName());
        user.setEmail(signUpDto.getEmail());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));

        return userRepository.save(user);

      }
    @PostMapping("/signin")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getUsernameOrEmail(), loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
    }

}
