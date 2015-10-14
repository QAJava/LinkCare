package com.linkcare.pages.doctor;

import com.linkcare.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Christina on 5/19/2015.
 */
public class PatientsPage extends Page {


    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement userNameField;

    //For Patients Active
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadTabStrip1']//span[contains(text(),'מטופלים פעילים')]")
    WebElement patientsActive;
    @FindBy(xpath="//*[@id='MainContent_RadPageView1']//h2")
    WebElement listOfPatients;
    @FindBy(xpath="//*[@id='MainContent_RadPageView1']//div[@class='searchArea']/label")
    WebElement filterByDateOfMeeting;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RDP_AccountMeeting_dateInput']")
    WebElement FieldOfInputFilterByDateOfMeeting;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RDP_AccountMeeting_popupButton']")
    WebElement openCalendar;
    @FindBy(xpath="//*[@id='MainContent_BtnDeleteMeeting']")
    WebElement removeFilter;
    @FindBy(xpath="//*[@id='MainContent_ItemLinkButton3']")
    WebElement addLeftSide;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_FirstName']")
    WebElement fieldOfFilterFirstName;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_LastName']")
    WebElement fieldOfFilterLastName;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_PersonalId']")
    WebElement fieldOfFilterPersonalID;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid1_ctl00']//div")
    WebElement labelNoRecordsToShow;
    @FindBy(xpath="//*[@id='MainContent_AddNewItem']")
    WebElement addRightSide;

    //For Patients Today
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadTabStrip1']//span[contains(text(),'מטופלים להיום')]']")
    WebElement patientsToday;
    @FindBy(xpath="//*[@id='MainContent_ctl01']//h2 ']")
    WebElement listOfPatientsToday;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid2_ctl00_ctl02_ctl02_FilterTextBox_FirstName']")
    WebElement fieldOfFilterFirstNamePatientsToday;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid2_ctl00_ctl02_ctl02_FilterTextBox_LastName']")
    WebElement fieldOfFilterLastNamePatientsToday;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid2_ctl00_ctl02_ctl02_FilterTextBox_PersonalId']")
    WebElement fieldOfFilterPersonalIDPatientsToday;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid2_ctl00']//div")
    WebElement labelNoRecordToShowPatientsToday;

    //Fot Search Patients
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadTabStrip1']//span[contains(text(),'חיפוש מטופלים')]")
    WebElement tabSearchPatients;
    @FindBy(xpath="//*[@id='MainContent_ctl02']//h2']")
    WebElement listOfPatientsSearchPatients;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_FirstName']")
    WebElement fieldOfFilterFirstNameSearchPatients;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_LastName']")
    WebElement fieldOfFilterLastNameSearchPatients;
    @FindBy(xpath="//*[@id='ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_PersonalId']")
    WebElement fieldOfFilterPersonalIDSearchPatients;



    //constructor
    public PatientsPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Accounts.aspx";
        PageFactory.initElements(driver, this);
    }

    public PatientsPage openPatientsPageDriver(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }
    public PatientsPage openPatientsPage(WebDriver driver, String baseUrl) {
        driver.get(PAGE_URL);
        return this;
    }

    public PatientsPage waitUntilPatientsPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(userNameField);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }return this;
    }



}
