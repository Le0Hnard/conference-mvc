package com.demo.conferencemvc.service;

import com.demo.conferencemvc.model.User;
import com.demo.conferencemvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

}
