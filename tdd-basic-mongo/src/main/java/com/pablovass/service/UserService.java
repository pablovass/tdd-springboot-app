package com.pablovass.service;

import com.pablovass.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    boolean update(User user);
    boolean remove(String id);
    List<User> search();
}
