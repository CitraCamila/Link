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

WebUI.click(findTestObject('04.Profile Page/Button_Profile'))

WebUI.verifyElementPresent(findTestObject('04.Profile Page/Text_Profile'), 0)

WebUI.verifyElementPresent(findTestObject('04.Profile Page/Text_User Mantri BRIBrain'), 0)

WebUI.verifyElementPresent(findTestObject('04.Profile Page/Text_Mantri'), 0)

WebUI.verifyElementPresent(findTestObject('04.Profile Page/Text_Personal Number'), 0)

WebUI.verifyElementPresent(findTestObject('04.Profile Page/Text_Jenis Kelamin'), 0)

WebUI.verifyElementPresent(findTestObject('04.Profile Page/text_Unit'), 0)

WebUI.verifyElementPresent(findTestObject('04.Profile Page/Text_Cabang'), 0)

WebUI.verifyElementPresent(findTestObject('04.Profile Page/Text_Kantor Wilayah'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('04.Profile Page/Button_Log Out'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('04.Profile Page/Button Profile'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('04.Profile Page/Button_Home Tidak Aktif'), 0)

WebUI.click(findTestObject('04.Profile Page/Button_Log Out Profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('04.Profile Page/Pop_Up Keluar Dari Akun'), 0)

WebUI.verifyElementPresent(findTestObject('04.Profile Page/Button_Ya Profile'), 0)

WebUI.verifyElementPresent(findTestObject('04.Profile Page/Button_Batalkan Keluar Profile'), 0)

WebUI.click(findTestObject('04.Profile Page/Button_Batalkan Keluar Profile'))

WebUI.click(findTestObject('04.Profile Page/Button_Log Out Profile'))

WebUI.click(findTestObject('04.Profile Page/Button_Ya Profile'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('01.Landing Page/Text_Tingkatkan produktivitas tenaga pemasar dengan BRIBRAIN'), 
    0)

WebUI.delay(5)

