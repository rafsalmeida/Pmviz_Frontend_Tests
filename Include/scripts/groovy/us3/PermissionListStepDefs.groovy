package us3
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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.junit.Test as Test
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.support.ui.Select as Select
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



class PermissionListStepDefs {

	@Given("I am logged in as an administrator")
	public void i_am_logged_in_as_an_administrator() {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://localhost:44364/')
		
		WebUI.setText(findTestObject('Object Repository/US3/Page_Login - PMVIZ/input_Username_username'), 'administrator')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/US3/Page_Login - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')
		
		WebUI.click(findTestObject('Object Repository/US3/Page_Login - PMVIZ/button_Log In'))

	}
	
	@When("I click the Manage Access tab")
	public void i_click_the_Manage_Access_tab() {
	    WebUI.click(findTestObject('Object Repository/US3/Page_Home Page - PMVIZ/span_Manage Access'))

	}
	
	@When("I choose a role")
	public void i_choose_a_role() {
	    new Select(WebUiCommonHelper.findWebElement(findTestObject('US3/Page_Manage Access - PMVIZ/select_Choose a role                       _11b9c3'), 2)).selectByValue('Operador')

	}
	
	@Then("I see the list of permissions and restrictions")
	public void i_see_the_list_of_permissions_and_restrictions() {
		WebUI.verifyElementPresent(findTestObject('US3/Page_PMVIZ - Controlo de Acesso/label_Permitido'), 0)
		
		WebUI.verifyElementPresent(findTestObject('US3/Page_PMVIZ - Controlo de Acesso/label_Probido'), 0)
				
		WebUI.closeBrowser()

	}
}