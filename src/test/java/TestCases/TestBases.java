package TestCases;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.restassured.internal.http.Status;
import org.example.capabilities.Capabilities;
import org.example.pages.P01_MainPage;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import javax.swing.plaf.nimbus.State;
import java.io.IOException;

public class TestBases extends Capabilities {
    static AndroidDriver<AndroidElement> driver;

    // extend report
    protected static ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"/AlarmTestReport.html");
    protected static ExtentTest test = report.startTest("Alarm App");

    @BeforeTest
    public void setupDriver() throws IOException {
        // TODO start application with appium
        driver = baseCapabilities("AppName");

      //  PageBase.captureScreenshot(driver, "startApp");// take screenshot for app when start
    }


    @AfterMethod
    public void getresult(ITestResult result){
        if (result.getStatus() == ITestResult.FAILURE)
            test.log(LogStatus.FAIL,result.getName()+" test fail with folowing error "+result.getThrowable());
        else if(result.getStatus() == ITestResult.SUCCESS)
            test.log(LogStatus.PASS,result.getName());

    }

        @AfterClass
    public void TearDown() throws InterruptedException {
        // flush extent report
        report.endTest(test); //end report
        report.flush(); // open the report

        driver.quit();

    }




}
