package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage {
    AppiumDriver appiumDriver;
    WebDriverWait wait;
    public CalculatorPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.wait = new WebDriverWait(appiumDriver, 15);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_2')]")
    WebElement buttonTwo;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'op_add')]")
    WebElement plusButton;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'digit_5')]")
    WebElement fiveButton;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'eq')]")
    WebElement equalButton;
    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    WebElement resultField;
    @AndroidFindBy(accessibility = "multiply")
    WebElement multiplyButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='clear']")
    WebElement clearResultFieldButton;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    WebElement buttonOne;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_0")
    WebElement buttonZero;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_pct")
    WebElement buttonPercent;


    public void clickOnTwoButton(){
        wait.until(ExpectedConditions.visibilityOf(buttonTwo)).click();
    }
    public void clickOnPlusButton(){
        plusButton.click();
    }
    public void clickOnFiveButton(){
        fiveButton.click();
    }
    public void clickOnEqualButton(){
        equalButton.click();
    }
    public String getTextFromResultField(){
        return wait.until(ExpectedConditions.visibilityOf(resultField)).getText();
    }
    public void clearResultField(){
        wait.until(ExpectedConditions.visibilityOf(buttonTwo));
        resultField.clear();
    }
    public void clickOnMultiplyButton(){
        multiplyButton.click();
    }

    public void rotateScreen(){
        appiumDriver.rotate(ScreenOrientation.LANDSCAPE);
        System.out.println("Screen is rotated");
    }
    public void clickOnButtonOne(){
        buttonOne.click();
    }
    public void clickOnButtonZero(){
        buttonZero.click();
    }
    public void clickOnButtonPercent(){
        buttonPercent.click();
    }
}
