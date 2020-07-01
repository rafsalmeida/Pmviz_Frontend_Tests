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



class AccessLoginStepDefs {
	
	@Given("I want to access the login page")
	public void i_want_to_access_the_login_page() {
	    WebUI.openBrowser('')

		WebUI.navigateToUrl('https://localhost:44364/')
	}
	
	@When("I am in the register page")
	public void i_am_in_the_register_page() {
		WebUI.click(findTestObject('US2/Page_Home Page - PMVIZ/a_Criar Utilizadores'))

	}
	
	@When("I click on the Sign In button")
	public void i_click_on_the_Sign_In_button() {
	    WebUI.click(findTestObject('Object Repository/US2/Page_Register - PMVIZ/b_Sign In'))
	}
	
	@Then("I am redirected to the login page")
	public void i_am_redirected_to_the_login_page() {
	    WebUI.verifyElementPresent(findTestObject('Object Repository/US2/Page_Login - PMVIZ/p_Enter your email address and password to access'), 0)
		WebUI.closeBrowser()
		
	}
}