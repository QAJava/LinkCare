package com.linkcare.util;

import com.linkcare.pages.LoginPage;
import com.linkcare.pages.PhysicalCheckAdminPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Roman on 21.10.2015.
 */
public class PhysicalCheckAdminPageTest {
	public WebDriver driver;
	public LoginPage loginPage;
	public PhysicalCheckAdminPage physicalCheckAdminPage;

	@BeforeClass(alwaysRun = true)
	public void setup() {
		driver = new FirefoxDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		physicalCheckAdminPage = PageFactory.initElements(driver,PhysicalCheckAdminPage.class);
			try {
				loginPage.opennLoginPage(driver)
						.waitUntilLoginPageIsLoaded()
						.login("AdminSuperUser", "4SnoopLv");
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethodSetUp() {
		try {
			physicalCheckAdminPage
					.openPhysicalCheckPage(driver)
					.waitAddRecordButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void openNewRecord() {
		try {
			physicalCheckAdminPage.clickToAddRecord();
			physicalCheckAdminPage.waitUntilNewRecordIsOpened();
			Assert.assertTrue(physicalCheckAdminPage.insertButtonIsDisplayed(), "Test non passed - New Record Form Is Not Opened ");
			//Thread.sleep(5000);
			physicalCheckAdminPage.clickToCancelButton();
			//Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void createEmptyRecord() {
		try {
			physicalCheckAdminPage
					.clickToAddRecord()
					.waitUntilNewRecordIsOpened()
					.clickToInsertButton()
					.waitAddRecordButton();
				//	Assert.assertTrue(physicalCheckAdminPage.insertButtonIsDisplayed(), "Non passed - New Record Form is closed ");
			//Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@AfterClass(alwaysRun = true)
	public void teardown() {
		this.driver.quit();
	}
}
