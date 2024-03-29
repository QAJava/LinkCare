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

    @FindBy(xpath = "//*[@id='MainContent_PasswordRecovery' and contains(.,'לא הצלחנו לגשת למידע שלך. אנא נסה שוב')]")
    WebElement failureNotificationAlert;


    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "";
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
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

    public boolean isOnForgotPassPage() {
        return exists(usernameField);
    }

    public boolean isFailureNotificationAlert() {
        return exists(failureNotificationAlert);
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
