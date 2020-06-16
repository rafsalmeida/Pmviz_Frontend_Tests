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

WebUI.navigateToUrl('https://localhost:44364/')

WebUI.setText(findTestObject('Page_Login - PMVIZ/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Login - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')

WebUI.sendKeys(findTestObject('Page_Login - PMVIZ/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Home Page - PMVIZ/a_Processes and Statistics'))

WebUI.click(findTestObject('US9/Page_All Processes - PMVIZ/button_Resources_25'))

WebUI.click(findTestObject('US9/Page_Resources Statistics - PMVIZ/input_Choose the type of resource_typeR'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('US9/Page_Resources Statistics - PMVIZ/h6_Choose the activity'), 0)

WebUI.closeBrowser()

