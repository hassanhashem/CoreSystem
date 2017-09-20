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

WebUI.setText(findTestObject('litigation/Page_z2data. Login/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('litigation/Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('litigation/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('litigation/Page_Z2DATA Web Administration/a_Data Manager'))

WebUI.click(findTestObject('litigation/Page_Z2DATA Web Administration/a_Litigation Manager'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/CompanyLitigationDetails.aspx?CompanyLitigationId=1114469')

WebUI.click(findTestObject('litigation/Page_Z2DATA Web Administration (1)/input_btnAddNew'))

WebUI.setText(findTestObject('litigation/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLitigati'), 'ultrasound')

WebUI.click(findTestObject('litigation/Page_Z2DATA Web Administration (2)/div_tt-suggestion tt-cursor'))

WebUI.focus(findTestObject('litigation/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLitigati (1)'))

WebUI.setText(findTestObject('litigation/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLitigati (1)'), 'D. Blair Crump')

WebUI.click(findTestObject('litigation/Page_Z2DATA Web Administration (2)/button_Add'))

WebUI.click(findTestObject('litigation/Page_Z2DATA Web Administration (2)/div_tt-suggestion tt-cursor'))

WebUI.setText(findTestObject('litigation/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLitigati (2)'), 'APPL, Inc.')

WebUI.click(findTestObject('litigation/Page_Z2DATA Web Administration (2)/button_Add'))

WebUI.selectOptionByValue(findTestObject('litigation/Page_Z2DATA Web Administration (2)/select_ctl00cph1CompanyLitigat'), 
    '893', true)

WebUI.selectOptionByValue(findTestObject('litigation/Page_Z2DATA Web Administration (2)/select_ctl00cph1CompanyLitigat (1)'), 
    '189', true)

WebUI.click(findTestObject('litigation/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLitigati (3)'))

WebUI.click(findTestObject('litigation/Page_Z2DATA Web Administration (2)/div_5'))

WebUI.setText(findTestObject('litigation/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLitigati (4)'), '4/5/2017')

WebUI.setText(findTestObject('litigation/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLitigati (5)'), '4')

WebUI.setText(findTestObject('litigation/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLitigati (6)'), 'http://www.sec.com')

WebUI.click(findTestObject('litigation/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLitigati (7)'))

