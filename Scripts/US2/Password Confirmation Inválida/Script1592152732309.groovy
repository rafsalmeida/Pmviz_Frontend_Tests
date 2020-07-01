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

WebUI.setText(findTestObject('Object Repository/US3/Page_Login - PMVIZ/input_Username_username'), 'administrator')

WebUI.setEncryptedText(findTestObject('Object Repository/US3/Page_Login - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/US3/Page_Login - PMVIZ/button_Log In'))

WebUI.click(findTestObject('US2/Page_Home Page - PMVIZ/a_Criar Utilizadores'))

WebUI.click(findTestObject('Object Repository/US2/Page_Login - PMVIZ/b_Sign Up'))

WebUI.setText(findTestObject('Object Repository/US2/Page_Register - PMVIZ/input_Username_username'), 'katalon3')

WebUI.setText(findTestObject('Object Repository/US2/Page_Register - PMVIZ/input_Name_name'), 'Katalon3')

WebUI.setText(findTestObject('Object Repository/US2/Page_Register - PMVIZ/input_Email address_email'), 'katalon3@mail.pt')

WebUI.selectOptionByValue(findTestObject('Object Repository/US2/Page_Register - PMVIZ/select_Administrator                       _f4dc89'), 
    'Requester', true)

WebUI.setEncryptedText(findTestObject('Object Repository/US2/Page_Register - PMVIZ/input_Password_password'), 'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/US2/Page_Register - PMVIZ/input_Confirm Password_confirmpassword'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/US2/Page_Register - PMVIZ/button_Sign Up'))

WebUI.verifyElementPresent(findTestObject('Object Repository/US2/Page_Register - PMVIZ/div_The password confirmation and the password dont match'), 
    0)

WebUI.closeBrowser()

