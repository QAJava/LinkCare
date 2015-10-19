package com.linkcare;

import com.linkcare.pages.ForgotPasswordPage;
import com.linkcare.pages.LoginPage;
import com.linkcare.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
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
            loginPage.opennLoginPage(driver);
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
            assertTrue("The Login Page doesn't open", loginPage.isOnLoginPage());
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
            assertTrue("The Failure Notification Alert doesn't open", forgotPasswordPage.isFailureNotificationAlert());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
