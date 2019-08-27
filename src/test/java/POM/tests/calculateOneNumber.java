package POM.tests;

import POM.screens.mainScreen;
import POM.screens.secondScreen;
import org.testng.Assert;
import org.testng.annotations.Test;


public class calculateOneNumber extends baseTest {

    @Test
    public void calculateNumber() {
        mainScreen main = new mainScreen(driver);
        main.selectNr1Field();
        main.setNumber3();
        Assert.assertEquals(main.getValue3(), "3");
        main.generateResults();
        main.displayResult();
        secondScreen second = new secondScreen(driver);
        Assert.assertEquals(second.testOneScreen(),"One or more fields are empty");
    }
}
