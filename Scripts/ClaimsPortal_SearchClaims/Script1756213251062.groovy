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

WebUI.navigateToUrl(GlobalVariable.G_URL_QA)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Fortegra Portal Login/input_Login_UserName'), variable)

WebUI.click(findTestObject('Object Repository/Page_Fortegra Portal Login/h3_Welcome to the Fortegra Portal'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fortegra Portal Login/input_Login_Password'), Password)

WebUI.click(findTestObject('Object Repository/Page_Fortegra Portal Login/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/h3_Manage Claims'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/a_Claim Search'))

WebUI.setText(findTestObject('Object Repository/Page_Search Claims - Claims/input_First Name_FirstName'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page_Search Claims - Claims/input_Last Name_LastName'), LastName)

WebUI.setText(findTestObject('Object Repository/Page_Search Claims - Claims/input_Claim Number_ClaimNumber'), ClaimNumber)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Search Claims - Claims/select_ALLOPEN CLAIMCLOSED CLAIMDENIED CLAIM'), 
    'OPEN CLAIM', true)

WebUI.click(findTestObject('Object Repository/Page_Search Claims - Claims/input_Status Start Date_StatusDateStart'))

WebUI.click(findTestObject('Object Repository/Page_Search Claims - Claims/input_Status End Date_StatusDateEnd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Search Claims - Claims/select_ALLLIFEDISABILITYADDPROPERTYUNEMPLOYMENT'), 
    'DISABILITY', true)

WebUI.click(findTestObject('Object Repository/Page_Search Claims - Claims/input_Claim Type_btnLoadSearchResults'))

WebUI.closeBrowser()

