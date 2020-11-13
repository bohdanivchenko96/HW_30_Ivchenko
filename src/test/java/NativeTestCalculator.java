import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CalculatorPage;
import static org.testng.AssertJUnit.assertEquals;

public class NativeTestCalculator extends BaseUITestCalculator{
    @Test(priority = 1)
    public void calculatorSumTest(){
        CalculatorPage calculatorPage = new CalculatorPage(appiumDriver);
        calculatorPage.clickOnTwoButton();
        calculatorPage.clickOnPlusButton();
        calculatorPage.clickOnFiveButton();
        calculatorPage.clickOnEqualButton();
        assertEquals("7", calculatorPage.getTextFromResultField());
    }
    @Test(priority = 2)
    public void calculatorMultiplyTest(){
        CalculatorPage calculatorPage = new CalculatorPage(appiumDriver);
        calculatorPage.clearResultField();
        calculatorPage.clickOnTwoButton();
        calculatorPage.clickOnMultiplyButton();
        calculatorPage.clickOnFiveButton();
        calculatorPage.clickOnEqualButton();
        assertEquals("10", calculatorPage.getTextFromResultField());
    }

    @Test(priority = 3)
    public void calculatorPercentageOfNumbers(){
        CalculatorPage calculatorPage = new CalculatorPage(appiumDriver);
        //calculatorPage.clearResultField();
        calculatorPage.rotateScreen();
        calculatorPage.clickOnButtonOne();
        calculatorPage.clickOnButtonZero();
        calculatorPage.clickOnButtonZero();
        calculatorPage.clickOnButtonPercent();
        calculatorPage.clickOnButtonOne();
        calculatorPage.clickOnButtonZero();
        calculatorPage.clickOnEqualButton();
        assertEquals("10", calculatorPage.getTextFromResultField());

    }
}
