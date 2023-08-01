import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExampleTest extends A_BaseTest {

    @Test
    public void logoPresentTest() {

        app.homePage.open();
        assertTrue(app.homePage.logoVisible());
    }

}