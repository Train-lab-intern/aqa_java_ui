package com.trainlab;

import com.trainlab.helpers.Driver;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HomePageTest extends A_BaseTest {

    @Before
    public void openHomePage() {
        app.homePage.open();
    }

    @Test
    @DisplayName("Logo is displayed")
    public void a_logoIsDisplayedTest() {

        assertTrue(app.homePage.logoIsDisplayed());

    }

    @Test
    @DisplayName("About Us button is displayed")
    public void b_aboutUsButtonIsDisplayedTest() {

        assertTrue(app.homePage.aboutUsButtonIsDisplayed());

    }

    @Test
    @DisplayName("Tasks button is displayed")
    public void c_tasksButtonIsDisplayedTest() {

        assertTrue(app.homePage.tasksButtonIsDisplayed());

    }

    @Test
    @DisplayName("SignIn button is displayed")
    public void d_signInButtonIsDisplayedTest() {

        assertTrue(app.homePage.signInButtonIsDisplayed());

    }

    @Test
    @DisplayName("Start button is displayed")
    public void e_startButtonIsDisplayedTest() {

        assertTrue(app.homePage.startButtonIsDisplayed());

    }

    @Test
    @DisplayName("Ask us a question button is displayed")
    public void f_startButtonIsDisplayedTest() {

        assertTrue(app.homePage.askQuestionButtonIsDisplayed());

    }

    @After
    public void tearDown() {
        Driver.close();
    }

}