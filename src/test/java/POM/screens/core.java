package POM.screens;

import POM.helpers.runServer;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class core extends runServer {

    public static AndroidDriver driver;
   // protected WebDriverWait wait;

    public core(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
        //wait = new WebDriverWait(driver, 60);
    }

    @AndroidFindBy(id = "generateResults")
        MobileElement generateResultsButton;

    @AndroidFindBy(id = "digit10")
        MobileElement clearButton;

    public void generateResults() {
        generateResultsButton.click();
    }

    public String displayResult() {
         return generateResultsButton.getText();
    }

    public void clearNumberFields() {
        clearButton.click();
    }

    public void goBack() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
