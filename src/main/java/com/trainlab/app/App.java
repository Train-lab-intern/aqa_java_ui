package com.trainlab.app;

import com.trainlab.app.pages.HomePage;

public class App {

    public HomePage homePage;

    public App() {
        homePage = PageBuilder.buildHomePage();
    }
}