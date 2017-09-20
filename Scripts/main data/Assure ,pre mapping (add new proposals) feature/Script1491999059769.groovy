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

WebUI.setText(findTestObject('pre mapping (add proposals)/Page_z2data. Login/input_LoginFormUserName'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('pre mapping (add proposals)/Page_z2data. Login/input_LoginFormPassword'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('pre mapping (add proposals)/Page_z2data. Login/input_LoginFormLoginButton'))

WebUI.mouseOver(findTestObject('pre mapping (add proposals)/Page_Z2DATA Web Administration/a_Data Manager'))

WebUI.click(findTestObject('pre mapping (add proposals)/Page_Z2DATA Web Administration/a_Pre Mapping'))

WebUI.navigateToUrl('http://dev.z2data.com/administration/FinancialMapping/CompanyPreNonMapping.aspx?CompanyID=1000376&Type=1200150000&FillingDate=1/6/2017%2012:00:00%20AM&PeriodType=43')

WebUI.click(findTestObject('pre mapping (add proposals)/pre mapping (proposals/Page_Z2DATA Web Administration/a_Edit'))

WebUI.click(findTestObject('pre mapping (proposals/Page_Z2DATA Web Administration (1)/button_Statement Action'))

WebUI.click(findTestObject('pre mapping (proposals/Page_Z2DATA Web Administration (1)/button_Add New Proposal'))

WebUI.setText(findTestObject('pre mapping (proposals/Page_Z2DATA Web Administration (1)/input_txtZ2ProposalName'), 'yosif')

WebUI.selectOptionByValue(findTestObject('pre mapping (proposals/Page_Z2DATA Web Administration (1)/select_txtZ2ProposalOwner'), 
    '167922', true)

WebUI.selectOptionByValue(findTestObject('pre mapping (proposals/Page_Z2DATA Web Administration (1)/select_ddlZBoard'), 
    'Againest', true)

WebUI.selectOptionByValue(findTestObject('pre mapping (proposals/Page_Z2DATA Web Administration (1)/select_txtZRequiredVote'), 
    '210678', true)

WebUI.selectOptionByValue(findTestObject('pre mapping (proposals/Page_Z2DATA Web Administration (1)/select_ddlZProposalType'), 
    '84669', true)

WebUI.selectOptionByValue(findTestObject('pre mapping (proposals/Page_Z2DATA Web Administration (1)/select_ddlProposalStatus'), 
    '11599', true)

WebUI.click(findTestObject('pre mapping (proposals/Page_Z2DATA Web Administration (1)/button_Save'))

