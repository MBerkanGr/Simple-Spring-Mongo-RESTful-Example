package com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.repository;

import com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
