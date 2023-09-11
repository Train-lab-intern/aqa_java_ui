package com.trainlab.app.pages;

import com.codeborne.selenide.SelenideElement;
import com.trainlab.helpers.users.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage extends BasePage {

    private static final SelenideElement fieldEmail = $(By.xpath("//input[@name='email']"));
    private static final SelenideElement fieldUserName = $(By.xpath("//input[@name='username']"));
    private static final SelenideElement fieldPassword = $(By.xpath("//input[@name='password']"));
    private static final SelenideElement fieldPasswordConfirm = $(By.xpath("//input[@name='passwordConfirm']"));

    private static final SelenideElement registerButton = $(By.xpath("//button[contains(text(),'Зарегистрироваться')]"));
    private static final SelenideElement notificationsMessage = $(By.xpath("//span[@class='Notifications_message__lsvIn']"));

    private static final SelenideElement registrationErrors = $(By.xpath("//div[@class='Registration_errors__ySskW']"));

    public RegisterPage(String pageUrl) {
        super(pageUrl);
    }

        public void registrationUser(User user) {

        setFieldEmail(user.getEmail());
        setFieldUserName(user.getUsername());
        setFieldPassword(user.getPassword());
        setFieldPasswordConfirm(user.getPassword());

        clickRegisterButton();

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

    public String getTextNotificationMessage() {
        waitNotificationMessage();

        return notificationsMessage.getText();
    }

    private void waitRegistrationErrors() {
        registrationErrors.should(visible);
    }

    public String getTextRegistrationErrors() {
        waitRegistrationErrors();

        return registrationErrors.getText();
    }

}