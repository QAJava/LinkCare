package com.linkcare.pages.doctor;

import com.linkcare.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by on 5/19/2015.
 */
public class PatientsPage extends Page {


    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement usernameField;


    public PatientsPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Accounts.aspx";
        PageFactory.initElements(driver, this);
    }

    public PatientsPage opennPatientsPage(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }
    public PatientsPage openPatientsPage(WebDriver driver, String baseUrl) {
        driver.get(PAGE_URL);
        return this;
    }

    public PatientsPage waitUntilPatiensPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(usernameField);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }return this;
    }



}
