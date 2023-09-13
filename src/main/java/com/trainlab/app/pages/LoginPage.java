package com.trainlab.app.pages;

import com.codeborne.selenide.SelenideElement;
import com.trainlab.api.model.User;
import com.trainlab.helpers.Driver;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.trainlab.helpers.Driver.waitForUrlContains;

@NoArgsConstructor
public class LoginPage extends BasePage {

    private static final SelenideElement fieldUserEmail = $(By.xpath("//input[@name='userEmail']"));
    private static final SelenideElement fieldUserPassword = $(By.xpath("//input[@name='userPassword']"));

    private static final SelenideElement joinUsButton = $(By.xpath("//a[contains(text(),'Присоединяйся !')]"));
    private static final SelenideElement signInButton = $(By.xpath("//button[contains(text(),'Войти')]"));

    public LoginPage(String pageUrl) {
        super(pageUrl);
    }

    public void authenticationUser(User user) {

        setFieldUserEmail(user.getEmail());
        setFieldUserPassword(user.getPassword());

        clickSignInButton();

        waitForUrlContains("profile");

    }

    private static void clickSignInButton() {
        signInButton.click();
    }

    private void setFieldUserEmail(String email) {
        fieldUserEmail.setValue(email);
    }

    private void setFieldUserPassword(String password) {
        fieldUserPassword.setValue(password);
    }

    public static void openRegisterPage() {
        clickJoinUsButton();
    }

    private static void clickJoinUsButton() {
        joinUsButton.click();
    }

}