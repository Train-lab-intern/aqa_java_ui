package com.trainlab.app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    private static final SelenideElement signInButton = $(By.xpath("//button[contains(text(),'Войти')]"));
    private static final SelenideElement startButton = $(By.xpath("//button[contains(text(),'Начать путь')]"));

    public HomePage(String pageUrl) {
        super(pageUrl);
    }

    public void openRegisterPage(String nameButton) {
        if (nameButton.equals("startButton")) {
            clickStartButton();
        } else if (nameButton.equals("signInButton")) {
            openLoginPage();
            LoginPage.openRegisterPage();
        }
    }

    public void openLoginPage() {
        clickSignInButton();
    }

    private void clickStartButton() {
        startButton.click();
    }

    private void clickSignInButton() {
        signInButton.click();
    }

}