package com.security.SecurityJWT;

import com.security.SecurityJWT.Entity.User;
import com.security.SecurityJWT.Repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SecurityJwtApplication {

	@Autowired
	private UserRepositry userRepositry;


	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101,"nkdebug","nkdebug","nkdebug@gmail.com"),
				new User(102,"rkdebug","rkdebug","rkdebug@gmail.com"),
				new User(103,"pkdebug","pkdebug","pkdebug@gmail.com"),
				new User(104,"ckdebug","ckdebug","ckdebug@gmail.com")
		).collect(Collectors.toList());

		userRepositry.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SecurityJwtApplication.class, args);
	}

}
