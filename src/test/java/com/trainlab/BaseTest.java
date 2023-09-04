package com.trainlab;

import com.codeborne.selenide.Selenide;

public class BaseTest {

    final String BASE_URL = "https://alpha.it-roast.com/";

    public void open() {
        Selenide.open(BASE_URL);
    }


}