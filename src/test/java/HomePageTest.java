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
    public void logoIsDisplayedTest() {

        app.homePage.open();
        assertTrue(app.homePage.logoIsDisplayed());

    }

    @Test
    @DisplayName("Check display aboutUsBtn on HomePage")
    @Description("Expected result: aboutUsBtn is displayed")
    public void aboutUsBtnIsDisplayedTest() {

        app.homePage.open();
        assertTrue(app.homePage.aboutUsBtnIsDisplayed());

    }

    @Test
    @DisplayName("Check aboutUsBtn text")
    @Description("Expected result: aboutUsBtn text is Ok")
    public void aboutUsBtnTextIsOkTest() {

        app.homePage.open();

        String expectedText = "О нас";
        String actualText = app.homePage.getTextAboutUsBtn();

        assertEquals(expectedText, actualText);
    }

}