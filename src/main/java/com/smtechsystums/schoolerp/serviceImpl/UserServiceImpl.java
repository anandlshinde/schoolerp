package com.smtechsystums.schoolerp.serviceImpl;

import com.smtechsystums.schoolerp.entity.User;
import com.smtechsystums.schoolerp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User signUpUser(User user) {
        return null;
    }

    @Override
    public User updateUserData(User user, Long userId) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(Long userId) {
        return null;
    }

    @Override
    public User activateUser(Long userId) {
        return null;
    }

    @Override
    public User deActivateUser(Long userId) {
        return null;
    }

    @Override
    public User signInUser(User user) {
        return null;
    }

    @Override
    public User signOutUser(User user) {
        return null;
    }
}
