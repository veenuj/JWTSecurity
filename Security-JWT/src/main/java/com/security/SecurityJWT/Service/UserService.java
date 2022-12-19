package com.security.SecurityJWT.Service;

import com.security.SecurityJWT.Entity.User;
import com.security.SecurityJWT.Repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserService implements UserDetailsService {


    @Autowired
    private UserRepositry userRepositry;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepositry.findByUserName(username);

        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),new ArrayList<>());
    }
}
