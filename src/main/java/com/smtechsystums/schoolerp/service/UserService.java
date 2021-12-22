package com.smtechsystums.schoolerp.service;

import com.smtechsystums.schoolerp.entity.User;

import java.util.List;

public interface UserService {

    User signUpUser(User user);

    User updateUserData(User user, Long userId);

    List<User> getUsers();

    User getUser(Long userId);

    User activateUser(Long userId);

    User deActivateUser(Long userId);

    User signInUser(User user);

    User signOutUser(User user);

}
