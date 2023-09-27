package com.trainlab;

import com.trainlab.app.App;
import com.trainlab.helpers.Driver;
import com.trainlab.helpers.users.UsersGenerator;
import org.junit.After;
import org.junit.Before;


class A_BaseTest {

    protected App app;
    public UsersGenerator userGenerator;

    @Before
    public void setUp() {

        Driver.initDriver();

        app = new App();
        userGenerator = new UsersGenerator();
    }

    @After
    public void tearDown() {
        Driver.close();
    }
}