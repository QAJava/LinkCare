package com.linkcare.pages.doctor;

import com.linkcare.pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Zizi78 on 10/17/2015.
 */



public class ClinicManagement extends Page {

   @FindBy(xpath = ".//*[@class='rmText'][contains(text(),'ניהול קליניקה')]")
    WebElement clinicManagementButton;
    @FindBy(xpath = ".//*[@class='rtsTxt'][contains(text(),'עריכת פרטי הקליניקה')]")
    WebElement clinicEditInformationButton;
    @FindBy(xpath = ".//*[@id='MainContent_txtClinicName']")
    WebElement  clinicNameFiled;
    @FindBy(xpath = ".//*[@id='MainContent_txtClinicPhone']")
    WebElement clinicPhoneFiled;
    @FindBy(xpath = ".//*[@id='MainContent_txtClinicAddress']")
    WebElement clinicAddressFiled;
    @FindBy(xpath = ".//*[@class='rtsTxt'][contains(text(),'הרשאות לשאלונים')]")
    WebElement optionalQuestionnaireButton;
    @FindBy(xpath = ".//*[@id='ctl00_MainContent_RCB_organization']")
    WebElement organizationFiled;
    @FindBy(xpath = ".//*[@class='rddtIcon']")
    WebElement organizationFiledIconButton;
    @FindBy(xpath = ".//*[@id='ctl00_MainContent_RCB_organization_EmbeddedTree']")
    WebElement organizationsList;




    public ClinicManagement(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Accounts.aspx";
        PageFactory.initElements(driver, this);
    }

    }
