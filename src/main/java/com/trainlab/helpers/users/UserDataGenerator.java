package com.trainlab.helpers.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class UserDataGenerator {

    private String email;
    private String userName;
    private String password;

    public UserDataGenerator() {
        this.email = "subbotin12000@gmail.com";
        this.userName = "subbotin12000";
        this.password = "qqqqqqQ1";
    }
}