package com.trainlab.helpers.users;

import com.github.javafaker.Faker;
import com.trainlab.api.model.User;

import java.util.Locale;

public class UsersGenerator {

    private final Faker faker = new Faker(new Locale("en"));
    private User user;

    public User getValidUser() {
        createValidUser();
        return user;
    }

    public User getUserWithInvalidPassword(int minimumLength, int maximumLength) {
        createUserWithInvalidPassword(minimumLength, maximumLength);
        return user;
    }

    private void createValidUser() {
        user = new User();

        user.setUsername(getRandomUserName());
        user.setEmail(getRandomEmailWithLocalPart(user.getUsername()));
        user.setPassword(getRandomValidPassword());
    }

    private void createUserWithInvalidPassword(int minimumLength, int maximumLength) {
        user = new User();

        user.setUsername(getRandomUserName());
        user.setEmail(getRandomEmailWithLocalPart(user.getUsername()));
        user.setPassword(getRandomInvalidPassword(minimumLength, maximumLength));
    }

    private String getRandomUserName() {
        return faker.name().firstName();
    }

    private String getRandomEmailWithLocalPart(String localPart) {
        return faker.internet().emailAddress(localPart).toLowerCase();
    }

    public String getRandomValidPassword() {
        return faker.internet().password(8, 10, false, false, false) + "A0";
    }

    private String getRandomInvalidPassword(int minimumLength, int maximumLength) {
        return faker.internet().password(minimumLength, maximumLength, false, false, false) + "A0";
    }

}