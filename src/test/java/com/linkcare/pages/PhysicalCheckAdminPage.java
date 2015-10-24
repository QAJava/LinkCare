package com.linkcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by Roman on 20.10.2015.
 */
public class PhysicalCheckAdminPage extends Page {

	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl01_InsertButton_InsertCommandColumn")
	WebElement addRecordButton;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1']/table/tbody/tr[1]/td[2]/div/div")
	 WebElement editTemplate;

	//פרטי הבדיקה
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBEngText_Input")
	 WebElement englishField;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBEngText_Arrow")
	 WebElement englishFieldBtn;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBHeb_MaleText_Input")
	 WebElement maleHebrewField;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBHeb_MaleText_Arrow")
	 WebElement maleHebrewFieldBtn;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBHeb_FemaleText_Input")
	 WebElement femaleHebrewField;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBHeb_FemaleText_Arrow")
	WebElement femaleHebrewFieldBtn;

	//הוסף תשובות
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBAnsEngText_Input")
	WebElement answerEnglishField;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBAnsEngText_Arrow")
	WebElement answerEnglishBtn;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBAnsHeb_MaleText_Input")
	WebElement answerMaleHebrewField;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBAnsHeb_MaleText_Arrow")
	 WebElement answerMaleHebrewBtn;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBAnsHeb_FemaleText_Input")
	WebElement answerFemaleHebrewField;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCBAnsHeb_FemaleText_Arrow")
	WebElement answerFemaleHebrewBtn;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_CB_IsValid'][@type=\"checkbox\"]")
	WebElement validCheckbox;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCB_Gender_Input")
	WebElement genderField;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RCB_Gender_DropDown']/div/ul/li")
	WebElement genderDropdown;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_RCB_Age_Input")
	WebElement ageField;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RCB_Age_DropDown']/div/ul/li")
	WebElement ageDropdown;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_BtnAddAnswer_input")
	WebElement addAnswerButton;

	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_btnCancel_input")
	WebElement cancelButton;
	@FindBy(id = "ctl00_MainContent_RadTreeList1_ctl02_btnUpdate_input")
	WebElement insertButton;

	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RLBValidAns']/div")
	WebElement validAnswerSection;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RLBValidAns']/table/tbody/tr/td/a[1]")
	WebElement validAnswerMoveUp;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RLBValidAns']/table/tbody/tr/td/a[2]")
	WebElement validAnswerMoveDown;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RLBValidAns']/table/tbody/tr/td/a[3]")
	WebElement validAnswerDelete;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RLBNotValidAns']/div")
	WebElement notValidAnswerSection;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RLBNotValidAns']/table/tbody/tr/td/a[1]")
	WebElement notValidAnswerMoveUp;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RLBNotValidAns']/table/tbody/tr/td/a[2]")
	WebElement notValidAnswerMoveDown;
	@FindBy(xpath = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RLBNotValidAns']/table/tbody/tr/td/a[3]")
	WebElement notValidAnswerDelete;


	public PhysicalCheckAdminPage(WebDriver driver) {
		super(driver);
		this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/PhysicalReport.aspx";
		PageFactory.initElements(driver, this);
	}

	public PhysicalCheckAdminPage openPhysicalCheckPage(WebDriver driver) {
		driver.get(PAGE_URL);
		return this;
	}

	public PhysicalCheckAdminPage clickToAddRecord() {
		clickElement(addRecordButton);
		return this;
	}

	public PhysicalCheckAdminPage waitUntilNewRecordIsOpened() {
		try {
			waitUntilElementIsLoaded(insertButton);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}
	public PhysicalCheckAdminPage waitAddRecordButton() {
		try {
			waitUntilElementIsLoaded(addRecordButton);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

	//fill fields
	public PhysicalCheckAdminPage fillEnglishField(String text) {
		setElementText(englishField, text);
		return this;
	}

	public PhysicalCheckAdminPage fillMaleHebrewField(String text) {
		setElementText(maleHebrewField, text);
		return this;
	}

	public PhysicalCheckAdminPage fillFemaleHebrewField(String text) {
		setElementText(femaleHebrewField, text);
		return this;
	}

	public PhysicalCheckAdminPage fillAnswerEnglishField(String text) {
		setElementText(answerEnglishField, text);
		return this;
	}

	public PhysicalCheckAdminPage fillAnswerFemaleHebrewField(String text) {
		setElementText(answerFemaleHebrewField, text);
		return this;
	}

	public PhysicalCheckAdminPage fillAnswerMaleHebrewField(String text) {
		setElementText(answerMaleHebrewField, text);
		return this;
	}

	public PhysicalCheckAdminPage checkBoxSelected() {
		if (!validCheckbox.isSelected()) {
			clickElement(validCheckbox);
		}
		return this;
	}

	public PhysicalCheckAdminPage checkBoxNotSelected() {
		if (validCheckbox.isSelected()) {
			clickElement(validCheckbox);
		}
		return this;
	}

	public PhysicalCheckAdminPage chooseGenderByValue(String value) {
		String locator = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RCB_Gender_DropDown']/div/ul/li[" + value + "]";
		WebElement el = driver.findElement(By.xpath(locator));
		clickElement(el);
		return this;
	}

	public PhysicalCheckAdminPage chooseAgeByValue(String value) {
		String locator = "//*[@id='ctl00_MainContent_RadTreeList1_ctl02_RCB_Age_DropDown']/div/ul/li[" + value + "]";
		WebElement el = driver.findElement(By.xpath(locator));
		clickElement(el);
		return this;
	}

	public PhysicalCheckAdminPage clickToAddAnswerButton() {
		clickElement(addAnswerButton);
		return this;
	}
	public PhysicalCheckAdminPage clickToCancelButton() {
		clickElement(cancelButton);
		return this;
	}
	public PhysicalCheckAdminPage clickToInsertButton() {
		clickElement(insertButton);
		return this;
	}
	public Boolean insertButtonIsDisplayed(){
		return insertButton.isDisplayed() ;
	}
	public PhysicalCheckAdminPage waitMilliseconds(long millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

}