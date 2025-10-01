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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain as WebUIKeywordMain
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.G_URL_QA)

WebUI.setText(findTestObject('Object Repository/Page_Fortegra Portal Login/input_Login_UserName'), UserName)

WebUI.click(findTestObject('Object Repository/Page_Fortegra Portal Login/h3_Welcome to the Fortegra Portal'))

WebUI.setText(findTestObject('Object Repository/Page_Fortegra Portal Login/input_Login_Password'), Password)

WebUI.click(findTestObject('Object Repository/Page_Fortegra Portal Login/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/h2_Welcome to the Fortegra Portal'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/h2_Welcome to the Fortegra Portal'), 
    'Welcome to the Fortegra Portal')

WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/a_Edit My Profile'))

WebUI.click(findTestObject('Object Repository/Page_Manage Profile - Claims/a_Change your password'))

WebUI.setText(findTestObject('Object Repository/Page_Change Password - Claims/input_Current password_OldPassword'), Password)

WebUI.setText(findTestObject('Object Repository/Page_Change Password - Claims/input_New password_NewPassword'), Newpassword)

WebUI.setText(findTestObject('Object Repository/Page_Change Password - Claims/input_Confirm new password_ConfirmPassword'), 
    Newpassword)

WebUI.click(findTestObject('Object Repository/Page_Change Password - Claims/input_Confirm new password_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Change Password - Claims/li_Password must be at least 8 characters l_4242a6'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Change Password - Claims/li_Password must be at least 8 characters l_4242a6'), 
    'Password must be at least 8 characters long and include at least one uppercase letter, one lowercase letter, one digit, and one special character.')

WebUI.closeBrowser()

not_run: WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Change Password - Claims/li_The new password and confirmation passwo_1aaf89'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Manage Profile - Claims/p_Your password has been changed'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Profile - Claims/p_Your password has been changed'), 
    'Your password has been changed.')

not_run: WebUI.closeBrowser()

