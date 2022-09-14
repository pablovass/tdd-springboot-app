package com.pablovass.dao;

import com.pablovass.model.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    boolean update(User user);
    boolean remove(String id);
    List<User> search();
}
