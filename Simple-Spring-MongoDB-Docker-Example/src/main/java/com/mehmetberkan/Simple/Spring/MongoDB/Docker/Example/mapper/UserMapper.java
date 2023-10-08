package com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.mapper;

import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.dto.request.CreateUserRequest;
import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.dto.response.UserResponse;
import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toUser(CreateUserRequest request);

    UserResponse toUserResponse(User user);

    List<UserResponse> toUserResponseList(List<User> userList);

}
