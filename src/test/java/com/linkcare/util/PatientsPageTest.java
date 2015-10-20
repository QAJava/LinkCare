package com.linkcare.util;

import com.linkcare.pages.DoctorMainPage;
import com.linkcare.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Christina on 10/16/15.
 */
public class PatientsPageTest {

    public WebDriver driver;
    public DoctorMainPage mainPage;
    public LoginPage loginPage;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new FirefoxDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, DoctorMainPage.class);

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        try {
            loginPage.opennLoginPage(driver)
                    .waitUntilLoginPageIsLoaded()
                    .login("493Baranoski", "Mzj$6Vbb3I");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test(groups = {"smoke", "positive"})
    public void test1() {
        try {
            mainPage
                    .clickToSelectPatientsActive()
                    .clickToSelectPatientsToday()
                    .clickToSelectSearchPatients()
                    .clickToSelectPatientsActive()
                    .clickToSelectPatientsToday()
                    .clickToSelectSearchPatients();
          /*  assertTrue("The Patient Active Page doesn't open",;
            assertTrue("The Patient Today Page doesn't open",;
            assertTrue("The Search Patient Page doesn't open",;*/
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        this.driver.quit();
    }
}


