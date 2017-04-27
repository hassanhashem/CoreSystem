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

WebUI.navigateToUrl('http://dev.z2data.com/administration')

WebUI.setText(findTestObject('other data (change of control )/Page_z2data. Login/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('other data (change of control )/Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('other data (change of control )/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.click(findTestObject('other data (change of control )/Page_Z2DATA Web Administration/a_Data Manager'))

WebUI.click(findTestObject('other data (change of control )/Page_Z2DATA Web Administration (1)/a_Pre Mapping'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/FinancialMapping/CompanyPreNonMapping.aspx?CompanyID=1000376&Type=1200190000&FillingDate=1/6/2017%2012:00:00%20AM&PeriodType=43')

WebUI.click(findTestObject('other data (change of control )/Page_Z2DATA Web Administration (3)/a_Other Data'))

WebUI.click(findTestObject('other data (change of control )/Page_Z2DATA Web Administration (4)/a_Change of control'))

WebUI.selectOptionByValue(findTestObject('other data (change of control )/Page_Z2DATA Web Administration (4)/select_ddl_Persons'), 
    '7000631', true)

WebUI.selectOptionByValue(findTestObject('other data (change of control )/Page_Z2DATA Web Administration (4)/select_ddl_FeatureChg'), 
    '187159', true)

WebUI.setText(findTestObject('other data (change of control )/Page_Z2DATA Web Administration (4)/input_test'), '222')

