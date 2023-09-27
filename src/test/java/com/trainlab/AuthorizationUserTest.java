package com.trainlab;

import com.codeborne.selenide.WebDriverRunner;
import com.trainlab.api.model.User;
import io.qameta.allure.junit4.DisplayName;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static com.trainlab.api.model.UserClient.completeRegistrationUser;
import static com.trainlab.api.model.UserClient.registrationUser;
import static com.trainlab.api.model.UserType.VALID_USER;
import static com.trainlab.helpers.users.UsersGenerator.getUser;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthorizationUserTest extends A_BaseTest {

    private User user;

    @Test
    @DisplayName("Successful user authorization")
    public void a_succesAuthUserTest() {

        user = getUser(VALID_USER);

        registrationUser(user);
        completeRegistrationUser(user.getEmail());

        app.homePage.open();
        app.homePage.openLoginPage();
        app.loginPage.authenticationUser(user);

        String actualUrl = WebDriverRunner.url();

        assertTrue(actualUrl.contains("profile"));

    }

}
