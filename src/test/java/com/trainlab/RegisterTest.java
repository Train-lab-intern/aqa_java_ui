package com.trainlab;

import com.trainlab.app.pages.BasePage;
import com.trainlab.helpers.users.UserDataGenerator;
import io.qameta.allure.junit4.DisplayName;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterTest extends A_BaseTest {

    @Test
    @DisplayName("Succes registration user")
    public void a_succesRegisterUserTest() {

        String message = app.basePage.homePage
                .clickStartButton()
                .registrationUser(new UserDataGenerator())
                .getTextNotificationMessage();

        System.out.println(message);

    }
 }