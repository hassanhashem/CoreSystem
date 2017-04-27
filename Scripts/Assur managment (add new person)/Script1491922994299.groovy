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

WebUI.setText(findTestObject('managment (add new person)/Page_z2data. Login/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('managment (add new person)/Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('managment (add new person)/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('managment (add new person)/Page_Z2DATA Web Administration/a_Data Manager'))

WebUI.click(findTestObject('managment (add new person)/Page_Z2DATA Web Administration/a_Managements'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/ManagementsHome.aspx?CompanyRelationId=1000376')

WebUI.click(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/a_Add New Person'))

WebUI.setText(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/input_PersonName'), 'maged')

WebUI.selectOptionByValue(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/select_ddltype'), 
    '1017', true)

WebUI.click(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/button_Save'))

WebUI.click(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/div_tt-suggestion tt-cursor'))

WebUI.setText(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man'), 
    'maged')

WebUI.click(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (1)'))

WebUI.click(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/div_2'))

WebUI.setText(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (2)'), 
    '5/2/2017')

WebUI.selectOptionByValue(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/select_ctl00cph1Managements1Ma'), 
    '289', true)

WebUI.setText(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (3)'), 
    'http://www.hotmail.com')

WebUI.click(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/td_border-right'))

WebUI.setText(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/textarea_ctl00cph1Managements1'), 
    'yaraaaaaaab')

WebUI.setText(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (4)'), 
    'director')

WebUI.setText(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (5)'), 
    '44')

WebUI.click(findTestObject('managment (add new person)/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (6)'))

