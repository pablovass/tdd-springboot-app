package com.pablovass.service;

import com.pablovass.dao.UserRepository;
import com.pablovass.model.User;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean update(User user) {
        return userRepository.update(user);
    }

    @Override
    public boolean remove(String id) {
        return userRepository.remove(id);
    }

    @Override
    public List<User> search() {
        return userRepository.search();
    }
}
