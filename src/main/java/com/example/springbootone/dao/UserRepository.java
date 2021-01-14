package com.example.springbootone.dao;

import org.springframework.*;
import org.springframework.data.repository.CrudRepository;

import com.example.springbootone.entities.user;

public interface UserRepository extends CrudRepository<user,Integer> {


}
