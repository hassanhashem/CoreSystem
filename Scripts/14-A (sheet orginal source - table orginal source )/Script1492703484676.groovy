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

WebUI.setText(findTestObject('14A (SHeet orginal source- table orginal source-show selected data )/Page_z2data. Login/input_LoginFormUserName'), 
    'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('14A (SHeet orginal source- table orginal source-show selected data )/Page_z2data. Login/input_LoginFormPassword'), 
    'P@ssw0rd@2017')

WebUI.click(findTestObject('14A (SHeet orginal source- table orginal source-show selected data )/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('14A (SHeet orginal source- table orginal source-show selected data )/Page_Z2DATA Web Administration/a_FINANCIAL DATA'))

WebUI.click(findTestObject('14A (SHeet orginal source- table orginal source-show selected data )/Page_Z2DATA Web Administration (1)/a_Financial status'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/NonFinancialRawData.aspx?S=555765449')

WebUI.click(findTestObject('14A (SHeet orginal source- table orginal source-show selected data )/Page_Z2DATA Web Administration (2)/a_Table Original Source'))

WebUI.click(findTestObject('14A (SHeet orginal source- table orginal source-show selected data )/Page_Z2DATA Web Administration (2)/a_Sheet Original Source'))

