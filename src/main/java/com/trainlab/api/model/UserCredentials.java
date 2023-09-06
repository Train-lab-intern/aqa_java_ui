package com.trainlab.api.model;

import com.trainlab.helpers.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import static com.trainlab.helpers.users.UserGenerator.getRandomEmail;
import static com.trainlab.helpers.users.UserGenerator.getRandomValidPassword;


@Setter
@Getter
@AllArgsConstructor
public class UserCredentials {

    private String userEmail;
    private String userPassword;

    public static UserCredentials from(User user) {
        return new UserCredentials(user.getEmail(), user.getPassword());
    }

    public static UserCredentials replaceUserEmail(User user) {
        user.setEmail(getRandomEmail());
        return new UserCredentials(user.getEmail(), user.getPassword());
    }

    public static UserCredentials replaceUserPassword(User user) {
        user.setPassword(getRandomValidPassword());
        return new UserCredentials(user.getEmail(), user.getPassword());
    }

}