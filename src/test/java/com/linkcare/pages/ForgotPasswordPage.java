package com.linkcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.io.IOException;
/**
 * Created by Oleg on 16.10.2015.
 */
public class ForgotPasswordPage extends Page {

    @FindBy(id="MainContent_PasswordRecovery_UserNameContainerID_UserName")
    WebElement usernameField;

    @FindBy(id = "MainContent_PasswordRecovery_UserNameContainerID_SubmitButton")
    WebElement restoreButton;


    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/login.aspx?ReturnUrl=%2fLogin.aspx";
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
    }

    public ForgotPasswordPage openForgotPasswordPage(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }

    public ForgotPasswordPage waitUntilForgotPasswordPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(usernameField);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }return this;
    }

    public ForgotPasswordPage fillUsernameField(String username) {
        setElementText(usernameField, username);
        return this;
    }

    public ForgotPasswordPage clickOnRestoreButton() {
        clickElement(restoreButton);
        return this;
    }
}
