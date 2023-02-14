package TestCases;

import org.example.pages.P01_MainPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_CheckSecond extends TestBases {
    P01_MainPage mainPage;

    @Test(priority = 2)
    public void CheckSecondClock() throws InterruptedException  {
        mainPage = new P01_MainPage(driver);
        // step 1 click plusbutton
        mainPage.plusbutton.click();
        Thread.sleep(2000);
        // step 2 click number 1
        mainPage.numberone.click();
        // step 3 click number 2
        mainPage.numbertwo.click();
        // step 4 click number 1
        mainPage.numberone.click();
        // step 5 click number 5
        mainPage.numbefive.click();
        // step 6 click AM button for time
        mainPage.am.click();

        // step 7 click ok button
        mainPage.okbutton.click();
        // WAIT
        Thread.sleep(1000);
        // take screen shot
        PageBases.captureScreenshot(driver,"before 12");

        // step 7 click on last ok to finish
        mainPage.finalok.click();

        // take screen shot
        PageBases.captureScreenshot(driver,"After 12");

        //Assert if the time successfully
        Assert.assertEquals("12:15", mainPage.check.getText()); //



    }

}
