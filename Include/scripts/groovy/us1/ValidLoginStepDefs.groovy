package us1
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



class ValidLoginStepDefs {
	@Given("I want to login")
	public void i_want_to_login() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://localhost:44364/')
	}

	@When("I insert a valid username")
	public void i_insert_a_valid_username() {
		WebUI.setText(findTestObject('Object Repository/US1/Page_Login - PMVIZ/input_Username_username'), 'tokyo')
	}

	@When("I insert a valid password")
	public void i_insert_a_valid_password() {
		WebUI.setEncryptedText(findTestObject('Object Repository/US1/Page_Login - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		WebUI.click(findTestObject('Object Repository/US1/Page_Login - PMVIZ/button_Log In'))
	}

	@Then("I successfully login")
	public void i_successfully_login() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/US1/Page_Home Page - PMVIZ/h4_Home'), 0)

		WebUI.closeBrowser()
	}
}