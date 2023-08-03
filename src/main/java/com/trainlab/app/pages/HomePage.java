package com.trainlab.app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    public SelenideElement logo = $(By.xpath("//img[@alt='Logo']"));
    public SelenideElement aboutUsBtn = $(By.xpath("//button[contains(text(),'О нас')]"));
    public SelenideElement tasksBtn = $(By.xpath("//button[contains(text(),'Задания')]"));
    public SelenideElement signInBtn = $(By.xpath("//button[contains(text(),'Войти')]"));
    public SelenideElement startBtn = $(By.xpath("//button[contains(text(),'Начать путь')]"));


    public HomePage(String pageUrl) {
        super(pageUrl);
    }

    public boolean logoIsDisplayed() {
        return logo.isDisplayed();
    }

    public boolean aboutUsBtnIsDisplayed() {
        return aboutUsBtn.isDisplayed();
    }

    public String getTextAboutUsBtn() {
        return aboutUsBtn.getText();
    }

    public boolean tasksBtnIsDisplayed() {
        return tasksBtn.isDisplayed();
    }

    public String getTextTasksBtn() {
        return tasksBtn.getText();
    }

    public boolean signInBtnIsDisplayed() {
        return signInBtn.isDisplayed();
    }

    public String getTextSignInBtn() {
        return signInBtn.getText();
    }
}