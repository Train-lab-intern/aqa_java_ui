package com.trainlab.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends AbstractPage {

    private static final SelenideElement signInButton = $(By.xpath("//button[contains(text(),'Войти')]"));

}