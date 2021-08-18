package com.sks.repositoty;

import org.springframework.data.repository.CrudRepository;

import com.sks.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
