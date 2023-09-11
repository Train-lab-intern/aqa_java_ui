package com.trainlab.app.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@NoArgsConstructor
public class LoginPage extends BasePage {

    public LoginPage(String pageUrl) {
        super(pageUrl);
    }

    private static final SelenideElement joinUsButton = $(By.xpath("//a[contains(text(),'Присоединяйся !')]"));

    public static void openRegisterPage() {
        clickJoinUsButton();
    }

    private static void clickJoinUsButton() {
        joinUsButton.click();
    }

}