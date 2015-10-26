package com.linkcare;

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
	public static String clinicName = "Clinic1";
	public static String clinicAddress = "Rehovot prof Plaut 10";
	public static String clinicPhone = "12345678";
	public static String clinicName2 = "Aibolit2";
	public static String clinicAddress2 = "Rehovot prof Menahem Plaut 10";
	public static String clinicPhone2 = "123456789";

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
			clinicAdminPage.checkClinicNameFilter("o");
			} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void createNewClinic() {
		clinicAdminPage.clickAddNewClinic()
				.waitUntilNewClinicWindow()
				.fillClinicName(clinicName);
		String winHandleBefore = driver.getWindowHandle();
				clinicAdminPage.clickToChooseOrgButton()
				.waitUntilChooseOrgPageIsLoaded();
		/*for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}*/
		driver.switchTo().window("ChooseOrganization.aspx");
				clinicAdminPage.clickToChoosePrivatDoc()
					//.chooseOrganization("רופאים פרטיים")
					.clickToSelectOrg();
			driver.close();
			driver.switchTo().window(winHandleBefore);
			clinicAdminPage.fillClinicAddress(clinicAddress)
					.fillClinicPhone(clinicPhone)
					.clickToProceed()
					.clickToSave();


	}
		@Test
		public void editClinic () {
			clinicAdminPage.chooseEditButton("0")
					.waitUntilEditWindowIsLoaded()
					.fillEditNameField(clinicName2)
					.fillEditAddressField(clinicAddress2)
					.fillEditPhoneField(clinicPhone2)
					.clickToSaveEdit()
					.openClinicPage(driver)
					.waitUntilClinicPageIsLoaded();
			Assert.assertEquals(clinicAdminPage.getTextFromEditedField("0"), clinicName2, "Name of clinic is not edited");
		}




	@AfterClass(alwaysRun = true)
	public void teardown() {
		this.driver.quit();
	}
}
