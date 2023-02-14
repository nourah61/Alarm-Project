package TestCases;

import org.example.pages.P01_MainPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_CheckFirst extends TestBases {
    P01_MainPage mainPage;


    @Test(priority = 1)
    public void CheckFirstCLock() throws InterruptedException  {
        mainPage = new P01_MainPage(driver);
        // step 1 click plusbutton
        mainPage.plusbutton.click();

       Thread.sleep(2000);

        // step 2 click number 6
        mainPage.numbersix.click();

        // step 3 click number 1
        mainPage.numberone.click();
        // step 4 click number 5
        mainPage.numbefive.click();
        // step 5 click pm for time
        mainPage.pm.click();
        // step 6 click ok button
        mainPage.okbutton.click();
        // WAIT
        Thread.sleep(1000);
        // take screen shot
        PageBases.captureScreenshot(driver,"before");
        Thread.sleep(3000);

        // step 7 click on last ok
        mainPage.finalok.click();
        // take screen shot
        PageBases.captureScreenshot(driver,"After");

        //Assert if the time successfully
        Assert.assertEquals("6:15", mainPage.check.getText()); //

        Thread.sleep(4000);

    }



}
