package POM.tests;

import POM.screens.mainScreen;
import POM.screens.secondScreen;
import org.testng.annotations.Test;

public class landscapeScroll extends baseTest {

    @Test
    public void calculateNumbers() {
        mainScreen main = new mainScreen(driver);
        main.selectNr1Field();
        main.setNumber5();
        main.selectNr2Field();
        main.setNumber6();
        main.generateResults();

        secondScreen second = new secondScreen(driver);
        screenRotateLandscape();
        scroll();

    }
}
