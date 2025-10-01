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

CustomKeywords.'claimsportalkeywordpkg.WebUIKeywords.LoginClaimsPortal'(UserName, Pasword)

CustomKeywords.'claimsportalkeywordpkg.WebUIKeywords.NewClaimsSearch'()

CustomKeywords.'claimsportalkeywordpkg.WebUIKeywords.FillClaimsDetails'(address1,address2,city,state,Zip,email,Duedt)

/*
WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Claimant Address Line 1_Address1'), address1)
WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Claimant Address Line 2_Address2'), address2)
WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_City_City'), city)
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Claim Request - Claims/select_StateALAKAZARCACOCTDEFLGAHIIDILINIAK_15a435'), state, true)
WebUI.setText(findTestObject('Page_Claim Request - Claims/input_Zip_Zip'), Zip)

WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Claimant Email_Claimant_Email'), email)
WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Payment Due Day (1-31) only_Due_Day'), Duedt)

WebUI.click(findTestObject('Object Repository/Page_Claim Request - Claims/input_Back to Search Certificate_lnknextInf_1ad4e4'))

*/



