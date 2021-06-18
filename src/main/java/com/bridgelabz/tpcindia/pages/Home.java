/**
 * purpose : To perform test to check functionality of different features of TPCIndia Application
 * Author : Samiksha Shende
 * Date : 09/06/21020
 */

package com.bridgelabz.tpcindia.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

    @FindBy(xpath = "//input[@placeholder='Enter tracking number']")
    WebElement trackingNumberBox;

    @FindBy(xpath = "//button[text()='SEARCH']")
    WebElement searchButton;

    @FindBy(xpath = "//a[@href='Admin/signin.aspx']")
    WebElement loginButton;

    @FindBy(id = "txt_uid")
    WebElement loginId;

    @FindBy(id = "txt_pwd")
    WebElement pwd;

    @FindBy(id = "btnLogin")
    WebElement signInButton;


    public Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Boolean displayTrackingDetails(WebDriver driver) throws InterruptedException {
        try {
            searchButton.click();
            Thread.sleep(300);
            driver.switchTo().alert().accept();
            trackingNumberBox.sendKeys("454654654545");
            searchButton.click();
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean loginIntoAccount(WebDriver driver) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", loginButton);
            signInButton.click();
            driver.switchTo().alert().accept();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean navigateToPreviousPage(WebDriver driver) {
        try {
            driver.navigate().back();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
