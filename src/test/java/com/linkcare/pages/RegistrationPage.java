package com.linkcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Iakov Volf.
 */
public class RegistrationPage extends Page {

    //private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    //fields
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement usernameField;

	@FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement emailField;


    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement passwordField;
	@FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement confirmPassField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstNameField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastNameField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement teudatField;


	@FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
	 WebElement birthDateField ;

	@FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
	 WebElement mobilePhoneField;

	@FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_AddressTxt")
	 WebElement streetNameField;
	@FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
	 WebElement houseNumberField;

	@FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
	 WebElement cityField;

    //Select
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_rolesDDl")
    WebElement selectMedProvider;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL")
    WebElement selectclinicType;

    //Alerts
	@FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserNameRequired")
	 WebElement usernameAlert;

	@FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_FirsNameRequired")
	private WebElement firstNameAlert;


    //buttons
    @FindBy(id = "MainContent_LinkButton1")
    WebElement cancelButton;

    @FindBy(id = "MainContent_AddNewUser")
    WebElement submitButton;



    //checkboxs

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_IsClinicAdmin")
    private WebElement agreeCheckbox;


    //public ProfilePage profilePage;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = baseUrl + "/signup_regular";
        PageFactory.initElements(driver, this);
     }



    public RegistrationPage openRegistrationPage(WebDriver driver) {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
        return this;
    }

//Fill the fileds
    //ToDo Add method fill passwored again, add another methods
public RegistrationPage fillUsernameField (String username) {
    setElementText(usernameField, username);
    return this;
}

    public RegistrationPage fillEmailField(String email) {
        setElementText(emailField, email);
        return this;
    }

    public RegistrationPage fillPasswordField(String password) {
        setElementText(passwordField, password);
       // Log.info("entering password from the list: " + password + " ");
        return this;
    }

    public RegistrationPage fillFirstNameField(String firstName) {
        setElementText(firstNameField, firstName);
      //  Log.info("entering first name from the list: " + firstName + " ");
        return this;
    }

    public RegistrationPage fillLastNameField(String lastName) {
        setElementText(lastNameField, lastName);
     //   Log.info("entering last name from the list: " + lastName + " ");
        return this;
    }

    public RegistrationPage choosePrivateDoctor () {
selectValueInDropdown(selectclinicType,"2");
        //   Log.info("entering last name from the list: " + lastName + " ");
        return this;
    }

    public RegistrationPage chooseClinic(String name) {
        selectValueInDropdownbyText(selectclinicType, name);
        //   Log.info("entering last name from the list: " + lastName + " ");
        return this;
    }

    public RegistrationPage waitUntilRegPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(submitButton);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

//ToDo add click to cancel

    public void clickToSubmit() {
        clickElement(submitButton);

    }




    public boolean isOnRegistrationPage() {
        return exists(submitButton);
    }

    //check alert presence

    public boolean alertMessageNotValidUserName() {
        return exists(usernameAlert);
    }

    public boolean alertMessageNotValidFirsrName() {
        return exists(firstNameAlert);
    }

    }
