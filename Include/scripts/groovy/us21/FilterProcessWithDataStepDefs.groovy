package us21
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



class FilterProcessWithDataStepDefs {
	@Then("I see that at least one mold, one activity and one operator on the selects of process filter")
	public void i_see_that_at_least_one_mold_one_activity_and_one_Operator_on_the_selects_of_process_filter() {
		WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/div_Nenhum molde selecionado'))

		WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/a_mouldA'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/select_mouldAmouldBmouldCmouldD'), 0, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/div_Nenhuma atividade selecionada'))

		WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/span_Desenho Molde'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/select_Desenho MoldePreparar MateriaisTaggi_6b1cb5'),
				0, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/div_Nenhuma operador selecionado'))

		WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/a_denver'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/select_denverlisboanairobitokyouser1'), 0,
				FailureHandling.STOP_ON_FAILURE)

		WebUI.closeBrowser()
	}
}