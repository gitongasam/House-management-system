package com.devsam.Usermanagementservice.Service;

import com.devsam.Usermanagementservice.Entity.User;
import com.devsam.Usermanagementservice.Model.UserModel;
import com.devsam.Usermanagementservice.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Override
    public User registerUser(UserModel userModel) {
        User user = new User();
        user.setFirstName((userModel.getFirstName()));
        user.setLastName(userModel.getLastName());
        user.setEmail(userModel.getEmail());
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        return userRepository.save(user);
    }
}
