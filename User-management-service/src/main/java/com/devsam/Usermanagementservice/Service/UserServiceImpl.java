package com.devsam.Usermanagementservice.Service;

import com.devsam.Usermanagementservice.Entity.Role;
import com.devsam.Usermanagementservice.Entity.SignUpDto;
import com.devsam.Usermanagementservice.Entity.User;
import com.devsam.Usermanagementservice.Repository.RoleRepository;
import com.devsam.Usermanagementservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public User registerUser(SignUpDto signUpDto) {
        User user = new User();
        user.setFirstName((signUpDto.getFirstName()));
        user.setLastName(signUpDto.getLastName());
        user.setUserName(signUpDto.getUserName());
        user.setEmail(signUpDto.getEmail());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
        Role roles = roleRepository.findByName("ROLE_ADMIN").get();
        user.setRoles(Collections.singleton(roles));
        return userRepository.save(user);
    }
}
