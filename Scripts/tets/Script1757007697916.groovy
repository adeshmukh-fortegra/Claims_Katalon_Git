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

WebUI.navigateToUrl('https://claimsportal.qa.priv.life-south.com/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/Page_Fortegra Portal Login/input_Login_UserName'), 'ClaimsPortalTester03')

WebUI.click(findTestObject('Object Repository/Page_Fortegra Portal Login/h3_Welcome to the Fortegra Portal'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fortegra Portal Login/input_Login_Password'), 'Tod/hhTl8RmNl3+/R04ZhD4OMDeTVWHr')

WebUI.click(findTestObject('Object Repository/Page_Fortegra Portal Login/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/h3_Manage Claims'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/a_New Claim Submission'))

WebUI.setText(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_First Name_FirstName'), 'sara')

WebUI.setText(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_Last Name_LastName'), 'barefield')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_New Claim Submission - Claims/select_-- Select One --                    _5f28c5'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_Incurred Date_IncurredDate'), '03/04/2022')

WebUI.setText(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_Certificate Effective Date_CertEffectiveDate'), 
    '02/15/2022')

WebUI.click(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_ADD Type_btnLoadSearchResults'))

WebUI.click(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_In Force_btnreq'))

WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Claimant Address Line 1_Address1'), '13364 beach blvd')

WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Payment Due Day (1-31) only_Due_Day'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Claimant Address Line 2_Address2'), '606')

WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_City_City'), 'jacksonville')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Claim Request - Claims/select_StateALAKAZARCACOCTDEFLGAHIIDILINIAK_15a435'), 
    'FL', true)

WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Zip_Zip'), '32224')

WebUI.click(findTestObject('Object Repository/Page_Claim Request - Claims/input_Back to Search Certificate_lnknextInf_1ad4e4'))

WebUI.closeBrowser()

