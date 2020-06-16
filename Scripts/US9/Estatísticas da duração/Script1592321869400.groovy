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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.junit.Test as Test
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.support.ui.Select as Select

WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:44364/')

WebUI.setText(findTestObject('Page_Login - PMVIZ/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Login - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')

WebUI.sendKeys(findTestObject('Page_Login - PMVIZ/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Home Page - PMVIZ/span_Processes and Statistics'))

WebUI.click(findTestObject('Page_All Processes - PMVIZ/button_Resources'))

WebUI.click(findTestObject('Page_Resources Statistics - PMVIZ/input_Choose the type of resource_typeR'))

new Select(WebUiCommonHelper.findWebElement(findTestObject('Object Repository/US9/Page_Resources Statistics - PMVIZ/select_Choose an activity                  _a0481f'), 
    2)).selectByValue('1')

WebUI.verifyElementPresent(findTestObject('US9/Page_Resources Statistics - PMVIZ/divchart'), 0)

WebUI.closeBrowser()

