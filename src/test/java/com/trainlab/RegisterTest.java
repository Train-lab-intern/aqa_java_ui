package com.trainlab;

import io.qameta.allure.junit4.DisplayName;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static com.trainlab.api.model.UserType.VALID_USER;
import static com.trainlab.helpers.users.UsersGenerator.getUser;
import static com.trainlab.helpers.users.UsersGenerator.getUserWithInvalidPassword;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterTest extends A_BaseTest {

    @Test
    @DisplayName("Succes registration user")
    public void a_succesRegisterUserTest() {

        app.homePage.open();
        app.homePage.clickStartButton();
        app.registerPage.registrationUser(getUser(VALID_USER));

        String actualNotificationMessage = app.registerPage.getTextNotificationMessage();
        String expectedNotificationMessage = "На адрес Вашей электронной почты было отправлено письмо.";

        assertTrue(actualNotificationMessage.contains(expectedNotificationMessage));

    }

    @Test
    @DisplayName("Registration user with invalid password")
    public void b_RegisterUserInvalidPasswordTest() {

        app.homePage.open();
        app.homePage.clickStartButton();
        app.registerPage.registrationUser(getUserWithInvalidPassword(4,5));

        String actualNotificationMessage = app.registerPage.getTextRegistrationErrors();
        String expectedNotificationMessage = "Пароль вводится латинскими буквами";

        assertTrue(actualNotificationMessage.contains(expectedNotificationMessage));

    }
 }