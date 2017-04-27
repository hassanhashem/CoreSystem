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

WebUI.setText(findTestObject('Page_z2data. Login/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('Page_Z2DATA Web Administration (3)/a_FINANCIAL DATA'))

WebUI.click(findTestObject('Page_Z2DATA Web Administration/a_Financial status'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/FinancialMapping/RawData.aspx?C=1000376&S=555851641')

WebUI.verifyElementPresent(findTestObject('Page_Z2DATA Web Administration (2)/a_Table Original Source'), 0)

WebUI.click(findTestObject('Page_Z2DATA Web Administration (2)/a_Table Original Source'))

WebUI.switchToWindowTitle('Z2DATA Web Administration')

WebUI.verifyElementPresent(findTestObject('Page_Z2DATA Web Administration (2)/a_Sheet Original Source'), 0)

WebUI.click(findTestObject('Page_Z2DATA Web Administration (2)/a_Sheet Original Source'))

WebUI.click(findTestObject('Page_Z2DATA Web Administration (2)/input_ng-pristine ng-untouched'))

WebUI.verifyElementPresent(findTestObject('Page_Z2DATA Web Administration (2)/a_Show Selected Data'), 0)

WebUI.click(findTestObject('Page_Z2DATA Web Administration (2)/a_Show Selected Data'))

WebUI.click(findTestObject('Page_Z2DATA Web Administration (2)/button_Close'))

WebUI.switchToWindowTitle('Z2DATA Web Administration')

WebUI.click(findTestObject('Page_Z2DATA Web Administration (9)/input_ng-pristine ng-untouched'))

WebUI.click(findTestObject('Page_Z2DATA Web Administration (9)/input_ng-pristine ng-untouched'))

WebUI.click(findTestObject('Page_Z2DATA Web Administration (9)/a_Show Selected Data'))

WebUI.click(findTestObject('Page_Z2DATA Web Administration (9)/button_Close'))

WebUI.click(findTestObject('Page_Z2DATA Web Administration (15)/input_toggle ng-pristine ng-un'))

WebUI.click(findTestObject('Page_Z2DATA Web Administration (15)/a_Add Itemization'))

WebUI.selectOptionByValue(findTestObject('Page_Z2DATA Web Administration (15)/select_Select3'), '1102', true)

WebUI.selectOptionByValue(findTestObject('Page_Z2DATA Web Administration (15)/select_Select4'), '2016', true)

WebUI.selectOptionByValue(findTestObject('Page_Z2DATA Web Administration (15)/select_itQrMonth'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Z2DATA Web Administration (15)/select_Select6'), 'Three', true)

WebUI.selectOptionByValue(findTestObject('Page_Z2DATA Web Administration (15)/select_ddl_itZid'), '9479677,11021030', true)

WebUI.click(findTestObject('Page_Z2DATA Web Administration (15)/button_Save'))

WebUI.click(findTestObject('Page_Z2DATA Web Administration (15)/button_OK'))

