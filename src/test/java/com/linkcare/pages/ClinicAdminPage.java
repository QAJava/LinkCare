package com.linkcare.pages;

/**
 * Created by alex on 28/05/2015.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class ClinicAdminPage extends Page {

    //Sort Buttons
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[contains(text(),\"מס' קליניקה\")]")
    WebElement clinicIdSortButton;

    @FindBy (xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[contains(text(),'שם קליניקה')]")
    WebElement clinicNameSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[contains(text(),\"כתובת הקליניקה\")]")
	WebElement clinicAddressSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[contains(text(),\"שם הארגון\")]")
	WebElement organizationNameSortButton;

    //FilterFields
	@FindBy(id="ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_clinic_id")
	WebElement clinicIdFilterField;

	@FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_clinic_name")
	WebElement clinicNameFilterField;

    @FindBy(id="ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_clinic_address")
    WebElement clinicAddressFilterField;

    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_org_name")
    WebElement organizationNameFilterField;

    //FilterButtons

    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_clinic_id")
    WebElement clinicIdFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_clinic_name")
    WebElement clinicNameFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_clinic_address")
    WebElement clinicAddressFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_org_name")
    WebElement organizationNameFilterButton;

    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'NoFilter')]")
    private WebElement noFilterButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'Contains')]")
    private WebElement ContainsButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'StartsWith')]")
    private WebElement StartsWithButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'EqualTo')]")
    private WebElement EqualToButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'GreaterThan')]")
    private WebElement GreaterThanButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'LessThan')]")
    private WebElement LessThanButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'IsEmpty')]")
    private WebElement IsEmptyButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'NotIsEmpty')]")
    private WebElement NotIsEmptyButton;

    //add new clinic
    @FindBy(id = "MainContent_AddNewItem")
    WebElement addNewClinicButton;

    @FindBy(id = "MainContent_ItemLinkButton2")
    WebElement addNewClinicButton2;

    @FindBy(id = "ctl00_MainContent_rwAddClinic_C_tbClinicName")
    WebElement clinicNameField;

    @FindBy(id = "ctl00_MainContent_rwAddClinic_C_TB_OrgName")
    WebElement organizationName;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_rwAddClinic_C']//tr[2]/td[2]/input[2]")
    WebElement chooseOrgButton;

    @FindBy(id = "ctl00_MainContent_rwAddClinic_C_SaveClinic")
    WebElement proceedButton;

    @FindBy(id = "ctl00_MainContent_rwAddClinic_C_tbClinicPhone")
    WebElement clinicPhoneFiled;

    @FindBy(id = "ctl00_MainContent_rwAddClinic_C_tbClinicAddress")
    WebElement clinicAddressFiled;

    //add new clinic dialog window

    @FindBy(id = "selectOrg")
    WebElement selectButton;


    WebElement signUpButton;
    @FindBy(xpath = "s ")

    WebElement forgotLink;
    @FindBy(xpath = "s ")

    WebElement invalidPasswordAlert;


    @FindBy(xpath = "s")
    WebElement invalidEmailAlert;

    public ClinicAdminPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/Login.aspx";
        PageFactory.initElements(driver, this);
    }

    public ClinicAdminPage opennLoginPage(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }

    public ClinicAdminPage openLoginPage(WebDriver driver, String baseUrl) {
        driver.get(PAGE_URL);
        return this;
    }

    public ClinicAdminPage waitUntilLoginPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(usernameField);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ClinicAdminPage chooseOrganization(String name) {

        WebElement element = driver.findElement(By.xpath("//*[@id='TreeView1']//span[contains(text(),'" + name + "')]"));
        element.click();
        return this;
    }

    public ClinicAdminPage clickToSelectOrg() {
        clickElement(selectButton);
        return this;
    }

    public ClinicAdminPage fillClinicName(String text) {
        setElementText(clinicNameField, text);
        return this;
    }

    public ClinicAdminPage fillClinicPhone(String text) {
        setElementText(clinicPhoneFiled, text);
        return this;
    }

    public ClinicAdminPage fillClinicAddress(String text) {
        setElementText(clinicAddressFiled, text);
        return this;
    }

    public ClinicAdminPage clickToProceed() {
        clickElement(proceedButton);
        return this;
    }

    public ClinicAdminPage waitUntilAllertEmailIsLogIsLoaded() {
        try {
            waitUntilElementIsLoaded(invalidEmailAlert);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ClinicAdminPage waitUntilAllertPasswordIsLogIsLoaded() {
        try {
            waitUntilElementIsLoaded(invalidPasswordAlert);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public boolean isOnLoginPage() {
        waitUntilLoginPageIsLoaded();
        return exists(usernameField);
    }

    public ClinicAdminPage fillEmailField(String email) {
        setElementText(usernameField, email);

        return this;
    }

    public ClinicAdminPage fillPasswordField(String password) {
        setElementText(passwordField, password);

        return this;
    }



    public ClinicAdminPage clickOnSignUpButton() {
        clickElement(signUpButton);
        return this;
    }



    public ClinicAdminPage clickOnForgotPasswordLink() {
        clickElement(forgotLink);
        return this;
    }

    public boolean alertMessageInvalidEmail() {
        return exists(invalidEmailAlert);
    }

    public boolean alertMessageInvalidPassword() {
        return exists(invalidPasswordAlert);
    }

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement usernameField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement passwordField;

}