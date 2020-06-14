package us2
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ValidRegisterStepDefs {

	@Given("I want to register")
	public void i_want_to_register() {
	    WebUI.openBrowser('')

		WebUI.navigateToUrl('https://localhost:44364/')
	}
	
	@When("I insert a non existing username")
	public void i_insert_a_non_existing_username() {
	    WebUI.setText(findTestObject('Object Repository/US2/Page_Register - PMVIZ/input_Username_username'), 'katalon2')
	}
	
	@When("I insert a valid name")
	public void i_insert_a_valid_name() {
		WebUI.setText(findTestObject('Object Repository/US2/Page_Register - PMVIZ/input_Name_name'), 'Katalon2')
	}
	
	@When("I insert a valid email")
	public void i_insert_a_valid_email() {
	    WebUI.setText(findTestObject('Object Repository/US2/Page_Register - PMVIZ/input_Email address_email'), 'katalon2@mail.pt')
	}
	
	@When("I insert a valid role")
	public void i_insert_a_valid_role() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/US2/Page_Register - PMVIZ/select_Administrator                       _f4dc89'),'Requester', true)
	}
	
	@When("I insert a password")
	public void i_insert_a_password() {
	    WebUI.setEncryptedText(findTestObject('Object Repository/US2/Page_Register - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')
	}
	
	@When("I insert a valid password confirmation")
	public void i_insert_a_valid_password_confirmation() {
	    WebUI.setEncryptedText(findTestObject('Object Repository/US2/Page_Register - PMVIZ/input_Confirm Password_confirmpassword'),'iGDxf8hSRT4=')
	}
	
	
	@When("I click the register button")
	public void i_click_the_register_button() {
		WebUI.click(findTestObject('Object Repository/US2/Page_Register - PMVIZ/button_Sign Up'))
	}
	
	@Then("I successfully register")
	public void i_successfully_register() {

		WebUI.verifyElementPresent(findTestObject('US2/Page_Login - PMVIZ/p_Enter your email address and password to access'), 0)
		
		WebUI.closeBrowser()
	}
}