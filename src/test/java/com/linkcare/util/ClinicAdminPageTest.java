package com.linkcare.util;

import com.linkcare.pages.ClinicAdminPage;
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
 * Created by Svetlana on 22.10.2015.
 */
public class ClinicAdminPageTest {
	public WebDriver driver;
	public LoginPage loginPage;
	public ClinicAdminPage clinicAdminPage;

	@BeforeClass(alwaysRun = true)
	public void setup() {
		driver = new FirefoxDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		clinicAdminPage = PageFactory.initElements(driver,ClinicAdminPage.class);
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
			clinicAdminPage
					.openClinicPage(driver)
					.waitUntilClinicPageIsLoaded();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test
	public void checkFilter() {
		try {
			clinicAdminPage.checkClinicNameFilter("a");
			} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@AfterClass(alwaysRun = true)
	public void teardown() {
		this.driver.quit();
	}
}
