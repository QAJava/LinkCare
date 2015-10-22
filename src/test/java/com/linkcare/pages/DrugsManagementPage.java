package com.linkcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Alex_P on 18/10/2015.
 */
public class DrugsManagementPage extends Page {

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']/thead/tr[1]/th[3]/span")
	WebElement Drugname;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']/thead/tr[1]/th[4]/span")
	WebElement HebDrugname;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']/thead/tr[1]/th[5]/span")
	WebElement EngDrugname;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']/thead/tr[1]/th[6]/span")
    WebElement Activeingred;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']/thead/tr[1]/th[7]/span")
	WebElement HebActiveingred;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']/thead/tr[1]/th[8]/span")
	WebElement EngActiveingred;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_Drugname")
	WebElement DrugnameFilterTextBox;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_HebDrugname")
    WebElement HebDrugnameFilterTextBox;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_EngDrugname")
    WebElement EngDrugnameFilterTextBox;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_Activeingred")
    WebElement ActiveingredFilterTextBox;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_HebActiveingred")
    WebElement HebActiveingredFilterTextBox;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_EngActiveingred")
    WebElement EngActiveingredFilterTextBox;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_Drugname")
    WebElement DrugnameFilter;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_HebDrugname")
    WebElement HebDrugnameFilter;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_EngDrugname")
    WebElement EngDrugnameFilter;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_Activeingred")
    WebElement ActiveingredFilter;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_HebActiveingred")
    WebElement HebActiveingredFilter;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_EngActiveingred")
    WebElement EngActiveingredFilter;

    public DrugsManagementPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Medication/TranslateMedication.aspx";
        PageFactory.initElements(driver,this);
    }

    public DrugsManagementPage openDrugsManagementPage(WebDriver driver){
        driver.get(PAGE_URL);
        return this;
    }

    public DrugsManagementPage waitUntilDrugManagementPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(Drugname);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }return this;
    }

}
