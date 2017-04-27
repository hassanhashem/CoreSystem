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

WebUI.setText(findTestObject('acquisitions/Page_z2data. Login/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('acquisitions/Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('acquisitions/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.click(findTestObject('acquisitions/Page_Z2DATA Web Administration/a_Data Manager'))

WebUI.click(findTestObject('acquisitions/Page_Z2DATA Web Administration/a_Acquisitions'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/CompanyAcquisitionsView.aspx?CompanyRelationId=1000376')

WebUI.click(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/div_tt-suggestion tt-cursor'))

WebUI.click(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/input_ctl00cph1AcquisitionView'))

WebUI.setText(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/input_ctl00cph1AcquisitionView (1)'), 'Symantec Corporation')

WebUI.click(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/div_13'))

WebUI.setText(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/input_ctl00cph1AcquisitionView (2)'), '4/13/2017')

WebUI.click(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/input_ctl00cph1AcquisitionView (3)'))

WebUI.click(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/div_27'))

WebUI.setText(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/input_ctl00cph1AcquisitionView (4)'), '4/27/2017')

WebUI.setText(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/input_ctl00cph1AcquisitionView (5)'), 'http://www.hotmail.com')

WebUI.setText(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/input_ctl00cph1AcquisitionView (6)'), '40')

WebUI.selectOptionByValue(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/select_ctl00cph1AcquisitionVie'), 
    '41', true)

WebUI.selectOptionByValue(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/select_ctl00cph1AcquisitionVie (1)'), 
    '26', true)

WebUI.selectOptionByValue(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/select_ctl00cph1AcquisitionVie (2)'), 
    '890', true)

WebUI.selectOptionByValue(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/select_ctl00cph1AcquisitionVie (3)'), 
    '364', true)

WebUI.click(findTestObject('acquisitions/Page_Z2DATA Web Administration (1)/input_ctl00cph1AcquisitionView (7)'))

