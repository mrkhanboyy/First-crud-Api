package com.rest.firstRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.firstRest.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
