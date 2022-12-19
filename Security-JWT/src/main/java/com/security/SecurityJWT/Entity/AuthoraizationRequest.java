package com.security.SecurityJWT.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthoraizationRequest {

    private String userName;
    private String password;
}
