package com.trainlab.pages;

import com.codeborne.selenide.SelenideElement;
import com.trainlab.helpers.UserDataGenerator;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RegisterPage extends AbstractPage {

    private static final SelenideElement fieldEmail = $(By.className("email"));
    private static final SelenideElement fieldUserName = $(By.className("username"));
    private static final SelenideElement fieldPassword = $(By.className("password"));
    private static final SelenideElement fieldPasswordConfirm = $(By.className("passwordConfirm"));

    private static final SelenideElement registerButton = $(By.xpath("//button[contains(text(),'Зарегистрироваться')]"));
    private static final SelenideElement notificationsMessage = $(By.xpath("//span[@class='Notifications_message__lsvIn']"));

    public RegisterPage registrationUser(UserDataGenerator userData) {
        setFieldEmail(userData.getEmail());
        setFieldUserName(userData.getUserName());
        setFieldPassword(userData.getPassword());
        setFieldPasswordConfirm(userData.getPassword());
        clickRegisterButton();

        registerPage = page(RegisterPage.class);
        registerPage.waitPage();
        return registerPage;

    }

    private void setFieldEmail(String email) {
        fieldEmail.setValue(email);
    }

    private void setFieldUserName(String userName) {
        fieldUserName.setValue(userName);
    }

    private void setFieldPassword(String password) {
        fieldPassword.setValue(password);
    }

    private void setFieldPasswordConfirm(String passwordConfirm) {
        fieldPasswordConfirm.setValue(passwordConfirm);
    }

    private void clickRegisterButton() {
        registerButton.click();
    }

    private void waitNotificationMessage() {
        notificationsMessage.should(visible);
    }

    private String getTextNotificationMessage() {
        waitNotificationMessage();

        return notificationsMessage.getText();
    }

}