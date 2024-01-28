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


WebUI.click(findTestObject('Object Repository/Searching_By_test_listener/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Searching_By_test_listener/Page_Amazon Sign In/input_email'), '9939230697')

WebUI.click(findTestObject('Object Repository/Searching_By_test_listener/Page_Amazon Sign In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Searching_By_test_listener/Page_Amazon Sign In/input_password'), 
    '8s2V7lLGyYQQCSyfcHxfaA==')

WebUI.click(findTestObject('Object Repository/Searching_By_test_listener/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.setText(findTestObject('Object Repository/Searching_By_test_listener/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'), 
    'mobile')

WebUI.click(findTestObject('Object Repository/Searching_By_test_listener/Page_Online Shopping site in India Shop Onl_10c5f3/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Searching_By_test_listener/Page_Amazon.in  mobile/img_s-image'))



