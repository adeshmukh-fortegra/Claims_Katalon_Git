package claimsportalkeywordpkg

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
public class WebUIKeywords {
	@Keyword

	def LoginClaimsPortal(String CP_UserName,String CP_Password) {

		WebUI.openBrowser('')
		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://claimsportal.qa.priv.life-south.com/Account/Login?ReturnUrl=%2F')

		WebUI.click(findTestObject('Object Repository/Page_Fortegra Portal Login/input_Login_UserName'))

		WebUI.setText(findTestObject('Object Repository/Page_Fortegra Portal Login/input_Login_UserName'), CP_UserName)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fortegra Portal Login/input_Login_Password'), CP_Password)

		WebUI.click(findTestObject('Object Repository/Page_Fortegra Portal Login/button_Submit'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/h2_Welcome to the Fortegra Portal'),0)
	}

	@Keyword

	def NewClaimsSearch() {


		WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/h3_Manage Claims'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/a_New Claim Submission'))

		WebUI.setText(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_First Name_FirstName'), 'Sara')

		WebUI.setText(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_Last Name_LastName'), 'barefield')

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_New Claim Submission - Claims/select_-- Select One --                    _5f28c5'),
				'2', true)

		WebUI.setText(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_Certificate Effective Date_CertEffectiveDate'),
				'02/15/2022')

		WebUI.setText(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_Incurred Date_IncurredDate'), '06/12/2023')

		WebUI.click(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_ADD Type_btnLoadSearchResults'))

		WebUI.click(findTestObject('Object Repository/Page_New Claim Submission - Claims/input_In Force_btnreq'))
	}



	@Keyword

	def FillClaimsDetails(String address1,String address2,String City,String State,String Zipcode,String C_email,Number Duedt) {
		
		WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Claimant Address Line 1_Address1'), address1)
		
		WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Claimant Address Line 2_Address2'), address2)
		
		WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_City_City'), City)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Claim Request - Claims/select_StateALAKAZARCACOCTDEFLGAHIIDILINIAK_15a435'), State, true)
		
		WebUI.setText(findTestObject('Page_Claim Request - Claims/input_Zip_Zip'), Zipcode)
		
		WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Claimant Email_Claimant_Email'), C_email)
		
		WebUI.setText(findTestObject('Object Repository/Page_Claim Request - Claims/input_Payment Due Day (1-31) only_Due_Day'), Duedt)
		
		WebUI.click(findTestObject('Object Repository/Page_Claim Request - Claims/input_Back to Search Certificate_lnknextInf_1ad4e4'))
		
		
		}

	@Keyword

	def NewClaimsUploadDoc() {


		WebUI.click(findTestObject('Object Repository/Page_Claim Request - Claims/a_Go to Upload Documents'), FailureHandling.STOP_ON_FAILURE)

		String projectPath = RunConfiguration.getProjectDir()

		println('Project Path: ' + projectPath)

		def testDataPath = RunConfiguration.getProjectDir() + '/Data Files/UploadingDocuments/Testingforuploaddoc.pdf'

		WebUI.scrollToElement(findTestObject('Page_Claim Request - Claims/div_SelectDrop file or document to upload'), 5)

		WebUI.uploadFile(findTestObject('Page_Claim Request - Claims/div_SelectDrop file or document to upload'), testDataPath)

		WebUI.delay(2)
	}


	@Keyword
	def NewClaimsUploadaddDoc() {


		WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/h3_Manage Claims'))

		WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/a_Claim Search'))

		WebUI.setText(findTestObject('Object Repository/Page_Search Claims - Claims/input_Claim Number_ClaimNumber'), '1000704')

		WebUI.click(findTestObject('Object Repository/Page_Search Claims - Claims/input_Claim Type_btnLoadSearchResults'))

		WebUI.click(findTestObject('Object Repository/Page_Search Claims - Claims/a_Details'))

		WebUI.click(findTestObject('Object Repository/Page_Claim Details - Claims/div_Claimant GRACIE _40f057'))

		WebUI.click(findTestObject('Object Repository/Page_Claim Details - Claims/input_Upload Summary_btnuploadmoredocs'))

		WebUI.click(findTestObject('Object Repository/Page_Claim Details - Claims/input_Upload Summary_btnuploadmoredocs'))

		WebUI.closeBrowser()
	}


	@Keyword
	def ClaimSearch() {
		WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/h3_Manage Claims'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/h3_Manage Claims'),10)
		WebUI.click(findTestObject('Object Repository/Page_Welcome to the Fortegra Portal - Claims/a_Claim Search'))
		WebUI.setText(findTestObject('Object Repository/Page_Search Claims - Claims/input_First Name_FirstName'), 'Gracie')
		WebUI.setText(findTestObject('Object Repository/Page_Search Claims - Claims/input_Last Name_LastName'), 'Burns')
		WebUI.setText(findTestObject('Object Repository/Page_Search Claims - Claims/input_Claim Number_ClaimNumber'), '')
		WebUI.click(findTestObject('Object Repository/Page_Search Claims - Claims/input_Claim Number_ClaimNumber'))
		WebUI.setText(findTestObject('Object Repository/Page_Search Claims - Claims/input_Claim Number_ClaimNumber'), '1000709')
		WebUI.click(findTestObject('Object Repository/Page_Search Claims - Claims/input_Claim Type_btnLoadSearchResults'))
		WebUI.click(findTestObject('Object Repository/Page_Search Claims - Claims/a_Details'))
	}
}
