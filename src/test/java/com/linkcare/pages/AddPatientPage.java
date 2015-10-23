package com.linkcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Cristina on 10/23/15.
 */
public class AddPatientPage extends Page {
    @FindBy(xpath = "//*[@id='popup']//div[contains(text(),'פרטי חשבון')]")
    WebElement accountDetails;
    @FindBy(xpath = "//*[@id='popup']//div[@class='PopupCloseBtn']")
    WebElement signOutFromAccountDetails;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_UpdatePanel1']//legend[contains(text(),'פרטי המטופל/ת')]")
    WebElement PatientInformation;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_RBL_DepPatient_0']")
    WebElement radioButtonBoyGirl;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_RBL_DepPatient_1']")
    WebElement radioButtonIndependentAdult;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_RBL_DepPatient_2']")
    WebElement radioButtonDependentAdult;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_firstNameTxt']")
    WebElement inputFieldFirstName;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_lastNameTxt']")
    WebElement inputFieldLastName;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_PersonalPatientTxt']")
    WebElement inputFieldPersonalID;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_AddEditAccount1_rdp_birthDate_dateInput']")
    WebElement inputFieldBirthDay;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_AddEditAccount1_rdp_birthDate_popupButton']")
    WebElement openCalendarBirthDay;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_rtb_Weight']")
    WebElement inputFieldWeight;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_AddEditAccount1_RCBdomain']//span[2]")
    WebElement dropDownArea;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_UpdatePanel1']//legend[contains(text(),'...')]")
    WebElement labelLinkToOtherPatients;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_AddEditAccount1_TxtSearchRoles_Arrow']")
    WebElement dropPosition;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_AddEditAccount1_TxtsearchMail']")
    WebElement inputMail;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_rfvMail']")
    WebElement labelRedStar;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_AddEditAccount1_RDDL_Therapists_Arrow']")
    WebElement dropDownResponsibleParty;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_AddEditAccount1_RDTmeetingdate_dateInput']")
    WebElement inputEstimatedMeetingDate;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_AddEditAccount1_RDTmeetingdate_popupButton']")
    WebElement openCalendarEstimatedMeetingDate;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_AddEditAccount1_RDTmeetingdate_timePopupLink']")
    WebElement openTimeEstimatedMeetingDate;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_UpdatePanel1']//a[@target='_blank']")
    WebElement dailyPlaner;
    @FindBy(xpath = "//*[@id='MainContent_AddEditAccount1_SaveAccount']")
    WebElement buttonSaveAccount;





    public AddPatientPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.PAGE_URL = baseUrl + "/home";

    }

}
