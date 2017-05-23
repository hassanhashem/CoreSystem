import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dev.z2data.com/administration/login.aspx')

WebUI.setText(findTestObject('Vc tab/Page_z2data. Login/input_LoginFormUserName'), 'nada.mahmoud@z2data.com')

WebUI.setText(findTestObject('Vc tab/Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('Vc tab/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('Vc tab/Page_Z2DATA Web Administration/a_VC'))

WebUI.click(findTestObject('Vc tab/Page_Z2DATA Web Administration (1)/a_Pre Mapping'))

WebUI.click(findTestObject('Vc tab/Page_Z2DATA Web Administration (2)/span_Angel'))

WebUI.mouseOver(findTestObject('Vc tab/Page_Z2DATA Web Administration/a_VC'))

WebUI.click(findTestObject('Vc tab/Page_Z2DATA Web Administration (3)/a_VC Company Mapping'))

WebUI.verifyTextPresent('VC COMPANY MAPPING', true)

WebUI.mouseOver(findTestObject('Vc tab/Page_Z2DATA Web Administration/a_VC'))

WebUI.click(findTestObject('Vc tab/Page_Z2DATA Web Administration (5)/a_Funds Posting'))

WebUI.verifyTextPresent('Investor Funds', true)

WebUI.mouseOver(findTestObject('Vc tab/Page_Z2DATA Web Administration/a_VC'))

WebUI.click(findTestObject('Vc tab/Page_Z2DATA Web Administration (7)/a_Fund Mapping'))

WebUI.verifyTextPresent('Investor Funds', true)

WebUI.mouseOver(findTestObject('Vc tab/Page_Z2DATA Web Administration/a_VC'))

WebUI.click(findTestObject('Vc tab/Page_Z2DATA Web Administration (8)/a_Fund Round Posting'))

WebUI.verifyTextPresent('Startup Fund Round', true)

WebUI.mouseOver(findTestObject('Vc tab/Page_Z2DATA Web Administration/a_VC'))

WebUI.click(findTestObject('Vc tab/Page_Z2DATA Web Administration (10)/a_Fund Round Mapping'))

WebUI.verifyTextPresent('Fund Round Mapping', true)

WebUI.mouseOver(findTestObject('Vc tab/Page_Z2DATA Web Administration/a_VC'))

WebUI.click(findTestObject('Vc tab/Page_Z2DATA Web Administration (12)/a_Companies Fund Rounds'))

WebUI.mouseOver(findTestObject(null))

WebUI.click(findTestObject('Vc tab/Page_Z2DATA Web Administration (14)/a_Investors Funds'))

WebUI.mouseOver(findTestObject('Vc tab/Page_Z2DATA Web Administration/a_VC'))

WebUI.click(findTestObject('Vc tab/Page_Z2DATA Web Administration (16)/a_Investor Sectors And Regions'))

WebUI.verifyTextPresent('Investor Regions And Sectors', true)

