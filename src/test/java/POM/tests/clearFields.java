package POM.tests;

import POM.screens.mainScreen;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

public class clearFields extends baseTest {

    @Test
    public void clearFields() {
        mainScreen main = new mainScreen(driver);
        main.selectNr1Field();
        main.setNumber2();
        main.selectNr2Field();
        main.setNumber4();
        main.clearNumberFields();;
    }
}
