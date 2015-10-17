package com.linkcare.pages.doctor;

/**
 * Created by Alex Kaplan on 17/10/2015.
 */

import com.linkcare.pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class UsersDoctorPage extends Page {

//Sort Buttons
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"שם משתמש\")]")
	WebElement usersUserNameSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"שם הארגון\")]")
	WebElement usersOrganizationNameSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"תפקיד\")]")
	WebElement usersRoleSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"SubRole\")]")
	WebElement usersSubRoleSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"שם\")]")
	private WebElement usersNameSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"מספר זהות\")]")
	private WebElement usersIDSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"מייל\")]")
	private WebElement usersMailSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"טלפון\")]")
	private WebElement usersPhoneSortButton;



//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),"טלפון")]


/*




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
*/
    public UsersDoctorPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Users.aspx";
        PageFactory.initElements(driver, this);
    }
/*
    public UsersDoctorPage openUsersDoctorPage(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }

    public UsersDoctorPage openUsersDoctorPage(WebDriver driver, String baseUrl) {
        driver.get(PAGE_URL);
        return this;
    }
///
    public UsersDoctorPage waitUntilusersDoctorPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(usernameField);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public UsersDoctorPage chooseOrganization(String name) {

        WebElement element = driver.findElement(By.xpath("//*[@id='TreeView1']//span[contains(text(),'" + name + "')]"));
        element.click();
        return this;
    }

    public UsersDoctorPage clickToSelectOrg() {
        clickElement(selectButton);
        return this;
    }

    public UsersDoctorPage fillClinicName(String text) {
        setElementText(clinicNameField, text);
        return this;
    }

    public UsersDoctorPage fillClinicPhone(String text) {
        setElementText(clinicPhoneFiled, text);
        return this;
    }

    public UsersDoctorPage fillClinicAddress(String text) {
        setElementText(clinicAddressFiled, text);
        return this;
    }

    public UsersDoctorPage clickToProceed() {
        clickElement(proceedButton);
        return this;
    }

    public UsersDoctorPage waitUntilAllertEmailIsLogIsLoaded() {
        try {
            waitUntilElementIsLoaded(invalidEmailAlert);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public UsersDoctorPage waitUntilAllertPasswordIsLogIsLoaded() {
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
        waitUntilusersDoctorPageIsLoaded();
        return exists(usernameField);
    }

    public UsersDoctorPage fillEmailField(String email) {
        setElementText(usernameField, email);

        return this;
    }

    public UsersDoctorPage fillPasswordField(String password) {
        setElementText(passwordField, password);

        return this;
    }



    public UsersDoctorPage clickOnSignUpButton() {
        clickElement(signUpButton);
        return this;
    }



    public UsersDoctorPage clickOnForgotPasswordLink() {
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
*/
}