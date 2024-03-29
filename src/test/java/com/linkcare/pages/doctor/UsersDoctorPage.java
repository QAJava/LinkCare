package com.linkcare.pages.doctor;

/**
 * Created by Alex Kaplan on 17/10/2015.
 */

import com.linkcare.pages.Page;
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
	WebElement usersOrgNameSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"תפקיד\")]")
	WebElement usersRoleSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"SubRole\")]")
	WebElement usersSubRoleSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"שם\")]")
	WebElement usersNameSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"מספר זהות\")]")
	WebElement usersIDSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"מייל\")]")
	WebElement usersEmailSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//a[contains(text(),\"טלפון\")]")
	WebElement usersPhoneSortButton;


    //FilterTextBoxes

	@FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_UserName")
	WebElement usersUserNameFilterTextBox;

	@FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_OrgName")
	WebElement usersOrgNameFilterTextBox;

	@FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_RoleName")
	WebElement usersRoleFilterTextBox;

	@FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_SubRoleName")
	WebElement usersSubRoleFilterTextBox;

	@FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_DisplayName")
	WebElement usersNameFilterTextBox;

	@FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_PersonalId")
	WebElement usersIDFilterTextBox;

	@FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_Email")
	WebElement usersEmailFilterTextBox;

	@FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_PhoneNumber")
	WebElement usersPhoneFilterTextBox;


    //FilterButtons

	@FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_Filter_UserName")
	WebElement usersUserNameFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_Filter_OrgName")
    WebElement usersOrgNameFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_Filter_RoleName")
    WebElement usersRoleFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_Filter_SubRoleName")
    WebElement usersSubRoleFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_Filter_DisplayName")
    WebElement usersNameFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_Filter_PersonalId")
    WebElement usersIDFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_Filter_Email")
    WebElement usersEmailFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_Filter_PhoneNumber")
    WebElement usersPhoneFilterButton;


    // Allert <אין רשומות להצגה>

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00']//div[contains(text(),\"אין רשומות להצגה\")]")
	WebElement usersNoRecords;







    public UsersDoctorPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Users.aspx";
        PageFactory.initElements(driver, this);
    }

    public UsersDoctorPage openUsersDoctorPage(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }

    public UsersDoctorPage openUsersDoctorPage(WebDriver driver, String baseUrl) {
        driver.get(PAGE_URL);
        return this;
    }

        public UsersDoctorPage waitUntilUsersDoctorPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(usersUserNameSortButton);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

// clicking on SortButtons

    public UsersDoctorPage clickOnUsersUserNameFilterButton() {
        clickElement(usersUserNameFilterButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersOrgNameFilterButton() {
        clickElement(usersOrgNameFilterButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersRoleFilterButton() {
        clickElement(usersRoleFilterButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersSubRoleFilterButton() {
        clickElement(usersSubRoleFilterButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersNameFilterButton() {
        clickElement(usersNameFilterButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersIDFilterButton() {
        clickElement(usersIDFilterButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersEmailFilterButton() {
        clickElement(usersEmailFilterButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersPhoneFilterButton() {
        clickElement(usersPhoneFilterButton);
        return this;
    }


    // clicking on FilterButtons

    public UsersDoctorPage clickOnUsersUserNameSortButton() {
        clickElement(usersUserNameSortButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersOrgNameSortButton() {
        clickElement(usersOrgNameSortButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersRoleSortButton() {
        clickElement(usersRoleSortButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersSubRoleSortButton() {
        clickElement(usersSubRoleSortButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersNameSortButton() {
        clickElement(usersNameSortButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersIDSortButton() {
        clickElement(usersIDSortButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersEmailSortButton() {
        clickElement(usersEmailSortButton);
        return this;
    }

    public UsersDoctorPage clickOnUsersPhoneSortButton() {
        clickElement(usersPhoneSortButton);
        return this;
    }


    // filling filterTextBoxes

    public UsersDoctorPage fillUsersUserNameFilterTextBox(String text) {
        setElementText(usersNameFilterTextBox, text);
        return this;
    }





    public boolean isOnUsersDoctorPage() {
        return exists(usersNameFilterTextBox);
    }

    public boolean allertMessageNoRecords() {
        return exists(usersNoRecords);
    }





/*
    public UsersDoctorPage chooseOrganization(String name) {

        WebElement element = driver.findElement(By.xpath("//*[@id='TreeView1']//span[contains(text(),'" + name + "')]"));
        element.click();
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