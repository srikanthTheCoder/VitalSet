package com.ideas2it.oauth2server.repo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ideas2it.oauth2server.model.User;

public interface UserDetailRepository extends JpaRepository<User,Integer> {


    Optional<User> findByUsername(String name);

}