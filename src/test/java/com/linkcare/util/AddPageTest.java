package com.linkcare.util;

import com.linkcare.pages.AddPatientPage;
import com.linkcare.pages.DoctorMainPage;
import com.linkcare.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Christina on 10/24/15.
 */
public class AddPageTest {

    public WebDriver driver;
    public DoctorMainPage mainPage;
    public LoginPage loginPage;
    public AddPatientPage addPatientPage;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new FirefoxDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, DoctorMainPage.class);

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        try {
            loginPage.openLoginPage(driver)
                    .waitUntilLoginPageIsLoaded()
                    .login("493Baranoski", "Mzj$6Vbb3I");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    @Test(groups = {"smoke", "positive"})
    public void test1() {
        try {
            addPatientPage
                    .clickToButtonAdd()
                    .clickToOutputFromFormAddPatient();

            //           assertTrue("The Patient Active Page doesn't open",mainPage.visibleCalendarAppears());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @AfterClass(alwaysRun = true)
    public void teardown() {
        this.driver.quit();
    }
}


