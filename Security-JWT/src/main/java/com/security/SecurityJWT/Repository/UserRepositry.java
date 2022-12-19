package com.security.SecurityJWT.Repository;

import com.security.SecurityJWT.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<User,Integer> {

    User findByUserName(String username);
}
