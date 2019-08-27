package POM.tests;

import POM.helpers.runServer;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.tools.ant.taskdefs.Touch;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static org.openqa.selenium.ScreenOrientation.LANDSCAPE;

public class baseTest extends runServer {

    public static AndroidDriver driver;

    public baseTest() {}

    public baseTest(AndroidDriver driver) {
        this.driver = driver;
    }

    @AndroidFindBy(id = "showResults")
    MobileElement showResultsScreen;

    public void screenRotateLandscape() {
        driver.rotate(LANDSCAPE);
    }

    public void screenRotatePortrait() {
        driver.rotate(ScreenOrientation.PORTRAIT);
    }

    public void scroll() {
        TouchActions action = new TouchActions(driver);
        action.scroll(showResultsScreen, 10, 100);
    }

    @BeforeTest(alwaysRun = true)
    public void setup() throws Exception {
    runServer.startAppiumServer();
    driver =  runServer.startDriver();
    }


    @AfterTest
    public void afterTest() {
//    driver.closeApp();
//    runServer.stopAppiumServer();
    }
}
