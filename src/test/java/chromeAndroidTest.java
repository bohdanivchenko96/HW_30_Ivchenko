import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CustomerHomePage;
import pages.HomePage;

import static org.testng.AssertJUnit.assertTrue;

public class chromeAndroidTest extends BaseUITestChrome{

    @BeforeMethod
    public void goToHomePageGuru(){
        appiumDrivers.get("http://demo.guru99.com/Agile_Project/Agi_V1");
    }
    @Test
    public void goToGuru99(){
        HomePage homePage = new HomePage(appiumDrivers);
        CustomerHomePage customerHomePage = new CustomerHomePage(appiumDrivers);
        System.out.println("Im on guru site");
        homePage.waitHomeLayout();
        homePage.enterLogin("1303");
        homePage.enterPassword("Guru99");
        homePage.clickOnLoginButton();
        assertTrue(customerHomePage.getWelcomeText("Welcome"));
    }
}
