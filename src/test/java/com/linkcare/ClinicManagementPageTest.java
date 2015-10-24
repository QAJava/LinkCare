package com.linkcare;

import com.linkcare.pages.DoctorMainPage;
import com.linkcare.pages.LoginPage;
import com.linkcare.pages.ClinicManagementPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Zizi78 on 10/24/2015.
 */
public class ClinicManagementPageTest {


    public static String username = "zizi88";
    public static String firstName = "Zizi";
    public static String lastName = "Zizi";
    public static String clinicsId = "";
    public static String email = "z88@mail.ru";
    public static String password = "z88@mail";
    public static String confirmPassword = "z88@mail";
    public static String roles2= "מנהל קליניקה";
    public static String dateInputField = "";
    public static String calendarPopupButton = "";
    public static String personaiId = "049919889";
    public static String telephone = "12345678";
    public static String street = "Leon blum";
    public static String city = "Tel Aviv";
    public static String houseNumber = "33";
    public static String zipCode = "";
    public WebDriver driver;
    public LoginPage loginPage;
    public ClinicManagementPage clinicManagementPage;
    public DoctorMainPage mainPage;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new FirefoxDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        clinicManagementPage = PageFactory.initElements(driver, ClinicManagementPage.class);
        mainPage = PageFactory.initElements(driver, DoctorMainPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        try {
            loginPage.opennLoginPage(driver)
                    .waitUntilLoginPageIsLoaded()
                    .login("zizi88", "z88@mail");
            clinicManagementPage.openClinicManagementPage(driver)
                    .waitUntilClinicManagementPageIsLoaded();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(groups = {"smoke", "positive"})
    public void CreateNewUserSuccess() {
        try {
            clinicManagementPage.clickOnAddNewUserButton()
                    .fillUserNameLabelField(username)
                    .fillFirstNameField(firstName)
                    .fillLastNameField(lastName)
                    .fillEmailLabelField(email)
                    .fillPasswordLabelField(password)
                    .fillconfirmPasswordField(confirmPassword)
                    .clickOnAddNewUserButton();

            mainPage.waitUntilMainPageIsLoaded();
            assertTrue("The Main Page doesn't open", mainPage.isOnMainPage());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(groups = {"smoke", "negative"})
    public void CreateNewUserWithoutPassword() {
        try {
            clinicManagementPage.clickOnAddNewUsersButton()
                    .fillUsernameField(username)
                    .fillFirstNameField(firstName)
                    .fillLastNameField(lastName)
                    .fillEmailLabelField(email)
                    .clickOnAddNewUserButton();

            assertTrue("The Main Page is opened", clinicManagementPage.isOnClinicManagementPage());
           // assertTrue("Alert message '' ", clinicManagementPage.alertMessageNotValidPassword());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @AfterTest(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }

}
