import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:44364/')

WebUI.setText(findTestObject('Page_Login - PMVIZ/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Login - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Login - PMVIZ/button_Log In'))

WebUI.click(findTestObject('Page_Home Page - PMVIZ/a_Grafo Conformidade'))

WebUI.click(findTestObject('Object Repository/US21/Page_Grafo de Conformidade - PMVIZ/input_O threshold tm que estar entre 0 e 1_filter'))

WebUI.click(findTestObject('Page_Grafo de Conformidade - PMVIZ/div_Escolha o processo'))

WebUI.click(findTestObject('Page_Grafo de Conformidade - PMVIZ/a_ProcessoDemo1'))

WebUI.selectOptionByValue(findTestObject('Page_Grafo de Conformidade - PMVIZ/select_Escolha o processo                  _67bf3e'), 
    '25', true)

WebUI.verifyElementPresent(findTestObject('Page_Grafo de Conformidade - PMVIZ/h4_Processo de referncia ProcessoDemo1'), 
    0)

WebUI.closeBrowser()

