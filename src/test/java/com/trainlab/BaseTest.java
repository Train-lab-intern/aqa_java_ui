package com.trainlab;

import com.codeborne.selenide.Selenide;
import com.trainlab.app.pages.HomePage;

import static com.codeborne.selenide.Selenide.page;

public class BaseTest {

    final static String BASE_URL = "https://alpha.it-roast.com/";

    public HomePage open() {
        return Selenide.open(BASE_URL, HomePage.class);
    }


}