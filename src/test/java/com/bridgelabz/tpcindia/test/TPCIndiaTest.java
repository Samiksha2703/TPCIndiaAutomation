/**
 * purpose : To perform test to check functionality of different features of TPCIndia Application
 * Author : Samiksha Shende
 * Date : 09/06/21020
 */

package com.bridgelabz.tpcindia.test;

import com.bridgelabz.tpcindia.base.Base;
import com.bridgelabz.tpcindia.pages.Home;
import com.bridgelabz.tpcindia.utility.TestNgListener;
import com.bridgelabz.tpcindia.utility.Utility;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(TestNgListener.class)
public class TPCIndiaTest extends Base {
    Home home;

    @Test(priority = 1)
    public void whenTryToTrackWithoutNumber_DisplayAlert_ShouldBeHandle() throws InterruptedException, IOException {
        home = new Home(webdriver);
        Boolean check = home.displayTrackingDetails(webdriver);
        if (check) {
            test.log(LogStatus.PASS, test.addScreenCapture(Utility.screenshot("TrackShipment")));
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(Utility.screenshot("TrackShipment")));
        }
        Assert.assertTrue(check);
    }

    @Test(priority = 2)
    public void whenClickLoginButton_DisplayAlter_ShouldBeHandled() throws IOException {
        home = new Home(webdriver);
        Boolean check = home.loginIntoAccount(webdriver);
        if (check) {
            test.log(LogStatus.PASS, test.addScreenCapture(Utility.screenshot("Login")));
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(Utility.screenshot("Login")));
        }
        Assert.assertTrue(check);
    }

    @Test(priority = 3)
    public void whenNavigateToBack_ShouldBeHandled() throws IOException {
        home = new Home(webdriver);
        Boolean check = home.navigateToPreviousPage(webdriver);
        if (check) {
            test.log(LogStatus.PASS, test.addScreenCapture(Utility.screenshot("Navigate")));
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(Utility.screenshot("Navigate")));
        }
        Assert.assertTrue(check);
    }
}
