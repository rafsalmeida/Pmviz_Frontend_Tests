package us14
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



class NoProcessesStepDefs {
	@Given("I am logged in as an operator that has no processes")
	public void i_am_logged_in_as_an_operator_that_has_no_processes() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://localhost:44364/')

		WebUI.setText(findTestObject('US14/Page_Login - PMVIZ/input_Username_username'), 'katalon4')

		WebUI.setEncryptedText(findTestObject('US14/Page_Login - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')

		WebUI.click(findTestObject('US1/Page_Login - PMVIZ/button_Log In'))
	}

	@Then("I see there are no processes associated")
	public void i_see_there_are_no_processes_associated() {
		WebUI.click(findTestObject('Object Repository/US14/Page_Minhas Estatsticas - PMVIZ/div_No processes associated to user katalon4'))

		WebUI.closeBrowser()
	}
}