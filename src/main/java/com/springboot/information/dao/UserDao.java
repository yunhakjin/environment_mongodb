package com.springboot.information.dao;

import com.springboot.information.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface UserDao extends MongoRepository<User,Integer> {
}
