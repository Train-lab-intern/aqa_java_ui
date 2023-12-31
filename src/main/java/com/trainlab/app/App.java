package com.trainlab.app;

import com.trainlab.app.pages.HomePage;
import com.trainlab.app.pages.LoginPage;
import com.trainlab.app.pages.ProfilePage;
import com.trainlab.app.pages.RegisterPage;

public class App {

    public HomePage homePage;
    public RegisterPage registerPage;
    public LoginPage loginPage;
    public ProfilePage profilePage;

    public App() {

        homePage = PageBuilder.buildHomePage();
        registerPage = PageBuilder.buildRegisterPage();
        loginPage = PageBuilder.buildLoginPage();
        profilePage = PageBuilder.buildProfilePage();

    }

}