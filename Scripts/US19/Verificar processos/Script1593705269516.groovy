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

WebUI.setText(findTestObject('US19/Page_Login - PMVIZ/input_Username_username'), 'administrator')

WebUI.setEncryptedText(findTestObject('US19/Page_Login - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('US19/Page_Login - PMVIZ/button_Log In'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('US19/Page_Home Page - PMVIZ/span_Grafo Freq e Desemp'))

WebUI.click(findTestObject('Object Repository/US19/Page_Freq Perf Graph - PMVIZ/button_Escolha um processo'))

WebUI.click(findTestObject('Object Repository/US19/Page_Freq Perf Graph - PMVIZ/span_ProcessoMaio'))

WebUI.verifyElementPresent(findTestObject('Object Repository/US19/Page_Freq Perf Graph - PMVIZ/select_Escolha um processo                 _07960d'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(12321321123)

WebUI.closeBrowser()

