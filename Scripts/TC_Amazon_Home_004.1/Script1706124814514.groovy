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

WebUI.openBrowser('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/Search/Page_Amazon Sign In/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Amazon Sign In/input_Email or mobile phone number_email'), '9798810632')

WebUI.click(findTestObject('Object Repository/Search/Page_Amazon Sign In/span_Continue'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Amazon Sign In/input_Forgot Password_password'), 'aRNAB@2002')

WebUI.click(findTestObject('Object Repository/Search/Page_Amazon Sign In/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/input_Search Amazon.in_field-keywords'), 
    'books sherlock holmes')

WebUI.click(findTestObject('Object Repository/Search/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/input_Search Amazon.in_nav-search-submit-button'))

WebUI.closeBrowser()

