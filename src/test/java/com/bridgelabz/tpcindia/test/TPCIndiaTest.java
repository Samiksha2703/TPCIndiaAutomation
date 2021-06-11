/**
 * purpose : To perform test to check functionality of different features of TPCIndia Application
 * Author : Samiksha Shende
 * Date : 09/06/21020
 */

package com.bridgelabz.tpcindia.test;

import com.bridgelabz.tpcindia.base.Base;
import com.bridgelabz.tpcindia.pages.Home;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TPCIndiaTest extends Base {
    Home home;
    static ExtentTest test;
    static ExtentReports report;

    //method to run before class to generate extent report
    @BeforeClass
    public static void startTest() {
        report = new ExtentReports("C:\\Users\\kalam\\IdeaProjects\\TPCIndiaAutomationProject\\src\\main\\resources\\ExtentReport\\" + "ExtentReportResults.html");
        test = report.startTest("Bookswagon Extent Report");
    }

    @Test(priority = 1)
    public void whenTryToTrackWithoutNumber_DisplayAlert_ShouldBeHandle() throws InterruptedException {
        home = new Home(webdriver);
        home.displayTrackingDetails(webdriver);
    }

    @Test(priority = 2)
    public void whenClickLoginButton_DisplayAlter_ShouldBeHandled(){
        home = new Home(webdriver);
        home.loginIntoAccount(webdriver);
    }

    @Test(priority = 3)
    public void whenNavigateToBack_DisplayAlter_ShouldBeHandled(){
        home = new Home(webdriver);
        home.navigateToPreviousPage(webdriver);
    }

    //method to run after class to generate extent report
    @AfterClass
    public static void endTest() {
        report.endTest(test);
        report.flush();
    }
}
