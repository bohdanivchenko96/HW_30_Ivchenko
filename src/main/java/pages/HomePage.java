package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    AppiumDriver appiumDriver;
    WebDriverWait wait;
    public HomePage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.wait = new WebDriverWait(appiumDriver, 15);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
    @AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc='Guru99 Bank Home Page']")
    WebElement homePageLayout;
    @AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc='Guru99 Bank Home Page']/android.view.View[5]/android.view.View[2]/android.widget.EditText")
    WebElement loginField;
    @AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc='Guru99 Bank Home Page']/android.view.View[5]/android.view.View[4]/android.widget.EditText")
    WebElement passwordField;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='LOGIN']")
    WebElement loginButton;


    public void waitHomeLayout(){
        wait.until(ExpectedConditions.visibilityOf(homePageLayout)).isDisplayed();
    }
    public void enterLogin(String loginText){
        loginField.sendKeys(loginText);
    }
    public void enterPassword(String passwordText){
        passwordField.sendKeys(passwordText);
    }
    public void clickOnLoginButton(){
        wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
    }


}
