package com.trainlab.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomePage extends BasePage {

    private static final SelenideElement signInButton = $(By.xpath("//button[contains(text(),'Войти')]"));
    private static final SelenideElement startButton = $(By.xpath("////button[contains(text(),'Начать путь')]']"));

    private RegisterPage clickStartButton() {
        startButton.click();

        registerPage = page(RegisterPage.class);
        registerPage.waitPage();
        return registerPage;
    }

    public LoginPage clickSignInButton() {
        signInButton.click();

        loginPage = page(LoginPage.class);
        loginPage.waitPage();
        return loginPage;
    }

}