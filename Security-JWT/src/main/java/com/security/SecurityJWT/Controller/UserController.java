package com.security.SecurityJWT.Controller;

import com.security.SecurityJWT.Entity.AuthoraizationRequest;
import com.security.SecurityJWT.Utitlity.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

        @Autowired
        private JWTUtil jwtUtil;

        @Autowired
        private AuthenticationManager authenticationManager;

        @GetMapping("/")
        public String welcome() {
            return "Welcome Anuj";
        }

        @PostMapping("/authenticate")
        public String generateToken(@RequestBody AuthoraizationRequest authoraizationRequest) throws Exception {

            try{
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(authoraizationRequest.getUserName(),authoraizationRequest.getPassword())
                );

            } catch (Exception e) {
                throw new Exception("invalid username/password");
            }

            return jwtUtil.generateToken(authoraizationRequest.getUserName());
        }

}
