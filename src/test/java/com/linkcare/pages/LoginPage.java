package com.linkcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by on 5/19/2015.
 */
public class LoginPage extends Page {





    @FindBy(id = "MainContent_LoginUser_UserName")

    WebElement usernameField;

    @FindBy(id = "MainContent_LoginUser_Password")

    WebElement passwordField;

    @FindBy(id = "MainContent_LoginUser_LoginButton")

    WebElement loginButton;

    @FindBy(xpath = "s ")

    WebElement signUpButton;
    @FindBy(xpath = "s ")

    WebElement forgotLink;
    @FindBy(xpath = "s ")

    WebElement invalidPasswordAlert;


    @FindBy(xpath = "s")
    WebElement invalidEmailAlert;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/Login.aspx";
        PageFactory.initElements(driver, this);
    }

    public LoginPage opennLoginPage(WebDriver driver) {
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

    public LoginPage waitUntilAllertEmailIsLogIsLoaded() {
        try {
            waitUntilElementIsLoaded(invalidEmailAlert);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }return this;
    }

    public LoginPage waitUntilAllertPasswordIsLogIsLoaded() {
        try {
            waitUntilElementIsLoaded(invalidPasswordAlert);
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

    public LoginPage login(String email, String password) {
        //openLoginPage();
        waitUntilLoginPageIsLoaded();
        fillEmailField(email);
        fillPasswordField(password);
        clickOnLogin();
        return this;
    }

    public LoginPage clickOnForgotPasswordLink(){
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
