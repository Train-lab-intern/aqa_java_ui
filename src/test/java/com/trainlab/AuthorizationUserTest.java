package com.trainlab;

import com.codeborne.selenide.WebDriverRunner;
import com.trainlab.api.model.User;
import com.trainlab.helpers.users.UsersGenerator;
import io.qameta.allure.junit4.DisplayName;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static com.trainlab.api.model.UserClient.completeRegistrationUser;
import static com.trainlab.api.model.UserClient.registrationUser;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthorizationUserTest extends A_BaseTest {

    @Test
    @DisplayName("Successful user authorization")
    public void a_succesAuthUserTest() {

        User user = new UsersGenerator().getValidUser();

        registrationUser(user);
        completeRegistrationUser(user.getEmail());

        app.homePage.open();
        app.homePage.openLoginPage();
        app.loginPage.authenticationUser(user);

        String actualUrl = WebDriverRunner.url();

        assertTrue(actualUrl.contains("profile"));

    }

}
