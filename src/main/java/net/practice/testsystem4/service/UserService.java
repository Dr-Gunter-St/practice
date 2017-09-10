package net.practice.testsystem4.service;

import net.practice.testsystem4.model.User;

public interface UserService  {

    void save(User user);

    User findByUsername(String username);

}
