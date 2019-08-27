package POM.tests;

import POM.screens.mainScreen;
import POM.screens.secondScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class calculateNumbers extends baseTest {

    @Test
    public void calculateNumbers() {
        mainScreen main = new mainScreen(driver);
        main.selectNr1Field();
        main.setNumber3();
        Assert.assertEquals(main.getValue3(), "3");
        main.selectNr2Field();
        main.setNumber5();
        Assert.assertEquals(main.getValue5(), "5");
        main.generateResults();
    }

}
