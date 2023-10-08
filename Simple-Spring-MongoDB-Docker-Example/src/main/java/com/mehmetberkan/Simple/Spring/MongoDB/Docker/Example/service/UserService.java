package com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.service;

import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.dto.request.CreateUserRequest;
import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.dto.response.UserResponse;
import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.mapper.UserMapper;
import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.model.User;
import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Boolean addUser(CreateUserRequest request) {
        User user = UserMapper.INSTANCE.toUser(request);
        userRepository.save(user);
        return Boolean.TRUE;
    }

    public List<UserResponse> getAllUser() {
        List<User> userResponseList = userRepository.findAll();
        return UserMapper.INSTANCE.toUserResponseList(userResponseList);
    }
}
