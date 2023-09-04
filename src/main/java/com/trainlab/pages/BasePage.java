package com.trainlab.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    protected HomePage homePage;
    protected RegisterPage registerPage;
    protected LoginPage loginPage;

    private static final SelenideElement logo = $(By.xpath("//img[@alt='Logo']"));

    public void waitPage() {
        logo.should(visible);
    }

}