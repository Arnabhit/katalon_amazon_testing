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

WebUI.click(findTestObject('Object Repository/Product_Cart_Test/product1/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Product_Cart_Test/product1/Page_Amazon Sign In/input_email'), '9798810632')

WebUI.click(findTestObject('Object Repository/Product_Cart_Test/product1/Page_Amazon Sign In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Product_Cart_Test/product1/Page_Amazon Sign In/input_password'), '9N/NeoNUwAmOpqY2L/5HEg==')

WebUI.click(findTestObject('Object Repository/Product_Cart_Test/product1/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/Product_Cart_Test/product1/Page_Online Shopping site in India Shop Onl_10c5f3/span_nav-cart-icon nav-sprite'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Product_Cart_Test/product1/Page_Amazon.in Shopping Cart/input_submit.delete.74e5e150-dfed-4ef6-9522_931099'))

WebUI.click(findTestObject('Object Repository/Product_Cart_Test/product1/Page_Amazon.in Shopping Cart/input_submit.delete.3c28bbc2-6709-40da-a37c_5ae046'))

WebUI.click(findTestObject('Object Repository/Product_Cart_Test/product1/Page_Amazon.in Shopping Cart/h1_Your Amazon Cart is empty'))

WebUI.closeBrowser()

