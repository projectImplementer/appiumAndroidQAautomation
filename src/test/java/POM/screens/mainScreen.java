package POM.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class mainScreen extends core {

    //WebDriverWait wait;

    public mainScreen(AndroidDriver driver) {
        super(driver);
        //wait = new WebDriverWait(driver, 60);
    }

    @AndroidFindBy(id = "number1Show")
    MobileElement inputField1;

    @AndroidFindBy(id = "number2Show")
    MobileElement inputField2;

    @AndroidFindBy(id = "Digit0")
    MobileElement number0;

    @AndroidFindBy(id = "Digit1")
    MobileElement number1;

    @AndroidFindBy(id = "Digit2")
    MobileElement number2;

    @AndroidFindBy(id = "Digit3")
    MobileElement number3;

    @AndroidFindBy(id = "Digit4")
    MobileElement number4;

    @AndroidFindBy(id = "Digit5")
    MobileElement number5;

    @AndroidFindBy(id = "Digit6")
    MobileElement number6;

    @AndroidFindBy(id = "Digit7")
    MobileElement number7;

    @AndroidFindBy(id = "Digit8")
    MobileElement number8;

    @AndroidFindBy(id = "Digit9")
    MobileElement number9;

    @AndroidFindBy(id = "dotButton")
    MobileElement dotButton;


    public void selectNr1Field() {
        inputField1.click();
    }

    public void selectNr2Field() {
        inputField2.click();
    }

    public void setNumber0() {
        number0.click();
    }

    public void setNumber1() {
        number1.click();
    }

    public void setNumber2() {
        number2.click();
    }

    public void setNumber3() {
        number3.click();
    }

    public String getValue3() {
        return number3.getText();
    }

    public void setNumber4() {
        number4.click();
    }

    public void setNumber5() {
        number5.click();
    }

    public String getValue5() {
        return number5.getText();
    }


    public void setNumber6() {
        number6.click();
    }

    public void setNumber7() {
        number7.click();
    }

    public void setNumber8() {
        number8.click();
    }

    public void setNumber9() {
        number9.click();
    }

}
