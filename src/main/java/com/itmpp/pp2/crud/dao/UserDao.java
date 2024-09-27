package com.itmpp.pp2.crud.dao;

import com.itmpp.pp2.crud.model.User;

import java.util.List;

public interface UserDao {

   void saveUser(User user);

   void updateUser(User user);

   void removeUserById(long id);

   List<User> getAllUsers();

   void cleanUsersTable();
}
