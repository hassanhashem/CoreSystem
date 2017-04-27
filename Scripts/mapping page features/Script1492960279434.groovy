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

WebUI.setText(findTestObject('Page_z2data. Login (2)/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('Page_z2data. Login (2)/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('Page_z2data. Login (2)/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('Page_Z2DATA Web Administration (5)/a_FINANCIAL DATA'))

WebUI.click(findTestObject('Page_Z2DATA Web Administration (6)/a_Pre Mapping'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/FinancialMapping/CompanyPreMapping.aspx?CompanyID=1000376&FillingDate=10/26/2011%2012:00:00%20AM&SourceID=230')

WebUI.click(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration/a_Edit'))

WebUI.click(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/a_Sign'))

not_run: WebUI.click(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/a_Pop Up'))

WebUI.focus(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/a_Add Item'))

WebUI.click(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/a_Add Item'))

WebUI.setText(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/input_form-control'), 'nona')

WebUI.setText(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/input_form-control (1)'), '1')

WebUI.setText(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/input_form-control (2)'), '2')

WebUI.setText(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/input_form-control (3)'), '1')

WebUI.selectOptionByValue(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/select_dllCurrency-1'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/select_dllCurrencyUnit-1'), 
    '41', true)

WebUI.click(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/button_Save'))

WebUI.click(findTestObject('pre mapping 1 (fin data)/Page_Z2DATA Web Administration (1)/a_Ignore'))

