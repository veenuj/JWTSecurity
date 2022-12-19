package com.security.SecurityJWT.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private int id;
    private String userName;
    private String password;
    private String email;

}
