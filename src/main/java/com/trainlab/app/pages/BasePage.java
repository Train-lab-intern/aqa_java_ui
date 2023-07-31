package com.trainlab.app.pages;

import com.codeborne.selenide.Selenide;
import com.trainlab.app.AppConfig;
import com.trainlab.helpers.Trim;

public abstract class BasePage {

    protected String pageUrl;

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url = Trim.rtrim(AppConfig.BASE_URL, "/") + "/" + Trim.ltrim(pageUrl, "/");
        Selenide.open(url);
    }
}