package com.trainlab;

import com.trainlab.helpers.UserDataGenerator;
import org.junit.Test;

public class ExampleTest extends BaseTest {

    @Test
    public void test() {

        open();
        String message = open()
                .clickStartButton()
                .registrationUser(new UserDataGenerator())
                .getTextNotificationMessage();

        System.out.println(message);

    }
 }