package POM.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class secondScreen extends core {

    public secondScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "showResults")
    MobileElement showResultsScreen;

    public String displayResult() {
        return showResultsScreen.getText();
    }

    public String testOneScreen() {
        return showResultsScreen.getText();
    }
}



