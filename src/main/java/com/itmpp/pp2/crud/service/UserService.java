package com.itmpp.pp2.crud.service;

import com.itmpp.pp2.crud.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
