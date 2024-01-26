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

WebUI.click(findTestObject('Object Repository/Payment_option/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Payment_option/Page_Amazon Sign In/input_email'), '9798810632')

WebUI.click(findTestObject('Object Repository/Payment_option/Page_Amazon Sign In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Payment_option/Page_Amazon Sign In/input_password'), '9N/NeoNUwAmOpqY2L/5HEg==')

WebUI.click(findTestObject('Object Repository/Payment_option/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.setText(findTestObject('Object Repository/Payment_option/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'), 
    'mobile')

WebUI.click(findTestObject('Object Repository/Payment_option/Page_Online Shopping site in India Shop Onl_10c5f3/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Payment_option/Page_Amazon.in  mobile/img_s-image'))

WebUI.switchToWindowTitle('POCO C51 (Royal Blue, 6GB RAM, 128GB Storage) : Amazon.in: Electronics', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Payment_option/Page_POCO C51 (Royal Blue, 6GB RAM, 128GB S_6ad531/input_submit.add-to-cart'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Payment_option/Page_POCO C51 (Royal Blue, 6GB RAM, 128GB S_6ad531/aattach-close_sideSheet-link'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Payment_option/Page_POCO C51 (Royal Blue, 6GB RAM, 128GB S_6ad531/input_submit.buy-now'))

WebUI.click(findTestObject('Object Repository/Payment_option/Page_Select a Payment Method - Amazon.in Checkout/input_ppw-instrumentRowSelection'))

WebUI.click(findTestObject('Object Repository/Payment_option/Page_Select a Payment Method - Amazon.in Checkout/input_ppw-instrumentRowSelection_1'))

WebUI.click(findTestObject('Object Repository/Payment_option/Page_Select a Payment Method - Amazon.in Checkout/div_Net Banking'))

WebUI.click(findTestObject('Object Repository/Payment_option/Page_Select a Payment Method - Amazon.in Checkout/input_ppw-instrumentRowSelection_1_2'))

WebUI.closeBrowser()

