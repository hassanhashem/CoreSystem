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

WebUI.setText(findTestObject('premapping (mangment feature)/Page_z2data. Login/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('premapping (mangment feature)/Page_z2data. Login/input_LoginFormPassword'), 'P')

WebUI.setText(findTestObject('premapping (mangment feature)/Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('premapping (mangment feature)/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration/a_Data Manager'))

WebUI.click(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (1)/a_Pre Mapping'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/FinancialMapping/CompanyPreNonMapping.aspx?CompanyID=1000376&Type=1200100000&FillingDate=1/6/2017%2012:00:00%20AM&PeriodType=43')

WebUI.click(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (2)/a_Edit'))

WebUI.click(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/button_Statement Action'))

WebUI.click(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/button_Add New Person'))

WebUI.setText(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/input_txtTitle'), 'radwa')

WebUI.setText(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/input_txtAge'), '44')

WebUI.click(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/div_tt-suggestion tt-cursor'))

WebUI.setText(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/input_txtPerson1'), 'E. C. Sykes')

WebUI.selectOptionByValue(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/select_ddlPosition1'), 
    '886', true)

WebUI.selectOptionByValue(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/select_ddlTitle1'), 
    '41905', true)

WebUI.selectOptionByValue(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/select_ddlGender'), 
    '290', true)

WebUI.selectOptionByValue(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/select_ddtStatus1'), 
    '1013', true)

WebUI.click(findTestObject('premapping (mangment feature)/Page_Z2DATA Web Administration (3)/button_Save'))

