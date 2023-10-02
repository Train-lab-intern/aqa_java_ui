package com.trainlab.app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    private static final SelenideElement signInButton = $(By.xpath("//button[contains(text(),'Войти')]"));
    private static final SelenideElement startButton = $(By.xpath("//button[contains(text(),'Начать путь')]"));
    private static final SelenideElement logo = $(By.cssSelector("img[alt='Logo']"));
    private static final SelenideElement aboutUsButton = $(By.xpath("//button[contains(text(),'О нас')]"));
    private static final SelenideElement tasksButton = $(By.xpath("//button[contains(text(),'Задания')]"));
    private static final SelenideElement askQuestionButton = $(By.xpath("//button[contains(text(),'Задай нам вопрос')]"));

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

    public Boolean startButtonIsDisplayed() {
        return startButton.isDisplayed();
    }

    public Boolean signInButtonIsDisplayed() {
        return signInButton.isDisplayed();
    }

    public Boolean askQuestionButtonIsDisplayed() {
        return askQuestionButton.isDisplayed();
    }

    public Boolean tasksButtonIsDisplayed() {
        return tasksButton.isDisplayed();
    }

    public Boolean aboutUsButtonIsDisplayed() {
        return aboutUsButton.isDisplayed();
    }

    public Boolean logoIsDisplayed() {
        return logo.isDisplayed();
    }

    private void askQuestionButtonClick() {
        askQuestionButton.click();;
    }

    private void tasksButtonClick() {
        tasksButton.click();
    }

    private void aboutUsButtonClick() {
        aboutUsButton.click();
    }

    private void logoClick() {
        logo.click();
    }

    private void clickStartButton() {
        startButton.click();
    }

    private void clickSignInButton() {
        signInButton.click();
    }

}