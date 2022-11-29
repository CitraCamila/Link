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

not_run: WebUI.callTestCase(findTestCase('02-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03.Home Page/Button_Home'))

WebUI.verifyElementPresent(findTestObject('03.Home Page/Logo_Bribrain Home Page'), 0)

WebUI.verifyElementPresent(findTestObject('03.Home Page/Text_Selamat Datang,'), 0)

WebUI.verifyElementPresent(findTestObject('03.Home Page/Button_Rekomendasi Mitra Ultra Mikro2'), 0)

WebUI.verifyElementPresent(findTestObject('03.Home Page/Button_Nasabah BRIDaya2'), 0)

WebUI.verifyElementPresent(findTestObject('03.Home Page/Button_Home'), 0)

WebUI.verifyElementPresent(findTestObject('03.Home Page/Button_Profile Tidak Aktif'), 0)

WebUI.delay(5)

