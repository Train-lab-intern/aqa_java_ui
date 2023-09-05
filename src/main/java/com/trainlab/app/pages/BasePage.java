package com.trainlab.app.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.trainlab.app.AppConfig;
import com.trainlab.helpers.Trim;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

//    protected HomePage homePage;
//    protected RegisterPage registerPage;
//    protected LoginPage loginPage;

    private static final SelenideElement logo = $(By.xpath("//img[@alt='Logo']"));

    protected String pageUrl;

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url = Trim.rtrim(AppConfig.BASE_URL, "/") + "/" + Trim.ltrim(pageUrl, "/");
        Selenide.open(url);
    }

    public void waitPage() {
        logo.should(visible);
    }

}