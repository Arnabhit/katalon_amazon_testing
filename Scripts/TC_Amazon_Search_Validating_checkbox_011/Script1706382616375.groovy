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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/Login_Test/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Login_Test/Page_Amazon Sign In/input_email'), 'arnabbaruajsr@gmail.com')

WebUI.click(findTestObject('Object Repository/Login_Test/Page_Amazon Sign In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login_Test/Page_Amazon Sign In/input_password'), '9N/NeoNUwAmOpqY2L/5HEg==')

WebUI.click(findTestObject('Object Repository/Login_Test/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.setText(findTestObject('Object Repository/Vlidating_checkbox/Page_, , ,    - Amazon.in/input_Amazon.in_field-keywords'), 
    'mobiles')

WebUI.click(findTestObject('Object Repository/Vlidating_checkbox/Page_, , ,    - Amazon.in/input_Amazon.in_nav-search-submit-button'))

unchecked = WebUI.verifyElementNotChecked(findTestObject('Object Repository/Vlidating_checkbox/Page_Amazon.in  mobiles/i__a-icon a-icon-checkbox'), 
    0, FailureHandling.OPTIONAL)

if (unchecked == true) {
    System.out.println('element not checkeck')

    WebUI.check(findTestObject(''), 
        FailureHandling.OPTIONAL)

    System.out.println('element checkeck')
}

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.verifyElementChecked(findTestObject('Object Repository/Vlidating_checkbox/Page_Amazon.in  mobiles/span_Results'), 
    0, FailureHandling.OPTIONAL)

WebUI.closeBrowser('')

