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

WebUI.setText(findTestObject('relation ship manager (add new company)/Page_z2data. Login/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('relation ship manager (add new company)/Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('relation ship manager (add new company)/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration/a_Data Manager'))

WebUI.click(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration/a_Relationship Manager'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/CompanyRelationshipsView.aspx?CompanyId=1000376')

WebUI.click(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/a_Add Company'))

WebUI.setText(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/input_ctl00cph1CompanyRelation'), 
    'ngom')

WebUI.setText(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/input_ctl00cph1CompanyRelation (1)'), 
    'http://www.sec.com')

WebUI.click(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/input_ctl00cph1CompanyRelation (2)'))

WebUI.focus(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/input_ctl00cph1CompanyRelation (3)'))

WebUI.setText(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/input_ctl00cph1CompanyRelation (3)'), 
    'ngom')

WebUI.setText(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/input_ctl00cph1CompanyRelation (4)'), 
    'http://www.hotmail.com')

WebUI.selectOptionByValue(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/select_ctl00cph1CompanyRelatio'), 
    '174', true)

WebUI.setText(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/input_ctl00cph1CompanyRelation (5)'), 
    'tamr')

WebUI.setText(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/input_ctl00cph1CompanyRelation (6)'), 
    '2001')

WebUI.click(findTestObject('relation ship manager (add new company)/Page_Z2DATA Web Administration (1)/input_ctl00cph1CompanyRelation (7)'))

