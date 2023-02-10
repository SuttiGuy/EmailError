import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nxtgenaiacademy.com/demo-site/')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-5'), 'Suttiporn')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-7'), 'Kaewsakunnee')

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Gender_vfb-31'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Address_vfb-13address'), 
    '54 M.4 T.Wangyen')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Street Address_vfb-13address-2'), 
    '-')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Apt, Suite, Bldg. (optional)_vfb-13city'), 
    'Mueng')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_City_vfb-13state'), 
    'Nakhon Pathom')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_State  Province  Region_vfb-13zip'), 
    '73000')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-14'), '644259025@webmail.npru.ac.th')

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Date of Demo_vfb-18'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/a_10'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_Mobile Number_vfb-19'), 
    '0614294288')

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/span_Selenium WebDriver'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/textarea_Enter your query_vfb-23'), 
    'SleepNowwwww')

WebUI.setText(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input__vfb-3'), '99')

WebUI.click(findTestObject('Object Repository/Page_Demo Site  Registration Form  NxtGen A_68ffcd/input_This box is for spam protection - str_2dcb9b'))

WebUI.verifyTextPresent('Dynamic', false)

WebUI.takeScreenshot()

WebUI.closeBrowser()

