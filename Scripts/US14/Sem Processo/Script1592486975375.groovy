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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:5001/')

WebUI.setText(findTestObject('US14/Page_Login - PMVIZ/input_Username_username'), 'katalon4')

WebUI.setEncryptedText(findTestObject('US14/Page_Login - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('US14/Page_Login - PMVIZ/input_Password_password'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('US1/Page_Login - PMVIZ/button_Log In'))

WebUI.click(findTestObject('US14/Page_Home Page - PMVIZ/a_Minhas Estatsticas'))

WebUI.verifyElementPresent(findTestObject('US15/Page_Minhas Estatsticas - PMVIZ/div_No processes associated to user katalon4'), 
    0)

WebUI.closeBrowser()

