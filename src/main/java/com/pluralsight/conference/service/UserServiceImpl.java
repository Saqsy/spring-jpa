package com.pluralsight.conference.service;

import com.pluralsight.conference.model.User;
import com.pluralsight.conference.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }

}
