package com.example.HosuingAppBackend.Repository;

import com.example.HosuingAppBackend.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
