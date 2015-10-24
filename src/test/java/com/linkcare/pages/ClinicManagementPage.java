package com.linkcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Zizi78 on 10/17/2015.
 */

public class ClinicManagementPage extends Page {

 @FindBy(xpath = ".//*[@class='rmText'][contains(text(),'ניהול קליניקה')]")
 WebElement clinicManagementButton;

 //Edit Details of Clinic.
 @FindBy(xpath = ".//*[@class='rtsTxt'][contains(text(),'עריכת פרטי הקליניקה')]")
 WebElement clinicEditInformationButton;
 @FindBy(xpath = ".//*[@id='MainContent_txtClinicName']")
 WebElement clinicNameField;
 @FindBy(xpath = ".//*[@id='MainContent_txtClinicPhone']")
 WebElement clinicPhoneField;
 @FindBy(xpath = ".//*[@id='MainContent_txtClinicAddress']")
 WebElement clinicAddressField;
 //Permissions questionnaires.  //הרשאות לשאלונים
 @FindBy(xpath = ".//*[@class='rtsTxt'][contains(text(),'הרשאות לשאלונים')]")
 WebElement optionalQuestionnaireButton;
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_RCB_organization']")
 WebElement organizationField;
 @FindBy(xpath = ".//*[@class='rddtInner rddtFocused']/span")
 WebElement organizationFieldIconButton;
 @FindBy(xpath = ".//*[@class='rtIn'][contains(text(),'קופת חולים כללית')]")
 WebElement organizationsDropDownList;
 //Domains
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_rcbDomains_Input']")
 WebElement domainsInputFiled;
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_rcbDomains_Arrow']")
 WebElement domainsArrowButton;
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_rcbDomains_DropDown']")
 WebElement domainsDropDownList;
//clinica
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_rcbClinics']")
 WebElement clinicsInputFiled;
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_rcbClinics_Arrow']")
 WebElement clinicsArrowButton;
 @FindBy(xpath = ".//li[contains(text(),'macabi')]")//.//*[@class='rcbHovered']
 WebElement clinicTypeDropDownList;//(macabi)
 //SubRoles
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_rcbSubRoles_Input']")
 WebElement subRolesInputField;
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_rcbSubRoles_Arrow']")
 WebElement subRolesArrowbutton;
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_rcbSubRoles_DropDown']")
 WebElement subRolesDropDownList;
 //search button
 @FindBy(xpath = ".//*[@id='MainContent_search']")
 WebElement searchButton;
 @FindBy(xpath = ".//*[contains(text(),'שם שאלון')]")
 WebElement questionaireNameButton;
 @FindBy(xpath = ".//*[@ class='rgSortAsc']")
 WebElement sortButton;
 @FindBy(xpath = ".//*[@class='rgHeader GridHeader']/a[contains(text(),'תפקיד')]")
 WebElement subRoleNamebutton;
 @FindBy(xpath = ".//*[@class='rgHeader GridHeader']/a[contains(text(),'תחום')]")
 WebElement domainNamebutton;
 @FindBy(xpath = ".//*[@class='rgHeader GridHeader']/a[contains(text(),'קליניקה')]")
 WebElement clinicaButton;
 @FindBy(xpath = ".//input[@class='rgSortAsc']")
 WebElement sortedDescButton;
 @FindBy(xpath = ".//*[contains(text(),'פעיל')]")
 WebElement activeButton;
 @FindBy(xpath = "//*[contains(text(),'שאלון חובה')]")
 WebElement mandatoryQuestionnaireButton;
 @FindBy(xpath = ".//*[contains(text(),'שאלון דיפולטיבי')]")
 WebElement dipoltiviQuestionnaireButton;

//clinicsInternalUsers
 @FindBy(xpath = ".//*[@class='rtsTxt'][contains(text(),'משתמשים פנימיים בקליניקה')]")
 WebElement clinicsInternalUsersButton;
 @FindBy(xpath = ".//*[@id='MainContent_AddNewUser']")
 WebElement addNewUsersButton;
 @FindBy(xpath =".//*[contains(text(),'שם משתמש')]" )
 WebElement usersNameButton;
 @FindBy(xpath =".//*[@class='rgSortAsc']" )
 WebElement userNamesSortButton  ;
 @FindBy(xpath =".//*[contains(text(),'שם תצוגה')]" )
 WebElement  displayNameButton ;
 @FindBy(xpath =".//*[@class='rgSortAsc']" )
 WebElement   displayNameSortButton;
 @FindBy(xpath =".//*[contains(text(),'מספר זהות')]" )
 WebElement  personalIdButton ;
 @FindBy(xpath =".//*[@class='rgSortAsc']" )
 WebElement  personalIdSortButton ;
 @FindBy(xpath =".//*[contains(text(),'מייל')]" )
 WebElement  emailButton ;
 @FindBy(xpath =".//*[@class='rgSortAsc']" )
 WebElement  emailSortButton ;
 @FindBy(xpath = ".//*[contains(text(),'טלפון')]")
 WebElement phoneButton ;
 @FindBy(xpath = ".//*[@class='rgSortAsc']")
 WebElement phoneSortButton  ;
 @FindBy(xpath =".//*[@id='ctl00_MainContent_RadGrid3_ctl00_ctl04_EditButton']" )
 WebElement  editButton ;

 //Create User
 @FindBy(xpath =".//*[@id='MainContent_AddNewUser']" )
 WebElement createNewUserButton;
 @FindBy(xpath = ".//*[@class='PopupCloseBtn']")
 WebElement popupCloseButton;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_UserNameLabel']")
 WebElement userNameField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_UserNameRequired']")
 WebElement userNameRequired;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt']")
 WebElement firstNameField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_FirstNameRequired']")
 WebElement firstNameRequired;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt']")
 WebElement lastNameField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_ClinicLabel']")
 WebElement clinicLabelDropDownList;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_EmailLabel']")
 WebElement emailLabelField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_EmailRequired']")
 WebElement emailRequiredButton;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_PasswordLabel']")
 WebElement passwordLabelField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_PasswordRequired']")
 WebElement passwordRequiredField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_ConfirmPasswordLabel']")
 WebElement confirmPasswordField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_ConfirmPasswordRequired']")
 WebElement confirmPasswordRequiredButton;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_rolesDDl']")
 WebElement rolesDropDownList;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_rolesDDl']/option[1]")
 WebElement roles1;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_rolesDDl']/option[2]")
 WebElement roles2;
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_RegisterUser_CreateUserStepContainer_RCB_organization']")
 WebElement organizationButton;
 @FindBy(xpath = ".//*[contains(text(),'קופת חולים כללית')]")
 WebElement organizationDropDown;
 @FindBy(xpath = ".//*[@class='rddtIcon']")
 WebElement radioIconButton;
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput']")
 WebElement dateInputField;
 @FindBy(xpath = ".//*[@id='ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_CalendarPopupButton']")
 WebElement calendarPopupButton;
 @FindBy(xpath = ".//*[@class='rcFastNext']")
 WebElement calendarFastNextButton;
 @FindBy(xpath = ".//*[@class='rcNext']")
 WebElement calendarNextButton;
 @FindBy(xpath = ".//*[@class='rcFastPrev']")
 WebElement calendarFastPrevButton;
 @FindBy(xpath = ".//*[@class='rcPrev']")
 WebElement calendarPrevButton;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt']")
 WebElement personalIdField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt']")
 WebElement contactCellField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt']")
 WebElement contactPhoneField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_AddressTxt']")
 WebElement addressField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt']")
 WebElement houseNumberField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_CityTxt']")
 WebElement cityField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_CountryTxt']")
 WebElement countryNameField;
 @FindBy(xpath = ".//*[@id='MainContent_RegisterUser_CreateUserStepContainer_ZipCodeTxt']")
 WebElement zipCodeField;
 @FindBy(xpath = ".//*[@id='MainContent_AddNewUser'][contains(text(),'שמור')]']")
 WebElement addNewUserButton;
 @FindBy(xpath = ".//*[@id='MainContent_cancel']")
 WebElement cancelButton;

  public ClinicManagementPage openClinicManagementPage(WebDriver driver){
   driver.get(PAGE_URL);
   return this;
   }

  public ClinicManagementPage openClinicManagementPage(WebDriver driver, String baseUrl) {
  driver.get(PAGE_URL);
  return this;
 }

  public ClinicManagementPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Accounts.aspx";
        PageFactory.initElements(driver, this);
    }
 public ClinicManagementPage waitUntilClinicManagementPageIsLoaded() {
  try {
   waitUntilElementIsLoaded(clinicManagementButton);
  } catch (IOException e) {
   e.printStackTrace();
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
  return this;
 }
 public ClinicManagementPage clickOnClinicManagementPageButton() {
  clickElement(clinicManagementButton);
  return this;
 }
 public  ClinicManagementPage fillUsernameField(String text){
  setElementText(userNameField,text);
  return this;
 }
 //עריכת פרטי הקליניקה

 public ClinicManagementPage fillClinicNameField(String text) {
  setElementText(clinicNameField, text);
  return this;
 }


 public ClinicManagementPage fillClinicPhoneField(String text) {
  setElementText(clinicPhoneField, text);
  return this;
 }
 //משתמשים פנימיים בקליניקה
 //AddNewUser
 public ClinicManagementPage clickOnCreateNewUserButton() {
  clickElement(createNewUserButton);
  return this;
 }
 public ClinicManagementPage fillUserNameLabelField(String text) {
  setElementText(userNameField, text);
  return this;
 }
 public ClinicManagementPage fillFirstNameField(String text) {
  setElementText(firstNameField, text);
  return this;
 }

 public ClinicManagementPage fillLastNameField(String text) {
  setElementText(lastNameField, text);
  return this;
 }
 public ClinicManagementPage clickOnClinicLabelDropDownList() {
  clickElement(clinicLabelDropDownList);
  return this;
 }
 public ClinicManagementPage chooseClinicLabelDropDownList(){
  clickElement(clinicLabelDropDownList);
  return  this;
 }
 public ClinicManagementPage fillEmailLabelField(String text) {
  setElementText(emailLabelField, text);
  return this;
 }

 public ClinicManagementPage fillPasswordLabelField(String text) {
  setElementText(passwordLabelField, text);
  return this;
 }
 public ClinicManagementPage fillPasswordRequiredField(String text) {
  setElementText(passwordRequiredField, text);
  return this;
 }
 public ClinicManagementPage fillconfirmPasswordField(String text) {
  setElementText(confirmPasswordField, text) ;
  return this;
 }
 public ClinicManagementPage clickOnRolesDropDownList(){
  clickElement(rolesDropDownList);
  return this;
 }
 public ClinicManagementPage chooseFromRolesDropDownList(){
  clickElement(roles2);
  return this;
 }

 public ClinicManagementPage fillDateInputField(String text) {
  setElementText(dateInputField, text);
  return this;
 }
 public ClinicManagementPage clickOnCalendarPopupButton(){
  clickElement(calendarPopupButton);
  return this;
 }

 public ClinicManagementPage fillPersonalIdField(String text) {
  setElementText(personalIdField, text);
  return this;
 }
 public ClinicManagementPage fillContactCellField(String text) {
  setElementText(contactCellField, text);
  return this;
 }
 public ClinicManagementPage fillContactPhoneField(String text) {
  setElementText(contactPhoneField, text);
  return this;
 }
 public ClinicManagementPage fillAddressField(String text) {
  setElementText(addressField, text);
  return this;
 }
 public ClinicManagementPage fillHouseNumberField(String text) {
  setElementText(houseNumberField, text);
  return this;
 }
 public ClinicManagementPage fillCityField(String text) {
  setElementText(cityField, text);
  return this;
 }
 public ClinicManagementPage fillCountryNameField(String text) {
  setElementText(countryNameField, text);
  return this;
 }
 public ClinicManagementPage fillZipCodeField(String text) {
  setElementText(zipCodeField, text);
  return this;
 }
 public ClinicManagementPage clickOnAddNewUserButton() {
  clickElement(addNewUserButton);
  return this;
 }
 public ClinicManagementPage clickOnCancelButton() {
  clickElement(cancelButton);
  return this;
 }
//OptionalQuestionnaire
 public ClinicManagementPage clickOnOptionalQuestionnaireButton() {
  clickElement(optionalQuestionnaireButton);
  return this;
 }
 public ClinicManagementPage  clickOnOrganizationFieldIconButton() {
  clickElement( organizationFieldIconButton);
  return this;
 }

 public ClinicManagementPage chooseOrganizationsDropDownList(){
  clickElement(organizationsDropDownList);
  return  this;
 }
 public ClinicManagementPage clickOnDomainsInputFiled() {
  clickElement(domainsInputFiled);
  return this;
 }
 public ClinicManagementPage clickOnDomainsArrowButton() {
  clickElement(domainsArrowButton);
  return this;
 }
 public ClinicManagementPage clickOnDomainsDropDownList() {
  clickElement(domainsDropDownList);
  return this;
 }
  public ClinicManagementPage clickOnClinicsArrowButton(){
   clickElement(clinicsArrowButton);
   return  this;
}

 public ClinicManagementPage clickOnClinicsTypeDropDownList(){
  clickElement(clinicTypeDropDownList);
  return  this;
 }

 public ClinicManagementPage clickOnClinicsSubRolesArrowbutton(){
  clickElement(subRolesArrowbutton);
  return  this;
 }
 public ClinicManagementPage clickOnClinicsSubRolesDropDownList(){
  clickElement(subRolesDropDownList);
  return  this;
 }


 public ClinicManagementPage clickOnSearchButton(){
  clickElement(searchButton);
  return  this;
 }

 public ClinicManagementPage clickOnAddNewUsersButton(){
  clickElement(addNewUsersButton);
  return this;
 }
 public ClinicManagementPage fillClinicAddressField(String text) {
  setElementText(clinicAddressField, text);
  return this;
 }

 public ClinicManagementPage clickOnClinicEditButton() {
  clickElement(editButton);
  return this;
 }


 public ClinicManagementPage clickOnClinicEditInformationButton() {
  clickElement(clinicEditInformationButton);
  return this;
 }


 public void clickElement(WebElement element) {
  // Log.info("clicking on element " + element + "");
  element.click();
 }

 public boolean isOnClinicManagementPage() {

  return exists(addNewUserButton);
 }

 public boolean alertMessageNotValidPassword() {
  return exists(passwordLabelField);
 }
}

