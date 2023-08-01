import com.trainlab.app.App;
import com.trainlab.helpers.Driver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.Before;


class A_BaseTest {

    protected App app;
    protected Logger logger;

    @Before
    public void setUp() {

        Driver.initDriver();

        app = new App();

        logger = LogManager.getLogger("");
        DOMConfigurator.configure("src/main/resources/log4j.xml");
    }

//    @AfterMethod
//    public void clearCookies() {
//        Driver.clearCookies();
//    }

    @After
    public void tearDown() {
        Driver.close();
    }
}