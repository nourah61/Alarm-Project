package TestCases;

import org.example.pages.P01_MainPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04_CheckFourth  extends TestBases{
    P01_MainPage mainPage;

    @Test(priority = 4)
    public void CheckFourthCLock() throws InterruptedException  {
        mainPage = new P01_MainPage(driver);

        // step 1 click plusbutton
        mainPage.plusbutton.click();
        // step 2 click twobutton
        mainPage.numbertwo.click();
        // step 3 click fournumber
        mainPage.numberfour.click();
        // step 4 click zerobutton
        mainPage.numberzero.click();
        Thread.sleep(2000);
        // step 5 click zerobutton
        mainPage.numberzero.click();

        Thread.sleep(3000);

        // step 5 click AM button for time
        mainPage.am.click();

        // step 6 click ok button
        mainPage.okbutton.click();
        // WAIT
        Thread.sleep(1000);
        // take screen shot
        PageBases.captureScreenshot(driver,"before 24:00");

        // step 7 click on last ok to finsh
        mainPage.finalok.click();

        // take screen shot
        PageBases.captureScreenshot(driver,"After 24:00");

        //Asert
        Assert.assertEquals("2:40", mainPage.check.getText());


}}
