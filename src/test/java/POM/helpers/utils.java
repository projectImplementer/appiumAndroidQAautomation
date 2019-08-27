package POM.helpers;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class utils {

    AppiumDriverLocalService appiumServer = AppiumDriverLocalService.buildDefaultService();

    public void startAppiumServer() {
        this.appiumServer.start();
    }

    public void stopAppiumServer() {
        this.appiumServer.stop();
    }


}
