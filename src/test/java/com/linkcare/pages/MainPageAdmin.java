package com.linkcare.pages;

/**
 * Created by alex on 28/05/2015.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPageAdmin extends Page {

	@FindBy(xpath = "//*[@id='ctl00_DisplayImportantLinks1_myMenu']//a[@class='rmLink rmRootLink rootItems selected']")
	 WebElement patientTab;




    //Tabs
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadTabStrip1']//span[contains(text(),'חיפוש מטופלים')]")
    WebElement searchPatients;


//Input Fields
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_FirstName']")
    WebElement firstNameFilterInputField;


    //Buttons

    @FindBy(xpath = "//*[@id='Top1_HeadLoginView_HeadLoginStatus']")
    WebElement logOutButton;



    public MainPageAdmin(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.PAGE_URL = baseUrl + "/home";

    }

    public MainPageAdmin openMainPage(WebDriver driver, String baseUrl) {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Tabs.aspx");
        return this;
    }



    // Waits until title of our 'What works' Panel appears on the screen
    public MainPageAdmin waitUntilMainPageIsLoaded() {
        waitUntilIsLoaded(logOutButton);
        return this;
    }


    public boolean isOnMainPage() {

        waitUntilMainPageIsLoaded();
        return exists(logOutButton);
    }

public MainPageAdmin openPatientsTab (){
    clickElement(patientTab);
    return this;
}

    public MainPageAdmin openSearchPatientsTab (){
        clickElement(searchPatients);
        return this;
    }

    public MainPageAdmin filterPatientsByFirstName (String name) {
        setElementText(firstNameFilterInputField,name);
        return this;
    }

    public boolean isLoggedIn() {

        return exists(logOutButton);
    }

    public MainPageAdmin logOut() {
        clickElement(logOutButton);
        return this;
    }



}