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

WebUI.setText(findTestObject('Object Repository/US21/Page_PMVIZ - Login/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/US21/Page_PMVIZ - Login/input_Password_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Home Page/span_Grafo Conformidade'))

WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/div_Escolha o processo'))

WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/span_ProcessoDemo1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/select_Escolha o processo                  _9b71c2'), 
    '25', true)

WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/div_Nenhum molde selecionado'))

WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/a_mouldA'))

WebUI.verifyElementPresent(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/select_mouldAmouldBmouldCmouldD'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/div_Nenhuma atividade selecionada'))

WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/a_Desenho Molde'))

WebUI.verifyElementPresent(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/select_Desenho MoldePreparar MateriaisTaggi_6b1cb5'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/div_Nenhuma operador selecionado'))

WebUI.click(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/a_denver'))

WebUI.verifyElementPresent(findTestObject('Object Repository/US21/Page_PMVIZ - Grafo de Conformidade/select_denverlisboanairobitokyouser1'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

