package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_MainPage {

    public P01_MainPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.better.alarm.debug:id/fab")
    public WebElement plusbutton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='6']")
    public WebElement numbersix;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='1']")
    public WebElement numberone;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")
    public WebElement numbefive;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='PM']")
    public WebElement pm;

    @AndroidFindBy(id = "com.better.alarm.debug:id/set_button")
    public WebElement okbutton;

    @AndroidFindBy(id = "com.better.alarm.debug:id/details_activity_button_save")
    public WebElement finalok;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@index='0'])[2]")
    public WebElement check;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")
    public WebElement numbertwo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.Button[1]")
    public WebElement am;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[3]")
    public WebElement numberthree;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
    public WebElement numberfour;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.Button[2]")
    public WebElement numberzero;










}