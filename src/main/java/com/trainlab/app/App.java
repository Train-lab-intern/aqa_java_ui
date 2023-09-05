package com.trainlab.app;

import com.trainlab.app.pages.BasePage;
import com.trainlab.app.pages.HomePage;
import com.trainlab.app.pages.LoginPage;
import com.trainlab.app.pages.RegisterPage;

public class App {

//    public HomePage homePage;
//    public RegisterPage registerPage;
//    public LoginPage loginPage;

    public BasePage basePage = new BasePage("");

    public App() {
        basePage.homePage = PageBuilder.buildHomePage();
        basePage.registerPage = PageBuilder.buildRegisterPage();
        basePage.loginPage = PageBuilder.buildLoginPage();
    }

}