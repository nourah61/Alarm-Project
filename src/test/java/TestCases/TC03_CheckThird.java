package TestCases;

import org.example.pages.P01_MainPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_CheckThird extends TestBases{
    P01_MainPage mainPage;

    @Test(priority = 3)
    public void CheckThirdCLock() throws InterruptedException  {
        mainPage = new P01_MainPage(driver);

        // step 1 click plusbutton
        mainPage.plusbutton.click();

        // step 2 click number 1
        mainPage.numberone.click();

        // step 3 click number 1
        mainPage.numberone.click();
        // step 4 click number 5
        mainPage.numbefive.click();
        Thread.sleep(3000);

        // step 5 click AM button for time
        mainPage.am.click();

        // step 6 click ok button
        mainPage.okbutton.click();
        // WAIT
        Thread.sleep(1000);
        // take screen shot
        PageBases.captureScreenshot(driver,"before 13");

        // step 7 click on last ok to finsh
         mainPage.finalok.click();

        // take screen shot
        PageBases.captureScreenshot(driver,"After 13");

        //Assert if the time successfully
        Assert.assertEquals("1:15", mainPage.check.getText()); //




    }}
