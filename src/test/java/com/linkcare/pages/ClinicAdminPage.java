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
    WebElement clinicSortButton;




    @FindBy (xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[contains(text(),'שם קליניקה')]")
    WebElement clinicNameSortButton;

    //add new clinic
    @FindBy(id = "MainContent_AddNewItem")
    WebElement addNewClinicButton;

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


    @FindBy(id = "MainContent_LoginUser_UserName")

    WebElement usernameField;

    @FindBy(id = "MainContent_LoginUser_Password")

    WebElement passwordField;

    @FindBy(id = "MainContent_LoginUser_LoginButton")



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



}