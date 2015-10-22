package com.linkcare.pages;

/**
 * Created by alex on 28/05/2015.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;


public class ClinicAdminPage extends Page {

    //Sort Buttons
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[contains(text(),\"מס' קליניקה\")]")
    WebElement clinicIdSortButton;

    @FindBy (xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[contains(text(),'שם קליניקה')]")
    WebElement clinicNameSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[contains(text(),\"כתובת הקליניקה\")]")
	WebElement clinicAddressSortButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[contains(text(),\"שם הארגון\")]")
	WebElement organizationNameSortButton;

    //FilterFields
	@FindBy(id="ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_clinic_id")
	WebElement clinicIdFilterField;

	@FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_clinic_name")
	WebElement clinicNameFilterField;

    @FindBy(id="ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_clinic_address")
    WebElement clinicAddressFilterField;

    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_org_name")
    WebElement organizationNameFilterField;

    //FilterButtons

    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_clinic_id")
    WebElement clinicIdFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_clinic_name")
    WebElement clinicNameFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_clinic_address")
    WebElement clinicAddressFilterButton;

    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_org_name")
    WebElement organizationNameFilterButton;

    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'NoFilter')]")
    WebElement noFilterButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'Contains')]")
    WebElement containsButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'StartsWith')]")
    WebElement startsWithButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'EqualTo')]")
    WebElement equalToButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'GreaterThan')]")
    WebElement greaterThanButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'LessThan')]")
    WebElement lessThanButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'IsEmpty')]")
    WebElement isEmptyButton;
    @FindBy(xpath = "//div[@id='ctl00_MainContent_RadGrid1_rfltMenu_detached']//li//*[contains(text(),'NotIsEmpty')]")
    WebElement notIsEmptyButton;

    //add new clinic
    @FindBy(id = "MainContent_AddNewItem")
    WebElement addNewClinicButton;

    @FindBy(id = "MainContent_ItemLinkButton2")
    WebElement addNewClinicButton2;

    @FindBy(id = "ctl00_MainContent_rwAddClinic_C_tbClinicName")
    WebElement clinicNameField;

    @FindBy(id = "ctl00_MainContent_rwAddClinic_C_TB_OrgName")
    WebElement organizationName;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_rwAddClinic_C']//tr[2]/td[2]/input[2]")
    WebElement chooseOrgButton;

    @FindBy(id = "ctl00_MainContent_rwAddClinic_C_SaveClinic")
    WebElement proceedButton;

    @FindBy(id = "ctl00_MainContent_rwAddClinic_C_tbClinicPhone")
    WebElement clinicPhoneFiled;

    @FindBy(id = "ctl00_MainContent_rwAddClinic_C_tbClinicAddress")
    WebElement clinicAddressFiled;

   //choose organization type dialog window
    @FindBy(id = "selectOrg")
    WebElement selectButton;

    @FindBy(xpath = "//*[@id='TreeView1']//span[contains(text(),\"רופאים פרטיים\")]")
    WebElement privateDoctorsButton;

    @FindBy(xpath = "//*[@id='TreeView1']//span[contains(text(),\"קופת חולים כללית\")]")
    WebElement publicClinicButton;
    //end

    @FindBy(xpath = "//*[@id='form1']//div[2]/input[5]")
    WebElement chooseManagerOrgButton;

    @FindBy(xpath = "//*[@id='form1']//div[2]/input[7]")
    WebElement chooseOrgButton2;

	@FindBy(id ="MainContent_SaveData")
	WebElement saveButton;

    @FindBy(id = "MainContent_tbClinicAdminName")
    WebElement managerName;

    @FindBy(id = "MainContent_TB_OrgName")
    WebElement organizationName2;

//create user-manager dialog window
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement usernameField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement emailField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement passwordField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement confirmPassField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstNameField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastNameField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement teudatField;

    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement birthDateField ;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
    WebElement mobilePhoneField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt")
    WebElement phoneField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_AddressTxt")
    WebElement streetNameField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
    WebElement houseNumberField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
    WebElement cityField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_StateTxt")
    WebElement stateField;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CountryTxt")
    WebElement countryField;

	@FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ZipCodeTxt")
	WebElement zipCodeField;

	@FindBy(id = "MainContent_AddNewUser")
	WebElement addNewUserButton;

	@FindBy(id = "MainContent_cancel")
	WebElement cancelButton;
    //end



    public ClinicAdminPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/clinics.aspx";
        PageFactory.initElements(driver, this);
    }

    public ClinicAdminPage openClinicPage(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }

    public ClinicAdminPage openClinicPage(WebDriver driver, String baseUrl) {
        driver.get(PAGE_URL);
        return this;
    }

    public ClinicAdminPage waitUntilClinicPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(clinicIdSortButton);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    //click sortbuttons
      public ClinicAdminPage clickToSortById() {
        clickElement(clinicIdSortButton);
        return this;
    }
    public ClinicAdminPage clickToSortByName() {
        clickElement(clinicNameSortButton);
        return this;
    }
    public ClinicAdminPage clickToSortByAddress() {
        clickElement(clinicAddressSortButton);
        return this;
    }
    public ClinicAdminPage clickToSortByOrgName() {
        clickElement(organizationNameSortButton);
        return this;
    }
    //fill filter fields
    public ClinicAdminPage fillIdFilterField(String text) {
    setElementText(clinicIdFilterField, text);
    return this;
}
    public ClinicAdminPage fillNameFilterField(String text) {
        setElementText(clinicNameFilterField, text);
        return this;
    }
    public ClinicAdminPage fillAddressFilterField(String text) {
        setElementText(clinicAddressFilterField, text);
        return this;
    }
    public ClinicAdminPage fillOrgNameFilterField(String text) {
        setElementText(organizationNameFilterField, text);
        return this;
    }

    //click filter buttons
    public ClinicAdminPage clickIdFilterButton(){
        clickElement(clinicIdFilterButton);
        return this;
    }
    public ClinicAdminPage clickNameFilterButton(){
        clickElement(clinicNameFilterButton);
        return this;
    }
    public ClinicAdminPage clickAddressFilterButton(){
        clickElement(clinicAddressFilterButton);
        return this;
    }
    public ClinicAdminPage clickOrgNameFilterButton(){
        clickElement(organizationNameFilterButton);
        return this;
    }
    //choose filter buttons
    public ClinicAdminPage chooseNoFilterButton(){
        clickElement(noFilterButton);
        return  this;
    }
    public ClinicAdminPage chooseContainsFilterButton(){
        clickElement(containsButton);
        return  this;
    }
    public ClinicAdminPage chooseStartsWithFilterButton(){
        clickElement(startsWithButton);
        return  this;
    }
    public ClinicAdminPage chooseEqualsToFilterButton(){
        clickElement(equalToButton);
        return  this;
    }
    public ClinicAdminPage chooseGreaterThanFilterButton(){
        clickElement(greaterThanButton);
        return  this;
    }
    public ClinicAdminPage chooseLessThanButton(){
        clickElement(lessThanButton);
        return  this;
    }
    public ClinicAdminPage chooseIsEmptyFilterButton(){
        clickElement(isEmptyButton);
        return  this;
    }
    public ClinicAdminPage chooseNotIsEmptyFilterButton(){
        clickElement(notIsEmptyButton);
        return  this;
    }

    //dinamic elements
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00__0']/td[1]")
	WebElement clinicaIdFirstRow;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00__0']/td[1]")
    WebElement clinicaIdSecondRow;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']/tbody")
    WebElement filteredTable;

    //*[@id='ctl00_MainContent_RadGrid1_ctl00']/tbody
    public ClinicAdminPage chooseClinicIdRow (String row) {

    WebElement element = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_RadGrid1_ctl00__" + row + "']/td[1]"));
    return this;
    }

    public ClinicAdminPage checkClinicNameFilter (String filterText) {
        fillNameFilterField (filterText);
        clinicNameFilterField.sendKeys(Keys.ENTER);
        waitUntilIsLoaded(filteredTable);
        List<WebElement> rows = filteredTable.findElements(By.tagName("tr"));
        java.util.Iterator<WebElement> i = rows.iterator();
        while(i.hasNext()) {
            WebElement row = i.next();
            WebElement clinicName = (WebElement) row.findElements(By.xpath("/td[2]"));
            String clinicText = clinicName.getText();
            Assert.assertEquals(clinicText.substring(0, 1),"a","Not all Clinic Names, for example " +clinicText+ " begins with " +filterText+"");
        }
        return this;
    }


    public ClinicAdminPage chooseOrganization(String name) {

        WebElement element = driver.findElement(By.xpath("//*[@id='TreeView1']//span[contains(text(),'" + name + "')]"));
        element.click();
        return this;
    }

    public ClinicAdminPage clickToSelectOrg() {
        clickElement(selectButton);
        return this;
    }

    public ClinicAdminPage fillClinicName(String text) {
        setElementText(clinicNameField, text);
        return this;
    }

    public ClinicAdminPage fillClinicPhone(String text) {
        setElementText(clinicPhoneFiled, text);
        return this;
    }

    public ClinicAdminPage fillClinicAddress(String text) {
        setElementText(clinicAddressFiled, text);
        return this;
    }

    public ClinicAdminPage clickToProceed() {
        clickElement(proceedButton);
        return this;
    }

    public boolean isOnClinicPage() {
        waitUntilClinicPageIsLoaded();
        return exists(clinicIdSortButton);
    }

    public ClinicAdminPage fillEmailField(String email) {
        setElementText(usernameField, email);
        return this;
    }

    public ClinicAdminPage fillPasswordField(String password) {
        setElementText(passwordField, password);
        return this;
    }

}