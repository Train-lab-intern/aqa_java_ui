package com.trainlab.app;

import com.trainlab.app.pages.HomePage;
import com.trainlab.app.pages.LoginPage;
import com.trainlab.app.pages.RegisterPage;

public class PageBuilder {

    public static HomePage buildHomePage() {
        return new HomePage("");
    }

    public static RegisterPage buildRegisterPage() {
        return new RegisterPage("");
    }

    public static LoginPage buildLoginPage() {
        return new LoginPage("");
    }

}