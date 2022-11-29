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

not_run: WebUI.callTestCase(findTestCase('03.2-Nasabah Bridaya'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Button_Rekomendasi'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Input_Cari Nama Rekomendasi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Button_Search Rekomendasi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Text_Daftar Nasabah'), 0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Text_Nama'), 0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Text_NoHP'), 0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Text_Status Rekening Simpanan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Text_Sektor Ekonomi'), 0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Button_Hubungi'), 0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Button_Lihat Detail'), 0)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 250)

WebUI.delay(2)

WebUI.delay(2)

Mobile.swipe(500, 1750, 500, 200)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Text_Semua Data Sudah Ditampilkan Rekomendasi'), 
    0)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 450, 500, 1700)

WebUI.delay(2)

Mobile.swipe(500, 450, 500, 1700)

WebUI.delay(2)

Mobile.swipe(500, 450, 500, 1700)

WebUI.delay(2)

Mobile.swipe(500, 450, 500, 1700)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Text_Daftar Nasabah'), 0)

WebUI.delay(2)

