package com.trainlab;

import com.trainlab.helpers.users.UsersGenerator;
import io.qameta.allure.junit4.DisplayName;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class RegistrationUserTest extends A_BaseTest {

    private final String buttonChoice;

    private static final String START_BUTTON = "startButton";
    private static final String SIGN_IN_BUTTON = "signInButton";

    public RegistrationUserTest(String buttonChoice) {
        this.buttonChoice = buttonChoice;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {START_BUTTON},
                {SIGN_IN_BUTTON}
        };
    }

    @Test
    @DisplayName("Succes registration user")
    public void a_succesRegisterUserTest() {

        app.homePage.open();
        app.homePage.openRegisterPage(buttonChoice);
        app.registerPage.registrationUser(new UsersGenerator().getValidUser());

        String actualNotificationMessage = app.registerPage.getTextNotificationMessage();
        String expectedNotificationMessage = "На адрес Вашей электронной почты было отправлено письмо.";

        assertTrue(actualNotificationMessage.contains(expectedNotificationMessage));

    }

    @Test
    @DisplayName("Registration user with invalid password")
    public void b_RegisterUserInvalidPasswordTest() {

        app.homePage.open();
        app.homePage.openRegisterPage(buttonChoice);
        app.registerPage.registrationUser(new UsersGenerator().getUserWithInvalidPassword(4, 5));

        String actualNotificationMessage = app.registerPage.getTextRegistrationErrors();
        String expectedNotificationMessage = "Пароль вводится латинскими буквами";

        assertTrue(actualNotificationMessage.contains(expectedNotificationMessage));

    }
 }