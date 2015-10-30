package com.linkcare;

import com.linkcare.pages.ForgotPasswordPage;
import com.linkcare.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Oleg on 19.10.2015.
 */
public class ForgotPasswordTest {

    public WebDriver driver;

    public LoginPage loginPage;
    public ForgotPasswordPage forgotPasswordPage;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new FirefoxDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        try {
            loginPage.openLoginPage(driver);
//                    .waitUntilLoginPageIsLoaded();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(groups = {"smoke", "positive"})
    public void RestorePass() {
        try {
            loginPage.clickOnForgotPasswordLink();
            forgotPasswordPage
                    .waitUntilForgotPasswordPageIsLoaded()
                    .fillUsernameField("DoctorHouse")
                    .clickOnRestoreButton();
            Assert.assertTrue(loginPage.isOnLoginPage(), "The Login Page doesn't open");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(groups = {"smoke", "negative"})
    public void RestorePassWithWrongLogin() {
        try {
            loginPage.clickOnForgotPasswordLink();
            forgotPasswordPage
                    .waitUntilForgotPasswordPageIsLoaded()
                    .fillUsernameField("DoctorH")
                    .clickOnRestoreButton();
            Assert.assertTrue(forgotPasswordPage.isFailureNotificationAlert(), "The Failure Notification Alert doesn't open");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
