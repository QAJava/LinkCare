package com.linkcare;

import com.linkcare.pages.ForgotPasswordPage;
import com.linkcare.pages.LoginPage;
import com.linkcare.pages.DoctorMainPage;
import com.linkcare.pages.RegistrationPage;
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
 *Oleg
 */
public class LoginTest {
    public static String USER = "AdminSuperUser";
    public static String PASSWORD = "4SnoopLv";
    public static String USER1 = "DoctorHouse";
    public static String PASSWORD1 = "NV>rY#j!W%vySr";
public WebDriver driver;

    public LoginPage loginPage;
    public DoctorMainPage mainPage;
    public ForgotPasswordPage forgotPasswordPage;
    public RegistrationPage registrationPage;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new FirefoxDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, DoctorMainPage.class);
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
    public void LoginDoctorSuccess() {
        try {
            loginPage
                    .fillEmailField(USER1)
                    .fillPasswordField(PASSWORD1)
                    .clickOnLogin();
            Assert.assertTrue(mainPage.isOnMainPage(), "The Main Page doesn't open");
            } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(groups = {"smoke", "positive"})
    public void LoginLogoutLogin() {

        try {
            loginPage
                    .fillEmailField(USER)
                    .fillPasswordField(PASSWORD)
                    .clickOnLogin();
            mainPage.waitUntilMainPageIsLoaded();
            mainPage.logOut();
            loginPage
                    .waitUntilLoginPageIsLoaded()
                    .fillEmailField(USER)
                    .fillPasswordField(PASSWORD)
                    .clickOnLogin();
            mainPage.waitUntilMainPageIsLoaded();
            Assert.assertTrue(mainPage.isOnMainPage(), "The Main Page doesn't open");
            mainPage.logOut();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(groups = {"smoke", "negative"})
    public void LoginWithoutLoginPass() {
        try {
            loginPage
                    .fillEmailField("")
                    .fillPasswordField("")
                    .clickOnLogin()
                    .waitUntilAllertEmptyUserIsLoaded();
            Assert.assertTrue(loginPage.isOnLoginPage(), "The Main Page is opened");
            Assert.assertTrue(loginPage.alertMessageEmptyUser(), "Alert message 'שם משתמש חובה' is not presented");
            Assert.assertTrue(loginPage.alertMessageEmptyPass(), "Alert message 'סיסמא חובה' is not presented");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(groups = {"smoke", "negative"})
    public void LoginWithoutUsername() {
        try {
            loginPage
                    .fillEmailField("")
                    .fillPasswordField(PASSWORD)
                    .clickOnLogin()
                    .waitUntilAllertEmptyUserIsLoaded();
            Assert.assertTrue(loginPage.isOnLoginPage(), "The Main Page is opened");
            Assert.assertTrue(loginPage.alertMessageEmptyUser(), "Alert message 'שם משתמש חובה' is not presented");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(groups = {"smoke", "negative"})
    public void LoginWithoutPassword() {
        try {
            loginPage
                    .fillEmailField("USER1")
                    .fillPasswordField("")
                    .clickOnLogin()
                    .waitUntilAllertEmptyUserIsLoaded();
            Assert.assertTrue(loginPage.isOnLoginPage(), "The Main Page is opened");
            Assert.assertTrue(loginPage.alertMessageEmptyPass(), "Alert message 'סיסמא חובה' is not presented");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(groups = {"smoke", "negative"})
    public void LoginWithWrongLoginPass() {
        try {
            loginPage
                    .fillEmailField("zxc")
                    .fillPasswordField("123")
                    .clickOnLogin()
                    .waitUntilAllertEmptyUserIsLoaded();
            Assert.assertTrue(loginPage.isOnLoginPage(), "The Main Page is opened");
            Assert.assertTrue(loginPage.alertMessageFailureNotification(), "Alert message 'ניסיון ההתחברות שלך לא הצליח. אנא נסה שוב' is not presented");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(groups = {"smoke", "positive"})
        public void ForgotPassLink() {
            try {
                loginPage
                        .clickOnForgotPasswordLink();
                forgotPasswordPage.waitUntilForgotPasswordPageIsLoaded();
                Assert.assertTrue(forgotPasswordPage.isOnForgotPassPage(), "The Reset Password Page doesn't open");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    @Test(groups = {"smoke", "positive"})
    public void CreateNewDoctorLink() {
        try {
            loginPage
                    .clickOnRegLink();
            registrationPage.waitUntilRegPageIsLoaded();
            Assert.assertTrue(registrationPage.isOnRegistrationPage(), "The Registration Page doesn't open");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }

}
