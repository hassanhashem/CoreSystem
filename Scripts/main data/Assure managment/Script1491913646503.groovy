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

WebUI.setText(findTestObject('managment/Page_z2data. Login/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('managment/Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('managment/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('managment/Page_Z2DATA Web Administration/a_Data Manager'))

WebUI.click(findTestObject('managment/Page_Z2DATA Web Administration/a_Managements'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/ManagementsHome.aspx?CompanyRelationId=1000376')

WebUI.click(findTestObject('managment/Page_Z2DATA Web Administration (1)/div_tt-suggestion tt-cursor'))

WebUI.setText(findTestObject('managment/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man'), 'T. C. Leung')

WebUI.click(findTestObject('managment/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (1)'))

WebUI.click(findTestObject('managment/Page_Z2DATA Web Administration (1)/div_27'))

WebUI.setText(findTestObject('managment/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (2)'), '4/27/2017')

WebUI.selectOptionByValue(findTestObject('managment/Page_Z2DATA Web Administration (1)/select_ctl00cph1Managements1Ma'), 
    '289', true)

WebUI.setText(findTestObject('managment/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (3)'), 'http://www.yahoo.com')

WebUI.setText(findTestObject('managment/Page_Z2DATA Web Administration (1)/textarea_ctl00cph1Managements1'), 'biomedcail')

WebUI.setText(findTestObject('managment/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (4)'), 'director')

WebUI.setText(findTestObject('managment/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (5)'), '65')

WebUI.click(findTestObject('managment/Page_Z2DATA Web Administration (1)/input_ctl00cph1Managements1Man (6)'))

