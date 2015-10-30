package com.linkcare.pages;

/**
 * Created by Christina on 28/05/2015.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class DoctorMainPage extends Page {

    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement userNameField;

    //For Patients Active
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadTabStrip1']//span[contains(text(),'מטופלים פעילים')]")
    WebElement tabPatientsActive;
    @FindBy(xpath = "//*[@id='MainContent_RadPageView1']//h2")
    WebElement listOfPatients;
    @FindBy(xpath = "//*[@id='MainContent_RadPageView1']//h2[contains(text(),'רשימת מטופלים')]")
    WebElement labelListOfPatientsForPatientsActive;
    @FindBy(xpath = "//*[@id='MainContent_RadPageView1']//div[@class='searchArea']/label")
    WebElement filterByDateOfMeeting;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RDP_AccountMeeting_dateInput']")
    WebElement fieldOfInputDateOfCalendar;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RDP_AccountMeeting_popupButton']")
    WebElement buttonOfCalendar;
    @FindBy(xpath = "//*[@id='MainContent_BtnDeleteMeeting']")
    WebElement removeFilter;
    @FindBy(xpath = "//*[@id='MainContent_ItemLinkButton3']")
    WebElement addLeftSide;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_FirstName']")
    WebElement fieldOfFilterFirstName;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_LastName']")
    WebElement fieldOfFilterLastName;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_PersonalId']")
    WebElement fieldOfFilterPersonalID;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//div")
    WebElement labelNoRecordsToShow;
    @FindBy(xpath = "//*[@id='MainContent_AddNewItem']")
    WebElement addRightSide;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RDP_AccountMeeting_calendar']")
    WebElement calendarAppears;


    //For Patients Today
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadTabStrip1']//span[contains(text(),'מטופלים להיום')]")
    WebElement tabPatientsToday;
    @FindBy(xpath = "//*[@id='MainContent_ctl01']//h2]")
    WebElement listOfPatientsToday;
    @FindBy(xpath = "//*[@id='MainContent_ctl01']//h2[contains(text(),'רשימת מטופלים')]")
    WebElement labelListOfPatientsForPatientsToday;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid2_ctl00_ctl02_ctl02_FilterTextBox_FirstName']")
    WebElement fieldOfFilterFirstNamePatientsToday;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid2_ctl00_ctl02_ctl02_FilterTextBox_LastName']")
    WebElement fieldOfFilterLastNamePatientsToday;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid2_ctl00_ctl02_ctl02_FilterTextBox_PersonalId']")
    WebElement fieldOfFilterPersonalIDPatientsToday;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid2_ctl00']//div")
    WebElement labelNoRecordToShowPatientsToday;

    //Fot Search Patients
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadTabStrip1']//span[contains(text(),'חיפוש מטופלים')]")
    WebElement tabSearchPatients;
    @FindBy(xpath = "//*[@id='MainContent_ctl02']//h2]")
    WebElement listOfPatientsSearchPatients;
    @FindBy(xpath = "//*[@id='MainContent_ctl02']//h2[contains(text(),'רשימת מטופלים')]")
    WebElement labelListOfPatientsForSearchPatients;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_FirstName']")
    WebElement fieldOfFilterFirstNameSearchPatients;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_LastName']")
    WebElement fieldOfFilterLastNameSearchPatients;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid3_ctl00_ctl02_ctl02_FilterTextBox_PersonalId']")
    WebElement fieldOfFilterPersonalIDSearchPatients;

    //Buttons

    @FindBy(xpath = "//*[@id='Top1_HeadLoginStatus']")
    WebElement logOutButton;


    public DoctorMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.PAGE_URL = baseUrl + "/home";

    }

    public DoctorMainPage openMainPage(WebDriver driver /*String baseUrl*/) {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Tabs.aspx");
        return this;
    }


    // Waits until title of our 'What works' Panel appears on the screen
    public DoctorMainPage waitUntilMainPageIsLoaded() {
        waitUntilIsLoaded(logOutButton);
        return this;
    }

    public DoctorMainPage waitUntilLabelListOfPatientsForPatientsTodayIsLoaded() {
        waitUntilIsLoaded(labelListOfPatientsForPatientsToday);
        return this;
    }

    public DoctorMainPage waitUntilLabelListOfPatientsForSearchPatientsIsLoaded() {
        waitUntilIsLoaded(labelListOfPatientsForSearchPatients);
        return this;
    }

    public DoctorMainPage waitUntilLabelListOfPatientsForPatientsActiveIsLoaded() {
        waitUntilIsLoaded(labelListOfPatientsForPatientsActive);
        return this;
    }

    public DoctorMainPage waitUntilCalendarIsLoaded() {
        waitUntilIsLoaded(calendarAppears);
        return this;
    }


    public DoctorMainPage clickToSelectPatientsActive() {
        clickElement(tabPatientsActive);
        return this;
    }

    public DoctorMainPage clickToSelectPatientsToday() {
        clickElement(tabPatientsToday);
        return this;
    }

    public DoctorMainPage clickToSelectSearchPatients() {
        clickElement(tabSearchPatients);
        return this;
    }

    public DoctorMainPage clickToCalendarButton() {
        clickElement(buttonOfCalendar);
        return this;
    }

    public DoctorMainPage fillToCalendarField(String date) {
        setElementText(fieldOfInputDateOfCalendar, date);
        driver.findElement(By.id("ctl00_MainContent_RDP_AccountMeeting_dateInput")).sendKeys(Keys.ENTER);
        return this;
    }

    public DoctorMainPage clickToRemoveFilter() {
        clickElement(removeFilter);
        return this;
    }

    public DoctorMainPage clearCalendarFieldByBackspase() {
        driver.findElement(By.id("ctl00_MainContent_RDP_AccountMeeting_dateInput")).sendKeys(Keys.BACK_SPACE);
        return this;
    }


    public boolean isOnMainPage() {

        waitUntilMainPageIsLoaded();
        return exists(logOutButton);
    }

    /* public DoctorMainPage openPatientsTab (){
     clickElement(patientTab);
     return this;
     }

     public DoctorMainPage openSearchPatientsTab (){
         clickElement(searchPatients);
         return this;
     }

     public DoctorMainPage filterPatientsByFirstName (String name) {
         setElementText(firstNameFilterInputField,name);
         return this;
     }
 */
    public boolean isLoggedIn() {

        return exists(logOutButton);
    }

    public DoctorMainPage logOut() {
        clickElement(logOutButton);
        return this;
    }

    public boolean visibleLabelListOfPatientsPatientActive() {return exists(labelListOfPatientsForPatientsActive);}

    public boolean visibleLabelListOfPatientsPatientToday() {return exists(labelListOfPatientsForPatientsToday);}

    public boolean visibleLabelListOfPatientsSearchPatient() {return exists(labelListOfPatientsForSearchPatients);}

    public boolean visibleCalendarAppears() {return exists(calendarAppears);}





}