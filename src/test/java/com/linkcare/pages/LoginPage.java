package com.linkcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by on 5/19/2015.
 * Oleg
 */
public class LoginPage extends Page {


    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement usernameField;

    @FindBy(id = "MainContent_LoginUser_Password")
    WebElement passwordField;

    @FindBy(id = "MainContent_LoginUser_LoginButton")
    WebElement loginButton;

    @FindBy(id="MainContent_LoginUser_RegisterHyperLink")
    WebElement signUpButton;

    @FindBy(xpath = "//*[@class='forgot']")
    WebElement forgotLink;

    @FindBy(id="MainContent_LoginUser_RegisterHyperLink")
    WebElement regLink;

    @FindBy(xpath = "//*[@class='failureNotification' and contains(text(),'ניסיון ההתחברות שלך לא הצליח. אנא נסה שוב')]")
    WebElement failureNotificationAlert;

    @FindBy(xpath = "//*[@id='MainContent_LoginUser_LoginUserValidationSummary' and contains(.,'שם משתמש חובה')]")
    WebElement emptyUserAlert;

    @FindBy(xpath = "//*[@id='MainContent_LoginUser_LoginUserValidationSummary' and contains(.,'סיסמא חובה')]")
    WebElement emptyPassAlert;



    public LoginPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/Login.aspx";
        PageFactory.initElements(driver, this);
    }

    public LoginPage openLoginPage(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }
    public LoginPage openLoginPage(WebDriver driver, String baseUrl) {
        driver.get(PAGE_URL);
        return this;
    }

    public LoginPage waitUntilLoginPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(usernameField);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }return this;
    }

    public LoginPage waitUntilAllertFailureNotificationIsLoaded() {
        try {
            waitUntilElementIsLoaded(failureNotificationAlert);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }return this;
    }

    public LoginPage waitUntilAllertEmptyUserIsLoaded() {
        try {
            waitUntilElementIsLoaded(emptyUserAlert);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }return this;
    }

    public LoginPage waitUntilAllertEmptyPassIsLoaded() {
        try {
            waitUntilElementIsLoaded(emptyPassAlert);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }return this;
    }

    public boolean isOnLoginPage() {
        waitUntilLoginPageIsLoaded();
        return exists(usernameField);
    }

    public LoginPage fillEmailField(String email) {
        setElementText(usernameField, email);

        return this;
    }

    public LoginPage fillPasswordField(String password) {
        setElementText(passwordField, password);

        return this;
    }

    public LoginPage clickOnLogin() {
        clickElement(loginButton);
        return this;
    }

    public LoginPage clickOnSignUpButton() {
        clickElement(signUpButton);
        return this;
    }

    public LoginPage clickOnForgotPasswordLink() {
        clickElement(forgotLink);
        return this;
    }

    public LoginPage login(String loginName, String password) {
        //openLoginPage();
        waitUntilLoginPageIsLoaded();
        fillEmailField(loginName);
        fillPasswordField(password);
        clickOnLogin();
        return this;
    }

    public boolean alertMessageFailureNotification() {
        return exists(failureNotificationAlert);
    }

    public boolean alertMessageEmptyUser() {
        return exists(emptyUserAlert);
    }

    public boolean alertMessageEmptyPass() {
        return exists(emptyPassAlert);
    }


    public void clickOnRegLink() {
        clickElement(regLink);
    }
}
