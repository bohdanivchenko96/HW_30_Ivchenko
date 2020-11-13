package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerHomePage {
    AppiumDriver appiumDriver;
    WebDriverWait wait;
    public CustomerHomePage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.wait = new WebDriverWait(appiumDriver, 15);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Log out']")
    WebElement logOutButton;
    @AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc='Guru99 Bank Customer HomePage']")
    WebElement layoutPage;

    public boolean getWelcomeText(String text){
        wait.until(ExpectedConditions.visibilityOf(layoutPage));
        return logOutButton.isDisplayed();

    }

}
