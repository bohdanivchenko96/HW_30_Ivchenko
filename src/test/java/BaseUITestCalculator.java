import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class BaseUITestCalculator {
    public AppiumDriver appiumDriver;
    public URL serverAdress;
    public DesiredCapabilities capabilities;
    @BeforeClass
    public void setupConfig() throws Exception {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a API 24");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        serverAdress = new URL("http://0.0.0.0:4723/wd/hub");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1000);
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        appiumDriver = new AppiumDriver(serverAdress, capabilities);
    }
    @AfterClass
    public void teardown(){
        appiumDriver.quit();
    }
}
