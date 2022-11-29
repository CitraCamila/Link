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

not_run: WebUI.callTestCase(findTestCase('03.2.1-Nasabah Bridaya Rekomendasi'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 1750, 500, 200)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Button_Lihat Detail'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Detail Nasabah'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Button_Back Detail Nasabah Rekomendasi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Ava_Nasabah'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Nama'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_NoHP'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Status Tindak Lanjut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Status Rekening Simpanan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Sisa OS DH'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Plafond Awal'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Sektor Ekonomi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Dropdown_Score'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Gambar_Score'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Keterangan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Dropdown_Informasi Personal'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Dropdown_Informasi Personal'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Tanggal Lahir'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Usia'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_No. Telepon'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Pekerjaan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Alamat Tempat Tinggal'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Alamat Usaha'), 
    0)

WebUI.scrollToElement(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Dropdown_Informasi Rekening'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Dropdown_Informasi Rekening'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Dropdown_Informasi Rekening'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_CIF'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Estimasi Penghasilan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Produk Pinjaman Saat Ini'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_RPC Tersisa'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Text_Terakhir Aktif'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Button_INPUT HASIL TINDAK LANJUT'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Button_Back Detail Nasabah Rekomendasi'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/Text_Nasabah BRIDaya'), 0)

Mobile.swipe(500, 1750, 500, 200)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/Button_Lihat Detail'))

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/01.Lihat Detail Rekomendasi/Button_INPUT HASIL TINDAK LANJUT'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

