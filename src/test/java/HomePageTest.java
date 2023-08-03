import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HomePageTest extends A_BaseTest {

    @Test
    @DisplayName("Check display logo on HomePage")
    @Description("Expected result: Logo is displayed")
    public void a_logoIsDisplayedTest() {

        app.homePage.open();
        assertTrue(app.homePage.logoIsDisplayed());

    }

    @Test
    @DisplayName("Check display aboutUsBtn on HomePage")
    @Description("Expected result: aboutUsBtn is displayed")
    public void b_aboutUsBtnIsDisplayedTest() {

        app.homePage.open();
        assertTrue(app.homePage.aboutUsBtnIsDisplayed());

    }

    @Test
    @DisplayName("Check aboutUsBtn text")
    @Description("Expected result: aboutUsBtn text is Ok")
    public void c_aboutUsBtnTextIsOkTest() {

        app.homePage.open();

        String expectedText = "О нас";
        String actualText = app.homePage.getTextAboutUsBtn();

        assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Check display tasksBtn on HomePage")
    @Description("Expected result: tasksBtn is displayed")
    public void d_tasksBtnIsDisplayedTest() {

        app.homePage.open();
        assertTrue(app.homePage.tasksBtnIsDisplayed());

    }

    @Test
    @DisplayName("Check tasksBtn text")
    @Description("Expected result: tasksBtn text is Ok")
    public void e_tasksBtnTextIsOkTest() {

        app.homePage.open();

        String expectedText = "Задания";
        String actualText = app.homePage.getTextTasksBtn();

        assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Check display signInBtn on HomePage")
    @Description("Expected result: signInBtn is displayed")
    public void f_signInBtnIsDisplayedTest() {

        app.homePage.open();
        assertTrue(app.homePage.signInBtnIsDisplayed());

    }

    @Test
    @DisplayName("Check signInBtn text")
    @Description("Expected result: signInBtn text is Ok")
    public void g_signInBtnTextIsOkTest() {

        app.homePage.open();

        String expectedText = "Войти";
        String actualText = app.homePage.getTextSignInBtn();

        assertEquals(expectedText, actualText);
    }

}