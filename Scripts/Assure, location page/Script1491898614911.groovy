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

WebUI.setText(findTestObject('location page (min data)/Page_z2data. Login/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('location page (min data)/Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('location page (min data)/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('location page (min data)/Page_Z2DATA Web Administration/a_Data Manager'))

WebUI.click(findTestObject('location page (min data)/Page_Z2DATA Web Administration/a_Locations'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/CompanyLocationsViews.aspx?CompanyLocationId=1000376')

WebUI.setText(findTestObject('location page (min data)/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLocation'), 
    'nada')

WebUI.selectOptionByValue(findTestObject('location page (min data)/Page_Z2DATA Web Administration (2)/select_ctl00cph1CompanyLocatio'), 
    '180', true)

WebUI.click(findTestObject('location page (min data)/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLocation (1)'))

WebUI.setText(findTestObject('location page (min data)/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLocation (2)'), 
    'ultrasound')

WebUI.selectOptionByValue(findTestObject('location page (min data)/Page_Z2DATA Web Administration (2)/select_ctl00cph1CompanyLocatio (1)'), 
    '46', true)

WebUI.click(findTestObject('location page (min data)/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLocation (3)'))

WebUI.setText(findTestObject('location page (min data)/Page_Z2DATA Web Administration (2)/input_ctl00cph1CompanyLocation (4)'), 
    'giza')

WebUI.click(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/td'))

not_run: WebUI.focus(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/input_ctl00cph1CompanyLocation (2)'))

WebUI.selectOptionByValue(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/input_ctl00cph1CompanyLocation (2)'), 
    '31', true)

WebUI.setText(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/input_ctl00cph1CompanyLocation'), 
    '02')

WebUI.setText(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/input_ctl00cph1CompanyLocation (1)'), 
    'http://www.sec.com')

WebUI.click(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/input_ctl00cph1CompanyLocation (2)'))

WebUI.setText(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/input_ctl00cph1CompanyLocation (3)'), 
    '22')

WebUI.selectOptionByValue(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/select_ctl00cph1CompanyLocatio (1)'), 
    '731', true)

WebUI.setText(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/input_ctl00cph1CompanyLocation (4)'), 
    'gggggggggggggg')

WebUI.setText(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/input_ctl00cph1CompanyLocation (5)'), 
    'haram')

WebUI.click(findTestObject('location page (min data)/Page_Z2DATA Web Administration (3)/input_ctl00cph1CompanyLocation (6)'))

