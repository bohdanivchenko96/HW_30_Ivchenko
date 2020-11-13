import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class BaseUITestChrome {
    public AppiumDriver appiumDrivers;
    public URL serverAdresses;
    public DesiredCapabilities capabilitiesForChrome;
    @BeforeClass
    public void setupConfigChrome() throws Exception {
        capabilitiesForChrome = new DesiredCapabilities();
        capabilitiesForChrome.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a API 24");
        capabilitiesForChrome.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilitiesForChrome.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        serverAdresses = new URL("http://0.0.0.0:4723/wd/hub");
        capabilitiesForChrome.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10000);
        capabilitiesForChrome.setCapability("appPackage", "com.android.chrome");
        capabilitiesForChrome.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        appiumDrivers = new AppiumDriver(serverAdresses, capabilitiesForChrome);
    }
    @AfterClass
    public void teardown(){
        appiumDrivers.quit();

    }
}
