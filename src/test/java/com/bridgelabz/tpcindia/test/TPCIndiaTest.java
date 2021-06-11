/**
 * purpose : To perform test to check functionality of different features of TPCIndia Application
 * Author : Samiksha Shende
 * Date : 09/06/21020
 */

package com.bridgelabz.tpcindia.test;

import com.bridgelabz.tpcindia.base.Base;
import com.bridgelabz.tpcindia.pages.Home;
import org.testng.annotations.Test;

public class TPCIndiaTest extends Base {
    Home home;

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
}
