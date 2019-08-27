package POM.helpers;

import POM.tests.baseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class runServer {


    public static AndroidDriver driver = null;

    public runServer() {}

    public static AppiumDriverLocalService appiumServer = AppiumDriverLocalService.buildDefaultService();

    public static void startAppiumServer() {
        appiumServer.start();
    }

    public static DesiredCapabilities setDriverCapabilities () {
        System.out.println("Inside initDriver method");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "PIXEL 2 API 28");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9");

        cap.setCapability("appPackage", "designpattern_mvp.calculator");
        cap.setCapability("appActivity", "designpattern_mvp.calculator.main.MainActivity");
        cap.setCapability(CapabilityType.ROTATABLE, true);
        cap.setCapability("noReset", true);
        cap.setCapability("clearSystemFiles", true);
        System.out.println("Cap din metoda DesiredCapabilities() este  " + "\n"+cap);
        return cap;
    }

    public static AndroidDriver startDriver() throws Exception {
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(url, setDriverCapabilities());

        System.out.println("Application Started...");

        return driver;
    }

    public static void stopAppiumServer() {
        appiumServer.stop();
    }
}