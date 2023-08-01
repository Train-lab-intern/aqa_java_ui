package com.trainlab.app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    public SelenideElement logo = $(By.xpath("//img[@alt='Logo']"));

    public HomePage(String pageUrl) {
        super(pageUrl);
    }

    public boolean logoVisible() {
        return logo.is(exist);
    }
}